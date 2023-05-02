package solvingquestions.Slidesorulari;

import java.util.Scanner;

public class Q2Scanner {
    public static void main(String[] args) {

     /* 1.
     Type a program which calculates the area and the perimeter of a square
      whose side length is entered by user.
      Hint 1: Area of a square is length x length
      Hint 2: Perimeter of a square is 4x length
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter length of a square...");
        double length1 = input.nextDouble();

        System.out.println("Area of a square is: " + (length1*length1));
        System.out.println("Perimeter of a square is: " + (4*length1));



      /* 2.
      Type a program which calculates the cube of a number which is entered
      by user.
      Hint 1: Cube of a number is a x a x a
      */
        System.out.println("Please, enter one number...");
        int cubeOfNum= input.nextInt();
        System.out.println("Cube of a number is: " + (cubeOfNum*cubeOfNum*cubeOfNum));




        /* 3.
        Type a program which calculates the area and the perimeter of a rectangle
        whose length and width are entered by user.
       Hint 1: Area of a rectangle is width x length
       Hint 2: Perimeter of a rectangle is 2x (width + length)

         */
       System.out.println("Enter width of a rectangle...");
        double width = input.nextDouble();
        System.out.println("Enter length of a rectangle...");
        double length = input.nextDouble();


        System.out.println("Area of a rectangle is: " + (width * length));
        System.out.println("Perimeter of a rectangle is: " + (2 * (width * length)));

    }
}
