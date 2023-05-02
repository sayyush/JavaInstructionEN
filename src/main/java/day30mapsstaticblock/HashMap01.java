package day30mapsstaticblock;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        //String s = "Java is easy, Java is OOP, OOP makes Java easy.";

        String s = "Java, Java, I love Java.";
        System.out.println(getNumOfOccurrence(s));//{love=1, Java=3, I=1}


    }
    //Example 1: Type code to find the number of occurrences of words in a sentence
    //Java is easy, Java is OOP, OOP makes Java easy ==> Java=3, is=2, easy=2, OOP=2, makes=1

    public static HashMap<String, Integer> getNumOfOccurrence(String s) {

        //to make "easy," and "easy." same we removed punctuation marks
        s = s.replaceAll("\\p{Punct}", "");

        //to put the result into a map we created following HashMap
        HashMap<String, Integer> occurrences = new HashMap<>();//ordering occurrences is not important, to be fast we create hashmap

        //we split the string to get words then put them into the array
        String[] words = s.split(" ");

        for (String w : words) {
            Integer numOfOccurrences = occurrences.get(w);

            if (numOfOccurrences == null) {
                occurrences.put(w, 1);
            } else {
                occurrences.replace(w, numOfOccurrences + 1);

            }
        }
        return occurrences;


    }
}
