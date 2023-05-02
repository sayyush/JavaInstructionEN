package ssgscanner;

public class IfStatements02 {

    public static void main(String[] args) {


        int a=10;
        int b= 20;

        if (a>b && b<100){
            System.out.println("your wish will come true");
            System.out.println("All codes inside  body work");
        }

        if (a<0)
            System.out.println("only one line works without the curly braces");

        // if you want an if statement to be more understandable
        // you have to write the if body in {}
        // If we don't write the body in {}, the if statement works
        // but first; when you see the if statement is finished



    }

}
