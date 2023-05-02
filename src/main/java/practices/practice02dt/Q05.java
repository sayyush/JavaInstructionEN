package practices.practice02dt;

public class Q05 {
    public static void main(String[] args) {


       //1.Task: Count the alphabetical characters in a given value.

        String str= "Wow!...Ali is 13 years old and he is a university student!!!";
        int totalNumOfChars=  str.length();
        System.out.println("totalNumOfChars = " + totalNumOfChars);  // 60

        String strWithoutPunct= str.replaceAll("\\p{Punct}", "");
        System.out.println("strWithoutPunct = " + strWithoutPunct); //WowAli is 13 years old and he is a university student

        int strWPLength= strWithoutPunct.length();
        System.out.println("strWPLength = " + strWPLength);//53
        int countOfAlphabeticalChars= str.replaceAll("[^A-Za-z]", "").length();
        System.out.println("strWPLength = " + strWPLength); //53
        System.out.println("countOfAlphabeticalChars = " + countOfAlphabeticalChars);//41

String a = "Java ogrenmek cok kolay";
String a1 = a.replaceAll("[^a-z]","+");
        System.out.println("a1 = " + a1);

        // en kolay yolu benim icin:
        //  int a = str.replaceAll("[^a-zA-z]","").length();
        //        System.out.println("a = " + a);


    }
    }

