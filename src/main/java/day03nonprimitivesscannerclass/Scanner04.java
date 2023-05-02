package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

         /*
            Type a program which calculates the volume of a rectangular prism
            whose length, width, and height are entered by user.
            Hint 1: Volume of a rectangular prism is width x length x height
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your length...");
        double length = input.nextDouble();

        System.out.println("Enter your width...");
        double width = input.nextDouble();

        System.out.println("Enter your  height ...");
        double height = input.nextDouble();

        System.out.println("Volume of a rectangular prism is: " + (width * length * height));



    }
}

