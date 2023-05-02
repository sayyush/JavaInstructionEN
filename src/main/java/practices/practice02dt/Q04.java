package practices.practice02dt;

public class Q04 {
    public static void main(String[] args) {


        /*
        Create a String variable and find the sum of ASCII values of the first and the last characters of the String.
        String s= "Miami";
         */

        String s= "Miami";

        // bu hocanin yaptigi
        int AsciiFirst= s.charAt(0); //77
        int indexOfLastChar= s.length()-1; // 4
        int AsciiLast= s.charAt(indexOfLastChar); //105
        System.out.println("Total value of first and last characters: " + (AsciiFirst + AsciiLast));//182


        String s1 = "Miami";
      int asciiFirst = s1.charAt(0);
      int asciiLast = s1.charAt(s1.length() - 1);
      int sum = asciiFirst+asciiLast;
      System.out.println("Sum of ASCII values of first and last characters: " + sum);




    }
}
