package sorubankasorulari;

import java.util.Arrays;
import java.util.Scanner;

public class Deneme01 {
    public static void main(String[] args) {
        //BU SORUYU ANLAMAK LAZIM  WHICH ONE IS TRUE

       /*

       9. String s = "Java is Java";
Which one is true?
A) System.out.println(s.indexOf('a'));
prints 2 on the console
B) System.out.println(s.indexOf("Java"));
prints 0 on the console
C) System.out.println(s.indexOf('a', 4));
prints 10 on the console
D) System.out.println(s.indexOf("va", 2));
prints 10 on the console

        */
      /*Scanner input= new Scanner(System.in);
        System.out.println("Enter your gender");
       String gender= input.next();
        System.out.println("Enter your age");
       int age= input.nextInt();
        if(gender.equals("male")) {
            if(age<20) {
                System.out.println("Boy");
            }else {
                System.out.println("Man");
            }
        }else if(gender.equals("female")) {
            if(age<20) {
                System.out.println("Girl");
            }else {
                System.out.println("Woman");
            }
        }else {
            System.out.println("There is no any definition for other genders");
        }
*/


        String str = "Cok calis, mutevazi ol";
        String strArray[] = str.split("X");
        System.out.println(Arrays.toString(strArray));
























    }
}
