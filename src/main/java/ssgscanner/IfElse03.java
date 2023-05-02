package ssgscanner;

import java.util.Scanner;

public class IfElse03 {

    public static void main(String[] args) {
        // ask the user for two numbers,
        // If both numbers are positive, print the sum of the numbers,
        // If both numbers are negative, print the product of the numbers,
        // If two numbers have different signs
        // print "You cannot work with numbers with different signs",
        // If either number is zero, print "Zero is the element absorbed by multiplication."
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter 2 Numbers");

        double num1=scan.nextDouble();
        double num2=scan.nextDouble();


        if (num1>0 && num2>0){
            System.out.println("two numbers you entered are positive, their sum =" +
                    (num1+num2));
        } else if (num1<0 && num2<0){
            System.out.println("two numbers you entered are different sign , their product = " +
                    (num1*num1));
        } else if (num1*num2<0){
            System.out.println("You cannot work with numbers with different signs.");
        } else {
            System.out.println("Zero is the absorbing element with respect to impact");
        }
}}
