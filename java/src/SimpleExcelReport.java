import java.sql.*;
import java.io.*;

public class SimpleExcelReport  {

    public static void main(String[] args) {

        try {
            // ✅ 1. Start SSH Tunnel
            Process sshProcess = startSSHTunnel();

            // wait for tunnel to be ready
            Thread.sleep(8000);

            // ✅ 2. DB Connection via Tunnel
            String url = "jdbc:postgresql://localhost:5433/mediation";
            String user = "mohit.misra";
            String password = "mohit@#2025_LD";

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ DB Connected");

            // ✅ 3. Your FULL Query
            String query =
                    "WITH base AS ( " +
                            " SELECT date_utc, hour_utc, country, " +
                            " COALESCE(tl1.name, entity::text) AS entity, " +
                            " COALESCE(tl2.name, txn_type::text) AS txn_type, " +
                            " SUM(todaySuccess) AS todaySuccess, " +
                            " SUM(todayFailures) AS todayFailures, " +
                            " SUM(yesterdaySuccess) AS yesterdaySuccess, " +
                            " SUM(yesterdayFailures) AS yesterdayFailures, " +
                            " SUM(weekSuccess) AS weekSuccess, " +
                            " SUM(weekFailures) AS weekFailures " +
                            " FROM ( " +

                            // TODAY
                            " SELECT DATE(td.created_at AT TIME ZONE 'utc') AS date_utc, " +
                            " EXTRACT(HOUR FROM td.created_at AT TIME ZONE 'utc') AS hour_utc, " +
                            " td.country, td.entity, td.txn_type, " +
                            " COUNT(CASE WHEN td.error_code IN ('0') THEN 1 END) AS todaySuccess, " +
                            " COUNT(CASE WHEN td.error_code NOT IN ('0','20032','20034') THEN 1 END) AS todayFailures, " +
                            " 0,0,0,0 FROM transaction_details td " +
                            " WHERE td.entity IN ('3001','3002') " +
                            " AND DATE(td.created_at AT TIME ZONE 'utc') = CURRENT_DATE " +
                            " AND td.txn_type NOT IN ('2006','2005') " +
                            " GROUP BY 1,2,3,4,5 " +

                            " UNION ALL " +

                            // YESTERDAY
                            " SELECT CURRENT_DATE, EXTRACT(HOUR FROM td.created_at AT TIME ZONE 'utc'), " +
                            " td.country, td.entity, td.txn_type, " +
                            " 0,0, " +
                            " COUNT(CASE WHEN td.error_code IN ('0') THEN 1 END), " +
                            " COUNT(CASE WHEN td.error_code NOT IN ('0','20032','20034') THEN 1 END), " +
                            " 0,0 FROM transaction_details td " +
                            " WHERE td.entity IN ('3001','3002') " +
                            " AND DATE(td.created_at AT TIME ZONE 'utc') = CURRENT_DATE - INTERVAL '1 day' " +
                            " AND td.txn_type NOT IN ('2006','2005') " +
                            " GROUP BY 2,3,4,5 " +

                            " UNION ALL " +

                            // LAST WEEK
                            " SELECT CURRENT_DATE, EXTRACT(HOUR FROM td.created_at AT TIME ZONE 'utc'), " +
                            " td.country, td.entity, td.txn_type, " +
                            " 0,0,0,0, " +
                            " COUNT(CASE WHEN td.error_code IN ('0') THEN 1 END), " +
                            " COUNT(CASE WHEN td.error_code NOT IN ('0','20032','20034') THEN 1 END) " +
                            " FROM transaction_details td " +
                            " WHERE td.entity IN ('3001','3002') " +
                            " AND DATE(td.created_at AT TIME ZONE 'utc') = CURRENT_DATE - INTERVAL '7 day' " +
                            " AND td.txn_type NOT IN ('2006','2005') " +
                            " GROUP BY 2,3,4,5 " +

                            " ) dt " +
                            " LEFT JOIN transaction_lookup tl1 ON dt.entity::text = tl1.code::text " +
                            " LEFT JOIN transaction_lookup tl2 ON dt.txn_type = tl2.code " +
                            " GROUP BY date_utc, hour_utc, country, tl1.name, tl2.name, entity, txn_type " +
                            " ) " +
                            " SELECT * FROM base ORDER BY date_utc, hour_utc";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // ✅ 4. Generate Excel (.xls)
            FileWriter writer = new FileWriter("report.xls");

            writer.write("<html><body><table border='1'>");

            ResultSetMetaData meta = rs.getMetaData();
            int colCount = meta.getColumnCount();

            // Header
            writer.write("<tr>");
            for (int i = 1; i <= colCount; i++) {
                writer.write("<th>" + meta.getColumnName(i) + "</th>");
            }
            writer.write("</tr>");

            // Data
            while (rs.next()) {
                writer.write("<tr>");
                for (int i = 1; i <= colCount; i++) {
                    writer.write("<td>" + rs.getString(i) + "</td>");
                }
                writer.write("</tr>");
            }

            writer.write("</table></body></html>");
            writer.close();

            conn.close();

            System.out.println("🎯 REPORT GENERATED: report.xls");

            // OPTIONAL: stop SSH
            // sshProcess.destroy();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ SSH Tunnel Method
    public static Process startSSHTunnel() throws IOException {

        String command = "ssh -L 5433:prod-lyca-dt-falcon.cft7chxzs2i5.us-west-1.rds.amazonaws.com:5432 "
                + "monitoring-team@54.241.23.3 -N";

        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", command); // Windows
        pb.redirectErrorStream(true);

        Process process = pb.start();

        System.out.println("🚀 SSH Tunnel Started");

        return process;
    }
}