package day17methodoverloading_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeDenemeSH {

    public static void main(String[] args) {

        //   ***** To get local date, time , date and time ********

        // Type code to get current date & current time
        Date currentDate = new Date();
        System.out.println(currentDate);// Sat Jan 28 12:31:37 EET 2023

        System.out.println("currentDate.getTime() = " + currentDate.getTime()); // 1674898506870 millisecond,  digital history starts on January 1st in 1970
        // Millisecond value is unique                                                                       // Milliseconds from" January 1st 1970 "to the "current time".
        // getTime() method gives you unique data every time
        // For example: In the university there are 5 students in the same name, we should use getTime() to get unique ID for each students.

        // Type code to current time in your local area
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime); // 12:40:51.491457700(last one is nanosecond) ==> current time: Hours:Minutes:Seconds: Nanoseconds

        // Type code to get current date in your local area
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate); // 2023-01-28

        // Type code to get current date and current time in your local area
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime); // 2023-01-28T12:46:25.787497600   after date there is "T" stands for starting time


        // ****** to get specific component by using methods  **********

        // How to get a specific component from date and time
        System.out.println("myDate.getMonthValue() = " + myDate.getMonthValue());// 1
        System.out.println(myDate.getMonth());//  JANUARY
        System.out.println(myDate.getDayOfWeek());// SATURDAY


        // ******* Baska ulkelerin date and time *****

        // How to get time in another time zone
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Ashgabat"))); // 2023-01-28T15:18:03.743066
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Baku")));// 2023-01-28T14:18:27.921530100
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Istanbul")));//2023-01-26T21:03:59.275245800
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo"))); // 2023-01-28T19:13:49.585008500


        // ******** To g0 future and past in date and time *************

        // How to go future and past in date and time

        System.out.println(myDate.plusYears(3).plusMonths(4).plusDays(12)); // 2026-06-09  FUTURE

        System.out.println(myTime.minusHours(3).minusMinutes(20)); // 10:04:32.949216200  PAST


        // ********* Comparing  ************

        // How to compare two dates  (of() is creating an object by using those values(year,month,dayOfMonth) ) (isBefore(), isAfter(), isEqual())

        LocalDate fistKidDob = LocalDate.of(2005, 8, 23);
        LocalDate secondKidDob = LocalDate.of(2011, 3, 11);


        boolean isFirstKidAfter = fistKidDob.isAfter(secondKidDob);
        System.out.println(isFirstKidAfter); // false

        boolean isFirstKidBefore = fistKidDob.isBefore(secondKidDob);
        System.out.println(isFirstKidBefore); // true

        boolean isFirstKidEqualsToSecondKid = fistKidDob.isEqual(secondKidDob);
        System.out.println(isFirstKidEqualsToSecondKid); //false



     // How to format Date Time

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MMM:yyyy");
        String formattedDate = dtf.format(myDate);

        // d --> 1,2,3, ......31
        // dd--> 01,02,03.......31
        // M--> 1,2,3,.......10,11,12
        // MM--> 01,02,03........10,11,12
        // MMM --> Jan,Feb,Mar.......Dec,
        // MMMM--> January,February,......
        // yy--> 23(just 2 last digits of the year value)
        // yyyy --> 2023 (whole year value)
        System.out.println(formattedDate);

        //How to format Time
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss a"); // 18:24 PM

        // HH --> 24 hours system
        //hh --> 12 hours system
        // After time pattern leave a space put "a" it put AM or PM next to the time value
        // ss --> second
        String formattedTime =dtf2.format(myTime);
        System.out.println(formattedTime);//18:23











    }
}
