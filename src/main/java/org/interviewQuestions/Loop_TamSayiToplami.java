package org.interviewQuestions;

public class Loop_TamSayiToplami {

    public static void main(String[] args) {

        // Example  1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //             5 + 6 + 7 + 8 ==> 26

        int sum = 0;    // toplamada 0 koyarsak neyi 0'la toplarsan sonucu degistirmez

        for (int i = 5; i < 9; i++) {

            sum = sum + i;
        }
        System.out.println(sum);


        // Ex 2: 7'den 9'a kadar tamsayilarin carpimini veren kodu yaziniz.
        //       7*8*9 ==> 504

        int multiply = 1;

        for (int i = 7; i < 10; i++) {
            multiply = multiply * i;
        }
        System.out.println(multiply);

    }
}
