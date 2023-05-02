package day26collectionsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    /*
        1)Iterators do the same with the loops
        2)Loops have infinite loop risk, but iterators do not have
        3)There are no performance difference between loops and iterators
        4)Iterators are more successful in removing elements and updating elements in a collection
        5)There are two types of iterators i)Iterator: It can just remove the elements, impossible to update.
                                                       It works just from left to the right
                                           ii)ListIterator: It can remove and update and add the elements
                                                            It works from left to right and right to left
     */
    public static void main(String[] args) {

        //use Iterator
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]

        Iterator<String> myItr = myList.iterator();

        while (myItr.hasNext()) {//come to the pointer, asks if there is any element next
            myItr.next();//moves pointer to the next element, returns the previous element
            myItr.remove();//remove the returned element
        }
        System.out.println(myList);//[]

        //use ListIterator
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);//[Tom, Jim, Clara, Angie, Mark]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()) { //ask the pointer is there any element after you?
            String el = yourListItr.next();//moves pointer to the next element, return the element
            yourListItr.set(el + "!...");//update the returned element
        }
        System.out.println(yourList);//[Tom!..., Jim!..., Clara!..., Angie!..., Mark!...]


        //Example: Print the yourList elements on the console from the last element to the first element
        //         in the same line with a space between two consecutive elements

        List<String> ourList = new ArrayList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);//[Tom, Jim, Clara, Angie, Mark]


        ListIterator<String> ourListItr = ourList.listIterator();//pointer is at the beginning as default

        //following loop will move the pointer to the end
        while (ourListItr.hasNext()) {
            ourListItr.next();//move the pointer to the end
        }

        //following loop will work from the last element to the first
        while (ourListItr.hasPrevious()) { //ask the pointer if any element before
            String el = ourListItr.previous();//return the previous element
            System.out.print(el + " ");//Mark Angie Clara Jim Tom
        }


    }
}