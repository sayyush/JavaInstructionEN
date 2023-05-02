package solvingquestions.Slidesorulari;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {

         /*
    TASK: kULLANICIDAN 3 TANE POZITIF BIR TAM SAYI ALINIZ.
     Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz.
     Eger ucgen ise es kenar ucgen olma durumunu kontrol ediniz

     INFO:UCGEN OLMA SARTI:
     herhangi kenar toplami ucuncu kenardan buyuk olmali.
     herhangi iki kenar farki ucuncu kenardan kucuk olmali

    a+b>c>a-c
    a+c>b>a-c
    b+c>a>b-c

    a=b=c boyle ise eskenar ucgen

   Java Nested kodlari calistirirken cok zaaman harciyor buna TIME COMPLEXITY DENILIYOR O YUZDEN NESTED KOD YAZILMAMALI
     */


        // PARANTEZ ICLERI KISA OLMALI
        // ifde sira cok onemli

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
        // Kullanici yanlislikla negatif sayi girdi ise kod asagidaki gibi yazilabilir.
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());

        if ((a + b > c && c > a - b) && (a + c > b && b > a - c) && (b + c > a && a > b - c)) {
            if (a == b && b == c && a == c) {
                System.out.println("Eskenar ucgen");
            } else {
                System.out.println("Ucgen eskenar degil");
            }
        } else {
            System.out.println("Sen ucgen degilsin");
        }


        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");

        // Kullanici yanlislikla negatif sayi girdi ise kod asagidaki gibi yazilabilir.
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        double c1 = input.nextDouble();
        boolean ucgenMi = (a + b > c && c > a - b) && (a + c > b && b > a - c) && (b + c > a && a > b - c);

        // Kullanicinin negatif sayi girmesini affetmiyorum derseniz:
        if (a1 < 0 || b1 < 0 || c1 < 0) {
            System.out.println("Ucgen kenarlari negatif olamaz");
        }
        if (ucgenMi) {
            if (a1 == b1 && b1 == c1 && a1 == c1) {
                System.out.println("Eskenar ucgen");
            } else {
                System.out.println("Ucgen eskenar degil");
            }
        } else {
            System.out.println("Sen ucgen degilsin");
        }


    }
}
