package org.interviewQuestions;

public class SWAP {
    public static void main(String[] args) {

  /*
      1 - Verilen sayi1 ve sayi2 variable'larinin degistiren (SWAP) bir program yaziniz
           Ornek :  sayi1 =10 ve sayi2 = 20;
                  kod calistiktan sonra
                  sayi1 =20 ve sayi2 = 10
   */
        int a = 12;
        int b = 5;
        int temp = 0;
        System.out.println(a + " " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println(sayi1); // 10
        System.out.println(sayi2); // 20


        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        System.out.println("sayi1 = " + sayi1); // 20
        System.out.println("sayi2 = " + sayi2); // 10


















    }
}
