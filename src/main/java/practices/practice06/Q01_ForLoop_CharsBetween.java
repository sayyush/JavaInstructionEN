package practices.practice06;

import java.util.Scanner;

public class Q01_ForLoop_CharsBetween {

    public static void main(String[] args) {

//       int x = 'A'+02;
//       System.out.println(x);
//       System.out.println((int)'a');  a'nin Asciini veriyor
//        System.out.println(""+"A"+1);

//
//        for (int i = '1'; i < '5'; i++) {
//            System.out.print(i + " ");// 49 50 51 52  ascii values
//             }
//
//        for (int i = '1'; i < '5'; i++) {
//            System.out.print((char)i + " "); // 1 2 3 4
//             }


        //Ask user to enter 2 chars and print on console the chars between them.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first char");
//        char char1 = input.next().charAt(0);
//
//
//        System.out.println("Enter second char");
//        char char2 = input.next().charAt(0);
//
//        int ch1 = Math.min(char1, char2);
//        int ch2 = Math.min(char1, char2);
//
//
//        for (int i = ch1; i <= ch2; i++) {
//            System.out.print((char) i + " ");
//
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first char");
        char char1 = scanner.next().charAt(0);

        System.out.println("Enter second char");
        char char2 = scanner.next().charAt(0);

        int ch1 = Math.min(char1, char2);
        int ch2 = Math.max(char1, char2);

        for (int i = ch1; i <= ch2; i++) {

            System.out.print((char) i + " ");

        }




    }
}
