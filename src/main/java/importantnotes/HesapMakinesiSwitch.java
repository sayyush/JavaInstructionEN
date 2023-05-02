package importantnotes;

import java.util.Scanner;

public class HesapMakinesiSwitch {

    public static void main(String[] args) {

        // Ex 1: Kullanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz

        // HESAP MAKINESI

        Scanner input = new Scanner(System.in);
        System.out.println(" iki sayi aliniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yapilacak islemi giriniz. +, -, *, /, % dan birini seciniz...");
        char opr = input.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a * b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (a / b));
                break;
            case '%':
                System.out.println(a + "%" + b + "=" + (a * b / 100));
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir...");


        }


    }
}


