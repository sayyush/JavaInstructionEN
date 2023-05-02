package solvingquestions.Slidesorulari;

import java.util.Scanner;

public class Q3Scanner {
    public static void main(String[] args) {


      /* 4) Type a program which calculates the volume of a rectangular prism
        whose length, width, and height are entered by user.
                Hint 1: Volume of a rectangular prism is width x length x height
      */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length, width,height...");
        double length = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();

        System.out.println("Volume of a rectangular prism is: " + (width * length * height)); // Volume of a rectangular prism is: 15985.431


       /* 5)Type a program which calculates the area and the perimeter of a circle
        whose radius is entered by user. (Use float)
        Hint 1: Take pi number as 3.14159
        Hint 2: Area of a circle is 3.14159 x radius x radius
        Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
        Hint 4: To get float, use nextFloat()
       */

        System.out.println("Enter radius of the circle, please...");
        float radius = input.nextFloat();
        float pi = 3.14159f;
        System.out.println("Area of a circle is: " + (pi * radius * radius));
        System.out.println("Perimeter of a circle is: " + (2 * pi * radius));


     /*    6) Type a program which calculates the perimeter of a triangle whose
        Side lengths are entered by user. (Use byte)
        Hint 1: Perimeter of a triangle is a + b + c
        Hint 2: To get byte, use nextByte()
     */
        System.out.println("Enter the side lengths of the triangle: ");

        byte a = input.nextByte(); // reads the first side length
        byte b = input.nextByte(); // reads the second side length
        byte c = input.nextByte(); // reads the third side length

        System.out.println("The perimeter of the triangle is: " + (a+b+c));


    }
}
