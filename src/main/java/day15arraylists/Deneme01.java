package day15arraylists;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.List;

public class Deneme01 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(13);
        myList.add(8);
        myList.add(25);
        myList.add(2);
        myList.add(10);
        System.out.println(myList);    //  [13,8,25,2,10]

        for (int i = 0; i <myList.size() ; i++) {

            if(myList.get(i)<10){
                myList.set(i,77);
            }
        }
        System.out.println(myList);


    }
}
