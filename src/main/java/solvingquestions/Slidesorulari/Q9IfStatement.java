package solvingquestions.Slidesorulari;

import java.util.Scanner;

public class Q9IfStatement {

    public static void main(String[] args) {


        // hatalar var

       /* Ask user to enter annual salary, if the salary is more than or equal
        to $80.000 output will be “I accept the offer”, if the salary is between
        $60.000 and $80.000 out put will be “I negotiate to increase”,
        otherwise output will be "I do not accept the offer".

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual salary");

        int salary = input.nextInt();
        if (salary >= 80000) {
            System.out.println("I accept the offer");
        } else if (salary > 60000 || salary < 80000) {
            System.out.println("I negotiate to increase");
        } else {
            System.out.println("I do not accept the offer");

        }




























    }
}
