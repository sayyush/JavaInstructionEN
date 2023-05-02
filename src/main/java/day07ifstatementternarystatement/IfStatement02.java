package day07ifstatementternarystatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {


        // Example 1: Get user's age
        //            0-4 ==> baby
        //            5-12==> kids
        //            13-19==> teenager
        //            20-30==> adult
        //            others ==> Undefined
        //            Negative ages==> Invalid age

        // YUKARIDAKILERI YAZARKEN HER ZAMAN SIRAYLA YAZMALI: invalid age>baby>kid>teen>adult>undefined

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age...");
        byte age = input.nextByte();

        if(age<0){
            System.out.println("Invalid age...");
        }else if(age<5){
            System.out.println("Baby");
        }else if(age<13){
            System.out.println("Kids");
        } else if (age<20) {
            System.out.println("Teenager");
        } else if (age<31) {
            System.out.println("Adult");
        }else{
            System.out.println("Undefined");
        }
    }
}
