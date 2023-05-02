package ssgscanner;

import java.util.Scanner;

public class ArithmaticOperation {

    public static void main(String[] args) {
        // ask from user enter 2 integer  and do all AR Operation .


        Scanner input= new Scanner(System.in);

        System.out.println("Please Enter num1");
        int num1=input.nextInt();

        System.out.println("Please Enter num2");
        int num2=input.nextInt();
        // num1=12; num2=12;

        System.out.println("sum of num1  and num2 :"+ (num1+num2+(3+6)));//33
        System.out.println(num1/num2*(2+6));
        System.out.println(num1*num2);
        System.out.println(num1%num2);

        System.out.println(4*5/3+3-2);//7


    }
}
