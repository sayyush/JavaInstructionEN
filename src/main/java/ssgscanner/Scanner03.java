package ssgscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        // Get first name, middle name, last name, SSN from user and then print it like below
        // Ali Mert Can
        //kkno:123456789
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = scanner.next();
        System.out.print("Enter middle name: ");
        String middleName = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();
        System.out.print("Enter SSN: ");
        String ssn = scanner.next();
        System.out.println(firstName + " " + middleName + " " + lastName);
        System.out.println("SSN: " + ssn);






    }
}
