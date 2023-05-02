package sorubankasorulari;

public class S1Variables01TR {
    public static void main(String[] args) {

        // TURKCE SORU BANKASINDAKI SORULAR


      /*
        Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
         toplamını konsola yazdırınız.
      */

        double gomlekFiyat = 12.45;
        double ceketFiyat = 56.99;
        double salFiyat = 20.34;
        System.out.println("ToplamFiyat: " + (gomlekFiyat + ceketFiyat + salFiyat));


     /*
        Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
        değişkenlerin değerlerinin çarpımını konsolda yazdırınız

     */

        float a = 12.32F;
        long b = 23;
        int c = 12;
        System.out.println("Degiskenlerin carpimi: " + a * b * c);




        /*
        Basit faizi bulmak için bir kod yazınız.
        Not: Basit faiz formülü = anapara * oran * yılDegeri /100
         */

        int anaPara = 20000, oran= 6, yilDegeri = 3;
        int BasitFaiz = anaPara*oran*yilDegeri/100;
        System.out.println("Basit faiz  degeri = " + BasitFaiz);



       /*

      Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
      toplamını ve çarpımını String ile yazdırınız

        */

        String d = "Deger";
        long e = 232;  //232L
        long f = 45;
        System.out.println(d + (e + f));
        System.out.println(d + (e * f));


     /*
       Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve bu değerleri iki
        ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız.
      */


        boolean a1 = true;
        boolean b1 = false;
        System.out.println(a1 + " " + b1);


        /*
           3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
            Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.
        */

        long kitap = 11, defter = 12, laptop = 13;
        long toplamFiyat = 2*kitap+4*defter+3*laptop;
        System.out.println("Toplam fiyat : " + toplamFiyat);



    }
}
