package ssgscanner;

public class IfElse {

    public static void main(String[] args) {


        // If we have a daily class, I can attend

        // If we have a night class, I can attend it


        boolean dt = false; //  available
        boolean nt = true; // Not available

        //true || true   => true

        //false || true  => true

        //true || false  => true

        //false  || false => false
        //boolean isAvilable = dt||nt;

        if(dt|| nt){
            System.out.println("you can join the Class");
        }
        if(dt|| nt){
            System.out.println("You can  not Join the CLass");
        }




    }
}
