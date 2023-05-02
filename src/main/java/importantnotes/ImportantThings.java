package importantnotes;

public class ImportantThings {
    public static void main(String[] args) {

        // ***  statement javada cumle demek
        // 3 basamakli sayiyi bilmek icin : sayi>99 && sayi<999
        // Math.abs() ==> absolute(mutlak deger). yani equalsIgnoreCase gibi  - + sayilari pozitive cevirerek isimi halleder





       /*  ***
        - replaceAll() methodunda REGULAR EXPRESSIONS (Regex) kullanilabilir

       \\s  : bosluk(space)
       \\S  : bosluk disindaki tum characterler
       \\w  : harfler ve rakamlar (a-z,A-Z,0-9)
       \\W  : harfler ve rakamlar disindaki tum characterler
       \\d  : rakamlar (0-9)
       \\D  : rakamlar disindaki tum characterler


        */

        //     ***********    \\

        /*

        WHY  TO USE   \\w,W,d,D,s,S......   symbols in
     Java
     replaceAll()
     replace() metodu ile benzer olarak verilen
      String’deki istenen karater(leri)
      istenen yeni karakter(ler) ile değiştirir. Aralarındaki
      farklar:
      ---replace() metodunda   char  kullanılabilir,
      replaceAll() da char kullanılamaz.
     ---replaceAll()  metodunda Regular Expressions
     ( regex) kullanılabilir. Please go  to page 41 in
     Question Bank and see the questions 16&17
     \\s-------------->    boşluk(space)
     \\S------------>    boşluk dışındaki tüm karakterker
     \\w-------------> harfker ve rakamlar (a-z, A-Z, 0-9)
     \\W------------>   harfler ve rakamlar dışındaki tüm
     karakterler
      \\d-------------->  sadece rakamlar(0-9)
      \\D--------------->  Rakamlar dışındaki tüm karakterler
      \\Z veya z -------- Stringin sonuna replace etmek
      istediğimiz karakteri ekler
      \\A--------------> Stringin başına replace etmek
      istediğimiz karakteri ekler
         */





        /*   ***

           Note: Just a single digit is a data, all digits are a group of data
                 To tell Java sth about a group of data we use "Regular Expression" (Regex)
                 digits (0123456789  sadece 0 dan 9 a kadar olan sayilardir)


          What is the Regular Expression? ==>Regex
          1) All digits ==> [0-9]
          2) All lowerCases ==> [a-z]
          3) All UpperCases ==> [A-Z]
          4) All letters ==> [a-zA-Z]
          5) All letters and digits [a-zA-Z0-9]
          6) All vowels ==> [aeiouAEIOU]
          7) All punctuation marks ==> \\p{Punct}

          8) All characters "different from"==> [^]
          9) All characters "different from" ==> [^a-z]
          10) All characters "different from" letters ==> [^a-zA-Z]
          11) All characters "different from" vowels ==> [^aeiouAEIOU]

           12) x, q, w harfleri ==> [xqw]

         */


        System.out.println(15 + 20 + "Merhaba");//35Merhaba

        System.out.println("Merhaba" + 15 + 20);//Merhaba1520
        System.out.println("Merhaba" + (15 + 20));//Merhaba35
        System.out.println("Merhaba" + 15 * 20);//Merhaba300



        /*
            ***
           \ n==> alt satira atar
           \t==> bir tab bosluk birakir
            ctrl+s   kayit yapar ama intellij otomatik kayit eder
            ctrl+alt+l ==> classi duzenler

         */

            /*    ***
              String str = "Java is easy";
              System.out.println(str.substring(8, 8));
              Nothing is printed on the console


             String str = "Java";
             System.out.println(str.replace("", "/"));
             Prints /J/a/v/a/ on the console

            String str = "Learn java, earn money";
           System.out.println(str.replace('Learn', '?'));
           Gives Compile Time Error

           String str = "Learn java, earn money";
           System.out.println(str.replace("Learn", '?'));
          Gives Compile Time Error


          String s = "Learn";
        String t = "Java";
        String u = "";
        String v = " ";
       System.out.println("" + s.length() + t.length());   // 54 yanyana yazdiriyor basinda cift tirnak oldugu icin



     *** Verilen bir sayinin negatif pozitif yada notr oldugunu nasil biliriz:
        int numara = 105;
            if (numara < 0) {
                System.out.println("Negatif Sayi");
            } else if (numara == 0) {
                System.out.println("Notr Sayi");
            } else {
                System.out.println("Pozitif Sayi");
            }

      ***  Verilen character buyuk harf ise ekrana " Buyuk harf" yazdiran
           kucuk harf ise "Kucuk harf"  yazdiran kodu olusturunuz :

         char ch1 = 'S';
            if (ch1 >= 'A' && ch1 <= 'Z') {
                System.out.println(("Buyuk harf"));
            } else if (ch1 >= 'a' && ch1 <= 'z') {
                System.out.println("Kucuk harf...");
            } else {
                System.out.println("Harf degil...");
            }

     ***  Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

            System.out.println("Lutfen bir sayi giriniz");
            int num = input.nextInt();
            // Burada iki kontrol yapildi
            if (num % 2 == 0) {

                System.out.println("Cift Sayi");
            }
            if (num % 2 != 0)

     ***  //ELSE demek diger tum ihtimaller demek
                // burada conditional bir sart yok,
                // tek kontrol var Javaya az is yaptirmis oluyoruz. KODLARDA MAKBUL OLAN BUDUR

  

















      */


    }
}
