package sorubankasorulari;

public class TernaryStatement {

    public static void main(String[] args) {
     /*
        4) Nested Ternary kullanarak Apex kodunu yazınız.
        Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
                Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
                Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.

     */
        int year = 2022;

        String leapMi = year % 100 == 0 ? (year % 400 == 0 ? "Leap" : "Not leap") : (year % 4 == 0 ? "Leap" : "Not leap");
        System.out.println("leapMi = " + leapMi);


       /*
        5) Nested Ternary kullanarak;
        Şifreyi kontrol etmek için kodu yazınız.
        8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
        8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.

        */
        String s = "iK1234><08";
        String r = s.length() > 8 ? (s.startsWith("i") ? "Gecerli" : " Gecersiz") : (s.startsWith("K") ? "Gecerli" : " Gecersiz");
        System.out.println("r = " + r);



      /*
        6) Bir sayının mutlak değerini hesaplamak için kodu yazınız.
        Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
        Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.

       */
        int a = -5;
        int result = a < 0 ? -1 * a : a;
        System.out.println("result = " + result);





     /*

      7) Ternary kullanarak; 2 tamsayıdan küçük olanı konsola yazdıran bir program yazınız.
      */

        int x = 12;
        int y = 34;
        int sonuc = x < y ? x : y;
        System.out.println("sonuc = " + sonuc);


     /*
        8) Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aksi takdirde,
           kodunuz " Bu sayı 3 basamaklı değildir" olacaktır.
     */
        int q = -234;
        q = Math.abs(q);
        String w = (q > 99 && q < 1000) ? "Bu sayi 3 basamaklidir" : "Bu sayi 3 basamakli degildir";


        /*
        9) Ternary kullanarak; konsolda tek sayılar için “Tek” , çift sayılar için “Çift” yazdırınız.
         */

        int t = 23;

        String u = t % 2 == 0 ? "Cift sayi" : " Tek sayi";
        System.out.println("u = " + u);


     /*

      10) Ternary kullanarak; konsolda sayı pozitif ise “Pozitif” , negatif ise “Pozitif Değil” yazdırınız.
     */

        int i = 45;
        String sonuc1 = i > 0 ? " Pozitif sayi" : "Negatif sayi";
        System.out.println("sonuc1 = " + sonuc1);


    }
}
