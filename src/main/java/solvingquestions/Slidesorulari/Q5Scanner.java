package solvingquestions.Slidesorulari;

import java.util.Scanner;

public class Q5Scanner {
    public static void main(String[] args) {


       /*
        9)Type a program which asks user to enter his/her first name and last name,
                then print it on the console.
                Hint: To get String, use nextLine()
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name...");
        String firstName =input.nextLine();
        System.out.println("Enter your last name...");
        String lastName = input.nextLine();

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);



     /*
        10) Type a program which asks user to enter his/her full name, and address
        then print them on the console like the full name should be in the first line,
        and the address will be in the second line.
                Hint: To get String, use nextLine()
     */

        System.out.println("Enter your full name please...");
        String fullName= input.nextLine();
        System.out.println("Enter your address please...");
        String address = input.nextLine();

        System.out.println("Your full name is: " + fullName + "\nadress is: " + address);



        // ****** son 2 soruda sorun var kontrol et *******



    }
}
