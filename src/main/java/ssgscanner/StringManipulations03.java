package ssgscanner;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        // get the user's name-surname information
        // let's make all the letters to  *

        Scanner input= new Scanner(System.in);
        System.out.println("Please Enter the first Name and  surname");
        String nameSurname= input.nextLine();

       String result = nameSurname.replaceAll("\\S","*");
        System.out.println(nameSurname);
        String r1= nameSurname.replaceAll("[^0-9]","*");
        System.out.println(r1);


        // 2.way
        String result1 = nameSurname.replaceAll("[^0-9]", "*");
        System.out.println(result1);

    }
}
