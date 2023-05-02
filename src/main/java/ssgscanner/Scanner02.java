package ssgscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

// write a program that calculates the volume of a rectangular prism with length, width, height
        // Hint: the volume of the rectangle= width*height*length;
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
