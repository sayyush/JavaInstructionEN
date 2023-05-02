package practices.practice02dt;

public class Q01 {
    public static void main(String[] args) {
        //Type code to check if a String does not have any space character at the beginning and at the end
        //Example==> ' Ali ' should print false on the console
        //            'Ali' should print true on the console

        String str= "      Tom     ";
        String trimmedString= str.trim();
        System.out.println(trimmedString);
        boolean result= str.equals(trimmedString);

        System.out.println("Is there any space at the beginning and at the end? " + result);//false
        System.out.println("Is there any space at the beginning and at the end? " + !result);//true



    }
}
