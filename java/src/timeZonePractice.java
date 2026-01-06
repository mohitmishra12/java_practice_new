import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class timeZonePractice {
    public static void main(String[] args) {

        LocalTime timer = LocalTime.now();
        LocalDateTime dateandtime = LocalDateTime.now();
        System.out.println(timer);
        System.out.println(dateandtime);

        DateFormat dateFormat = DateFormat.getDateInstance(); // default
        dateFormat.setLenient(false); // strict parsing
    }
}
