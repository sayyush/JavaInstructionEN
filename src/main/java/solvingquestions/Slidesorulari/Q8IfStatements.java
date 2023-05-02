package solvingquestions.Slidesorulari;

import java.util.Scanner;

public class Q8IfStatements {

    public static void main(String[] args) {

        // Soru 1 : Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz...");
        int sayi = input.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Cift sayidir...");
        }

        if (sayi % 2 != 0) {
            System.out.println("Tek sayidir...");
        }


       /*
       Soru 2 : Type java code by using if statement. When you enter the initial of the day of a week,
                output should be all possible names of the days.
                For example; if the initial is ’S’ output should be “Saturday or Sunday”
      */


                                                                           // String initial = sc.nextLine().toLowerCase();
                                                                          //if (initial.equals("m"))
        System.out.println("Enter the initial of the day of a week");    //  System.out.println("Monday")
        String initial = input.next().toUpperCase();
        if (initial.equals("S")) {
            System.out.println("Saturday");
            System.out.println("Sunday");
        } else if (initial.equals("M")) {
            System.out.println("Monday");
        } else if (initial.equals("T")) {
            System.out.println("Tuesday");
            System.out.println("Thursday");

        } else if (initial.equals("W")) {
            System.out.println("Wednesday");
        } else if (initial.equals("F")) {
            System.out.println("Friday");
        } else {
            System.out.println("Invalid initials. Please try again");
        }




     /*
        Soru 3 : Type java code by using if statement. When you enter the name of the day of a week,
                output will be “Weekday” or “Weekend day” according to the name of the day
     */

        System.out.println("Enter the name of the day of a week");
        String name = input.next().toLowerCase();
        if (name.equals("monday") || name.equals("tuesday") || name.equals("wednesday") || name.equals("thursday") || name.equals("friday")) {
            System.out.println("Weekday");
        } else if (name.equals("saturday") || name.equals("sunday")) {
            System.out.println("Weekend day");
        } else {
            System.out.println("Invalid name. Please try again.");

        }
    }}

























