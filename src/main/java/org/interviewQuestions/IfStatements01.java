package org.interviewQuestions;

public class IfStatements01 {
    public static void main(String[] args) {

        //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir
        //Ex9: Bir String'deki tekrarsiz character'leri ekrana yazdiriniz
        //         abbccdc==> ad
        String y = "abbccdc";
        char ch1 = y.charAt(0);
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }


        char ch2 = y.charAt(1);
        if (y.indexOf(ch2) == y.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if (y.indexOf(ch3) == y.lastIndexOf(ch3)) {
            System.out.println(ch3);//C

        }
        
    }
}
