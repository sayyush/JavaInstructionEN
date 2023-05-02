package solvingquestions.Slidesorulari;

import java.util.Scanner;

public class Q4Scanner {
    public static void main(String[] args) {
         /*
        7) Type a program which converts the mile to kilometer. Mile value will be
        entered by user. (Use double)
        Hint 1: km = mile x 1.6
        Hint 2: To get double, use nextDouble()
      */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value in miles...");
        double miles = input.nextDouble();
        double kilometers = miles * 1.6;

        System.out.println(miles + " miles is equal to " + kilometers + " kilometers."); // 45.67 miles is equal to 73.072 kilometers.
        System.out.println("Converting mile to kilometer is: " + (miles*1.6));  // Converting mile to kilometer is: 73.072


     /*
        8) Type a program which converts the hours to seconds. Hours value will be
        entered by user. (Use long)
        Hint 1: second = hour x 60 x 60
        Hint 2: To get long, use nextLong()
     */


        System.out.println("Enter hours value ...");
       long hours = input.nextLong();
        long seconds = hours*60*60;

        System.out.println(hours + " hours are equal to " + seconds + " seconds.");

    }
}
