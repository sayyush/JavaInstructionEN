package ssgscanner;

import java.util.Scanner;

public class IfStatements04 {

    public static void main(String[] args) {


        //Question 3) Get the day name from the user and print whether it is weekday or weekend
        // Example: day=Sunday output = “Weekend”
        // day=Tuesday output = “Weekday”
        // *** Use equals method for String

        // if sunday or saturday ===> weekend
        // if monday or tuesday or wednesday or thursday or friday ==> weekday


        // String is case sensitive
        // so Sunday, SUNDAY, SUNDAY, SUNDAY these are all different words

        // in this case we get help from String methods

        Scanner scan= new Scanner(System.in);
        System.out.println("Please write the name of the day");
        String dayName=scan.next(); // Whatever the user writes, we convert it to lowercase

        // Using == in string expressions is not recommended
        // Because it might give different results than we expected

        if (dayName.equals("Sunday") || dayName.equals("Saturday")){
            System.out.println("The day you entered is a weekend");
        }

        if (dayName.equals("Monday") || dayName.equals("Tuesday") ||
                dayName.equals("Wednesday")||dayName.equals("Thursday") ||
                dayName.equals("Friday")){
            System.out.println("The day you entered, on the day of the week");
        }


    }
}
