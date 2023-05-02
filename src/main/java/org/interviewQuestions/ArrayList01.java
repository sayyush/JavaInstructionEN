package org.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {

        //Example 2: Create an integer list and remove the duplications
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]
        List<Integer> yourList = new ArrayList<>();
        yourList.add(2);
        yourList.add(3);
        yourList.add(2);
        yourList.add(2);
        yourList.add(5);
        System.out.println(yourList);

        //1.Way: for-each loop
        List<Integer> newList = new ArrayList<>();


        for (Integer w : yourList) {


            if (!newList.contains(w)) {
                newList.add(w);
            }

        }
        System.out.println(newList);// [2, 3, 5]

        //2.Way: for loop
        for (int i = 0; i < yourList.size(); i++) {

            Integer el = yourList.get(i);
            if (yourList.indexOf(el) != yourList.lastIndexOf(el)) {

                yourList.remove(el);
                i--;
            }

        }
        System.out.println(yourList);// [3, 2, 5]

    }
}

