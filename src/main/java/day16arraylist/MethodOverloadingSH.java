package day16arraylist;

public class MethodOverloadingSH {

    /*
                       INTERVIEW
    1) Method Overloading yaparken ismi degistirilmez.
    2) Method Overloading yaparken parametreler degistirilebilir.
      i) Parametre degistirirken, parametrelerin data type'lari degistirilebilir.
      ii) Parametre degistirirken," parametrelerin data type'lari  farkli ise " yerleri degistirilebilir.
      iii) Parametre degistirirken, parametrelerin sayisi degistirilebilir.
    3) Java icin "ismi" ve "parametreleri"  ayni olan iki method tamamiyla aynidir.
       Bu yuzden  "ismi" ve "parametre" "METHOD SIGNATURE " olarak adlandirilir.
    4) Method Overloading olustururken return type'i degistirmenin hicbir etkisi yoktur.
       Method Overloading olustururken access modifier'i degistirmenin hicbir etkisi yoktur.
       Method Overloading olustururken method'u static veya non-static yapmanin hicbir etkisi yoktur.
       Method Overloading olustururken method body'i degistirmenin hicbir etkisi yoktur.
    5) "private" method's can be overloaded. private methodlar class'a aittir, baska yere goturseniz bile goremezsiniz.
         private static void add(int a, int b){System.out.println(a+b);}
       private method'lar overload edilebilir. Cunku method overloading sadece bir class'in icinde olur.
       private olmak ise baska class'lara gidildiginde problem olusturur.

       6) "static" method'lar overload  edilebilir.



          void- ekrana birsey yazdiriyorsun demektir.
          int- bir sey donduruyor demektir.

     */



    public static void main(String[] args) {

// Methodoverloading - asiri yukleme.

    add(3,5);

    }

    public static void add(int a, int b){System.out.println(a+b);}
    public static void add(double a, double b){System.out.println(a+b);}
    public static void add(double a, int b){System.out.println(a+b);}
    public static void add(int a, double b){System.out.println(a+b);}


}
