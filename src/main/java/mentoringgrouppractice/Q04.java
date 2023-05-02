package mentoringgrouppractice;

public class Q04 {

    public static void main(String[] args) {

        //Example 1: Get the initial of a name which contains first name and last
        //         Tom Hanks ==> TH

String  str= "Tom Hanks";
        char fInitials = str.charAt(0);
       char sInitials = str.split(" ")[1].charAt(0); // method chain
        System.out.println(" "+fInitials+sInitials);
    }
}

