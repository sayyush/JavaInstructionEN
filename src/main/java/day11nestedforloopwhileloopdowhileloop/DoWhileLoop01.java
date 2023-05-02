package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

     // Example 1 : What is the difference between "while"  and "do-while" loops?   INTERVIEW QUESTIONS

     // while-loop: Zero execution is possible
     int i = 1;
     // while ilk once dusunuyor sonra calisiyor
     while(i<1){ // 1<1==false o yuzden konsolda hicbirsey yazmiyor
         System.out.println("I am while loop"); // nothing
         i++;
     }
      // do-while loop: Zero execution is impossible, loop body will be executed at least once.
        // ilk once calisiyor sonra dusunuyor
        int k = 1;
       do{
           System.out.println("I am do-while loop"); //I am do-while loop
         k++;
       }while(k<1);


       /*
      Ask user to enter an integer.
      If the integer is less than 100, tell user "Won!"
      Otherwise, tell user "Lost!"
      */

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter an integer to play...");
            int num= input.nextInt();
            if(num<100){
                System.out.println("You won!");
            }else{
                System.out.println("You lost");
                break;
            }
        }while(true);

    }
}
