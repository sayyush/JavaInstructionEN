package ssgscanner;

import java.util.Scanner;

public class IfElse01 {

    public static void main(String[] args) {

        // Let's find out if an input character is a letter or not


        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter a Charterer ");
        char  charterer =scan.next().charAt(0);

        if ((charterer>='A' && charterer<='Z')  || (charterer>='a' && charterer<='z')){

            System.out.println("Your Enter Charter is Letter");
        } else {
            System.out.println("Your Enter Charter is not  Letter");
        }

}}
