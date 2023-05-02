package day27enumexceptions;

public class E01 {
    /*
       1)Exception means "unexpected issue" in coding
       2)When we have exception we have two ways
           i)We can handle the exception by using "try-catch block"
           ii)We "Throw Exception" and block the app
       3)We handle the exception mostly, if you don't handle the exception
           i)Execution will be stopped
           ii)App will be blocked
    */
    public static void main(String[] args) {

        System.out.println(divide1(6, 5));
        System.out.println(divide1(0, 5));
        System.out.println(divide1(6, 0));//ArithmeticException

        System.out.println("Hi this is me!");//(divide(6, 0) threw ArithmeticException that's why this code cannot be executed
        //when you break any mathematical rule Java throws exception

        System.out.println(divide2(8, 0));
    }

    //Example 1: Create a method divides two doubles

    //1.way:use if else, but it is not recommended
    public static int divide1(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    //2.way:use try-catch
    public static int divide2(int a, int b) {
        int result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException e) {//"catch block" is executed just for exceptions, if "try block" doesn't throw any exception
            //"catch block will not be executed

            System.out.println("Do not use zero divisor...");
        }
        return result;
    }
}
