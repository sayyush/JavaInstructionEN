package solvingquestions.Slidesorulari;

import java.util.Scanner;

public class Q7StringMethods {
    public static void main(String[] args) {



        // soru 7: Java da Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
             //     isim-soyisim : M***** B*******
             //      kart no : **** **** **** 1234
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kredi kartı numaranızı girin: ");
        String cardNumber = scanner.nextLine();

        System.out.print("İsminizi girin: ");
        String firstName = scanner.next();

        System.out.print("Soyisminizi girin: ");
        String lastName = scanner.next();

        System.out.print("isim-soyisim: " + firstName.toUpperCase().charAt(0) + firstName.substring(1).replaceAll("[a-zA-Z]","*") );
        System.out.println(" " + "soyisim: " + lastName.toUpperCase().charAt(0) + lastName.substring(1).replaceAll("[a-zA-Z]","*") );

        String maskedCardNumber = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);

        System.out.println("kart no: " + maskedCardNumber);
    }
}
























