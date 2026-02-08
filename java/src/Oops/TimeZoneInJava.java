package Oops;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.Date.*;

public class TimeZoneInJava {
    public static void main(String[] args) {

        Date date = new Date();
//        TimeZone time = new Time(TimeZone);

        Calendar cal = Calendar.getInstance();


        System.out.println(cal.getTime());

        LocalTime start = LocalTime.now();
        LocalTime end = start.plusHours(3);

        Duration duration = Duration.between(start, end);

        System.out.println("Hours: " + duration.toHours());

//        System.out.println(date);
    }
}
