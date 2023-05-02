package sorubankasorulari;

public class StringManipulations02 {
    public static void main(String[] args) {

   /*

     6) Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
     toplamını bulunuz.

    */
        String s1 = "Sayyara";
        int ilkAscii = s1.charAt(0);//S
        int sonIdx = s1.length() - 1;//6
        int sonAscii = s1.charAt(sonIdx); //a
        System.out.println("ilk ve son karakter ascii degerleri : " + (ilkAscii + sonAscii)); // 180






    /*
        7) Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
        yazdırınız.
                Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
     */

        String a = "Java";
        String b = a.substring(1);
        System.out.println("b = " + b);


       /*
        8) Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        büyük harfle yazdırınız.
                Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.

        */

        String t = "Java";
        String q = t.substring(0, 3).toUpperCase();
        System.out.println("q = " + q);


     /*
        Kitaptaki cozum sekli
        String s1 = "Java";
        Integer sonKrkIndex = s1.length()-1;
        String sonKrkDisindakiler = s1.substring(0, sonKrkIndex).toUpperCase();
        System.out.println("son karakter disindaki tum karakterler buyuk harf ile : " + sonKrkDisindakiler);

     */

        /*

        9) Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
        karakterleri büyük harflerle yazdırınız.
        Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
        */

        String k = "Java";
        String j = k.substring(1, 3).toUpperCase();
        System.out.println("j = " + j);



       /*
       10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
           olmadığını kontrol etmek için kod yazınız.
          Örnek:‘Ali      Can’ için konsolda false yazmalıdır.
        ‘  AliCan  ’ için konsolda false yazmalıdır.
        ‘ Ali    Can ’ için konsolda false yazmalıdır.
         ‘Ali Can’ için konsolda true yazmalıdır.
       */

        String s = "Tom Hanks";
        String t1 = s.trim();
        System.out.println("t1 = " + t1);
        String h = t1.replaceAll("\\s", "");
        System.out.println("h = " + h);
        Boolean ortadaTekBoslukVarMi = t1.length() - h.length()==1;
        System.out.println("ortada tek bosluk var : " + ortadaTekBoslukVarMi);










      /*
        11) Bir String’ in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod
        yazınız.
                Örnek:‘  Ali  ’ için kodunuz konsolda false yazmalıdır
               ‘Ali’ için kodunuz konsolda true yazmalıdır
     */

        String l = "Ali                  ";
        String h1 = l.trim();
        boolean w = l.equals(h);
        System.out.println("w = " + w);



     /*
        12) Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
            yazınız.
           Örnek:
      ‘Ali’       için kodunuz konsolda false yazdırmalıdır
     ‘ali.’      için kodunuz konsolda false yazdırmalıdır
     ‘  Ali.   ’ için kodunuz konsolda false yazdırmalıdır
     ‘Ali.’     için kodunuz konsolda true yazdırmalıdır
     ‘ALI.’     için kodunuz konsolda true yazdırmalıdır


     Type code to check if a String has an uppercase initial and dot at the end.
     Example: For ‘Ali’ your code should print false on the console
     For ‘ali.’ your code should print false on the console
     For ‘ Ali. ’ your code should print false on the console
     For ‘Ali.’ your code should print true on the console
     For ‘ALI.’ your code should print true on the console



     */

        String p = "Tom Hanks.";
        char firstChar = p.charAt(0);
        char lastChar = p.charAt(s.length()-1);
        Boolean isTheFirstCharUpper = firstChar>='A' && lastChar<='Z';
        Boolean isTheLastCharDot = lastChar=='.';
        Boolean isFirstUpperAndLastDot = isTheFirstCharUpper && isTheLastCharDot;
        System.out.println("Is the first char upper and the last char dot? " + isFirstUpperAndLastDot);


















        //Type code to check if a String has a specific single character or not in three different ways.
       // 1.Way:
        String ss = "Java";
        Boolean result = ss.contains("v");
        System.out.println("Does the character exist? " + result);
      // 2.Way:
        String s7 = "Java";
        Boolean result1 = s1.replaceAll("[^v]", "").length()>0;
        System.out.println("Does the character exist? " + result1);
      //  3.Way:
        String s2 = "J  a  v  a";


        Boolean result2 = s2.indexOf("v")  !=   -1;


        System.out.println("Does the character exist? " + result2);




















    }
}
