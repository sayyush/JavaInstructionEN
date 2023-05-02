package ssgscanner;

import java.util.Scanner;

public class IfElse02 {

    public static void main(String[] args) {
        // Question 2) Ask the user for a score of more than 100.
        // Convert the note to character system and print it.
        // "D" if less than 50,
        // =50 <60 "C",
        // =60 <80 between "B",
        // "A" if greater than 80;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Grade");

        double grade= scan.nextDouble();

        if(grade<0 || grade>100){
            System.out.println("Please enter a valid point");
        }
        else if (grade<50){
            System.out.println("Your grade is D");
        } else if (grade<60){
            System.out.println("Your grade is C");
        } else if(grade<80){
            System.out.println("Your grade is B");
        }else {
            System.out.println("Your grade is A");
        }

}}
