package day05stringmanipulations;

public class StringManipulations03SH {
    public static void main(String[] args) {

        //Example 1: Type code to check if the seventh character of a given String is "a"

        String s= "Alabama State";



        // 1. Way:
       boolean result1 =  s.charAt(6)=='a'; // There are 2 tasks for Java
        System.out.println("Is the seventh character a? " +result1); // true


        // 2. Way:
       boolean result2 = s.startsWith("a" , 6); // There is 1 task for Java
                                                            // offset(skip first six characters, at gitsin demek)
        System.out.println("Is the seventh character a? " +result2); //true



        //Example: Type code to check if a String is ending with "money" or not


        String t = "Learn Java earn money";

        // 1.Way:
      // length()-1 ==> Index of last character

       boolean result3  = t.substring(t.length()-5).equals("money");
        System.out.println(result3);








    }
}
