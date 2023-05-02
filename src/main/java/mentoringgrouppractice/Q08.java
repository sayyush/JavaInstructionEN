package mentoringgrouppractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q08 {

    //Example 1: Check the password if it has given rules.
    //           i)It should start with "J"
    //           ii)It should have at least 8 characters
    //           iii)Last 3 characters should be "AVA"
    public static void main(String[] args) {

    String pwd = "J123!?AVA";

    boolean first = pwd.startsWith("J");
        System.out.println(first);
   boolean numOfChar =  pwd.length()>7;
        System.out.println(numOfChar);

boolean last = pwd.substring(pwd.length()-3).equals("AVA");
        System.out.println(last);

    }}






