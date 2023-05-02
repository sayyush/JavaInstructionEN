package day14multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        //  interview sorusu
       /* Array ile ArrayList'in farki nedir?

        1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini
             soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
                Array'ler eleman sayisinda "fixed" dirler.
             ArrayList'leri olustururken eleman sayisi soylemeye gerek yok,
             cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
        2)Array'lerin icine "primitive" ve "reference" lar konabilir.
            ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
        3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
            Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin
            Array kullaniriz, ama eleman sayisi degisken olan coklu datalar icin
            Array kullanma riskini almayin
            Listler gelismis yapi array'lere gore

        */

        /*
        1) To creat an "Array" we need to declare "the number of elements" at the beginning but
        we may need more elements to store or less elements to store inside the array.
        That is why declaring the number of elements at the beginning is not good.
        This is the negative side of arrays.

        To remove that negativity, Java created a new structure whose name is "ArrayLists"(List is also used),
        when we use "ArrayLists", no need to declare the number of elements you want to store in it.

        As a result : "Arrays" is fixed in length, "ArrayLists" is flexible.

        2) "ArrayLists" can store just "non-primitive" data, "Array" can store "primitive" data and "references"

        3) "Array"s work super fast
           "Array"s use memory so less
           If you are sure the number of elements will not change(for example month names), using "Array" is better

         */
        // How to create an ArrayList
        // 1. Way:
        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println(ages); // [] empty list

        // 2.Way:
        List<Integer> prices = new ArrayList<>();
        System.out.println(prices);

        // How to add elements into an ArrayLists
        //  Note : add() method put the element to the end sen nasil siralarsan ona gore calisir siralanir
        // add() method puts the elements in "insertion order".  4 cesit add() methodu var
        ages.add(13);
        ages.add(9);
        ages.add(21);

        // add(1.44) ; put 44 index 1
        ages.add(1, 44);
        System.out.println(ages); //   [13, 44, 9, 21]

        prices.add(330);
        prices.add(550);
        prices.add(770);
        System.out.println(prices); // [330, 550, 770]
        //ages.addAll(prices); add "prices" list elements into the "ages" list element
        ages.addAll(prices);
        System.out.println(ages); // [13, 44, 9, 21, 330, 550, 770]

        // ages.addAll(2, prices); add "prices" list elements into the "ages" list at index 2
        ages.addAll(2, prices);
        System.out.println(ages); // [13, 44, 330, 550, 770, 9, 21, 330, 550, 770]

        //How to remove all elements from a list
        //clear() method removes all elements in a list
        //prices.clear();
        //System.out.println(prices);// []


        //How to check if a specific element or elements exist in a list
        boolean r1 = ages.contains(44);
        System.out.println(r1);//true

        //ages.containsAll(prices); if all prices list elements exist in ages list, Java returns true otherwise returns false
        boolean r2 = ages.containsAll(prices);
        System.out.println(r2);//true

        prices.add(22222);
        boolean r3 = ages.containsAll(prices);
        System.out.println(r2); // false
        // ages.containsAll(prices) : if all prices list elements exist in ages list, Java returns true otherwise returns false
        boolean r5 = ages.containsAll(prices);
        System.out.println(r2); // true

        // How to check if two lists are same or not

        List<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Angie");
        names1.add("Mark");

        List<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Angie");
        names2.add("Mark");
        // equals() method checks if the lists have the same elements in the same indexes
        // If  same elements in the same indexes, equals() method returns true otherwise returns false
        // ayni indexte ayni eleman olmali
        boolean rr = names1.equals(names2);
        System.out.println(rr);// true

        // Example 1 : Type code to check if two lists have same elements.
        //             Same elements can be in different indexes
        // [A, B, C] and [A, C, B] [B, A, C] etc ==> true

        List<Character> m = new ArrayList<>();
        m.add('A');
        m.add('B');
        m.add('C');

        List<Character> n = new ArrayList<>();
        m.add('B');
        m.add('C');
        m.add('A');

        Collections.sort(m);
        Collections.sort(n);

        boolean r4 = m.equals(n);
        System.out.println(r4);

    }
}
