package sorubankasorulari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {


        //  1) Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.

        ArrayList<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(10);
        num.add(8);
        num.add(2);
        num.add(3);


        int sum = 0;
        for (Integer w : num) {
            sum = sum + w;

        }
        System.out.println(sum); //35


        //  2) Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.


        ArrayList<Integer> number = new ArrayList<>();

        number.add(20);
        number.add(10);
        number.add(23);
        number.add(13);
        number.add(2);
        number.add(9);

        int sum1 = 0;
        for (Integer w : number) {
            if (w == 13) {
                break;
            }
            sum1 = sum1 + w;
        }
        System.out.println(sum1);


        //  3) Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.


        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
     // 1.way
        int m = 1;
        for (Integer w : myList) {
            if (w % 2 == 0) {
                m = m * w;
            }
        }
        System.out.println(m);

     // 2.way
        int m1 = 1;
        for (Integer w : myList) {
            if (w % 2 != 0) {
                continue;
            }
            m1 = m1 * w;
        }
        System.out.println(m1);


//4) Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
//Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
// (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır

        // ?????
        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");
        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        System.out.println(e);
        System.out.println(f);
        int size = e.size();
        int flag = 0;
       for(int i=0; i<size; i++){
           if(f.get(i).equals(e.get(size-1-i))){
                flag++;
            }
        }
        if(flag == size){
           System.out.println("Azalan siradadir");
        }else{
            System.out.println("Azalan sirada degil");
       }




        //5) Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
        //Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)


    }
}

















