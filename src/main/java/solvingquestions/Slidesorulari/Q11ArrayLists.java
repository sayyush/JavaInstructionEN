package solvingquestions.Slidesorulari;

import java.util.ArrayList;
import java.util.Collections;

public class Q11ArrayLists {

    public static void main(String[] args) {

        /*
        1) Elemenalari A,C,E ve F olan bir String ArrayList olusturup ekrana yazdiriniz.

        2) indexsiz add() methodunu kullanarak , B' yi ekleyiniz.
         indexli add() methodunu kullanarak, L'yi 1 numarali index'e ekleyiniz.
         ArrayList'i ekrana yazdiriniz, listte boyle olmali; A,L,C,E,F,B.

        3) set() methodu kullanarak, E'yi D yapiniz.
        ArrayList'i ekrana yazdiriniz, list boyle olmali; A, L, C, D, F, B.

        4) remove() methodu kullanarak, F'yi siliniz.
        ArrayList'i ekrana yazdiriniz, list boyle olmali; A, L, C, D, B.

        5) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        ArrayList'i ekrana yazdiriniz, list boyle olmali; A, B, C, D, L.

       6) contains() methodu kullanarak, L'nin list'de var oldugunu ve M'nin list'de var olmadigini dogrulayiniz.

       7) size() methodu kullanarak, list'in kac eleman oldugunu ekrana yazdiriniz.

       8) clear() methodu kullanarak, list'deki tum elemanlari siliniz.

       9) isEmpty() methodu kullanarak, list'deki tum elemanlarin silindigini dogrulayiniz

         */

// 1. Soru:

        ArrayList<String> harf = new ArrayList<>();
        harf.add("A");
        harf.add("C");
        harf.add("E");
        harf.add("F");
        System.out.println(harf); // [A, C, E, F]

        // 2.soru:

        ArrayList<String> h = new ArrayList<>();
        h.add("A");
        h.add("C");
        h.add("E");
        h.add("F");

        h.add("B");
        h.add(1, "L");
        System.out.println(h); // [A, L, C, E, F, B]

        // 3.Soru

        // Bu sorunun cozumunu her senaryo icin calisacak sekilde yapali

        ArrayList<String> hh = new ArrayList<>();
        hh.add("A");
        hh.add("C");
        hh.add("E");
        hh.add("F");
        hh.add("B");
        hh.add(1, "L");
       hh.set(3, "D");
        System.out.println(hh);// [A, L, C, D, F, B]



        // 4. Soru:

        ArrayList<String> n = new ArrayList<>();
        n.add("A");
        n.add("C");
        n.add("E");
        n.add("F");
        n.add("B");
        n.add(1, "L");
        n.set(3, "D");
        System.out.println(n); // [A, L, C, D, F, B]
        n.remove(4);
        System.out.println(n);//[A, L, C, D, B]


        //5.soru:

        ArrayList<String> n1 = new ArrayList<>();
        n1.add("A");
        n1.add("C");
        n1.add("E");
        n1.add("F");
        n1.add("B");
        n1.add(1, "L");
        n1.set(3, "D");
        n1.remove(4);
        System.out.println(n1);//[A, L, C, D, B]
        Collections.sort(n1);
        System.out.println(n1); // [A, B, C, D, L]











    }
}
