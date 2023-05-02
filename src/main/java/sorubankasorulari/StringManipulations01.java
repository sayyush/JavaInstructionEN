package sorubankasorulari;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {


      /*
       1) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.
                Örnek: mIAMI - Miami
                       miami - Miami
                       MIAMI - Miami
                       mIaMi - Miami vb.

       */

        String sehirIsmi = "  mIAMI  ";
        String sehirIsmiNew = sehirIsmi.trim().toLowerCase();
        sehirIsmiNew = sehirIsmiNew.substring(0, 1).toUpperCase() + sehirIsmiNew.substring(1);
        System.out.println(sehirIsmiNew);


        /*

        2) Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.

       */

        String isim1 = " Ali Can ";
        String isim2 = "   Merve Star   ";
        String isim3 = "  Mark Tom   ";
        int a = isim1.replaceAll("\\s","").length();
        int b = isim2.replaceAll("\\s","").length();
        int c = isim3.replaceAll("\\s","").length();
        System.out.println("toplam karakter : " + (a + b + c));


        /*
        3) Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
         */
        String x = "  Miami 33018!!!  ";
       int karakter = x.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println("karakter = " + karakter);//10


    /*
      4) Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
             konsolda yazdırınız.
             Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
    */


















       /*
        5) Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
        Örnek:'Ali Can' için n yazdırmalısınız.
        ‘Miami’ için i yazdırmalısınız.
       */

        String v = "Miami   ";
        int boslukOlmayanSonKrkIndex = v.trim().length() - 1;
        System.out.println(boslukOlmayanSonKrkIndex);//4

        String boslukOlmayanSonKrk = v.substring(boslukOlmayanSonKrkIndex, boslukOlmayanSonKrkIndex + 1);
        System.out.println("Bosluk olmayan son karakter: " + boslukOlmayanSonKrk);

// son soruyu anlamadim


    }
}
