package ssgscanner;

public class StringManipulations04 {

    public static void main(String[] args) {

 /* question 4) Create 3 String variables for the names of the people. 3 names excluding spaces
        Print the sum of the number of characters without Space.
        */

        // 1.way
        String name1="ahmet furkan";
        String name2="ömer faruk";
        String name3="ayse nur";
        int a = name1.replaceAll("\\s","").length();
        int b = name2.replaceAll("\\s","").length();
        int c = name3.replaceAll("\\s","").length();
        System.out.println("all characters: " + (a + b + c));



        // 2.way
        String name = "Kerem Caglar";
        String name0 = "Ayca Guler";
        String name00= "Hasan Savas";
        int numOfChar1 = name.replace(" ", "").length();
        int numOfChar2 = name0.replace(" ", "").length();
        int numOfChar3 = name00.replace(" ", "").length();
        System.out.println("Total = " + (numOfChar1+numOfChar2+numOfChar3));

        // 3.way
        System.out.println(name1.concat(name2).concat(name3).replaceAll("\\s", "").length());



    }
}
