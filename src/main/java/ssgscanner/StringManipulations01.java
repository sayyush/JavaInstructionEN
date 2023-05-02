package ssgscanner;

import java.sql.SQLOutput;

public class StringManipulations01 {

    public static void main(String[] args) {


 /*
       Question 1) Write a Java code that compares two entered String data.
        */

        String str="JAVA";
        String str2="java";
       boolean s = str.equals(str2);
        System.out.println(s);// false

        System.out.println(str.equalsIgnoreCase(str2));











    }
}
