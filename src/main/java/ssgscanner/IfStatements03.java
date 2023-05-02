package ssgscanner;

import java.util.Scanner;

public class IfStatements03 {


    public static void main(String[] args) {

        // Question 1) Ask the user for an integer // and print whether the number is odd or even

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter an Integer number");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Enter number is EVEN");
        }

        if (num % 2 != 0) {
            System.out.println("Enter Number IS ODD");
        }

        // normally an integer is either odd or even, there is no third case
        // then it's odd and even, not two separate ifs
        // It would be better to do it in a single statement with if else
        // ========= solution with if else========

        if (num % 2 == 0) {
            System.out.println("Entered number is EVEN");
        } else {
            System.out.println("Entered number is ODD");
        }

    }}
