package day04scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

        // Example 1 : Get the first 4 characters from a string and convert them to lower cases
        //              Albania ==> Alba ==> alba

        String s = "Albania";
        String t = s.substring(0, 4).toLowerCase();
        System.out.println(t);


      // Ex 2 : Check if two Strings are same or not.
        // 1.Scenario: "==" and "equals()" gives you the same output
        String r = "Sayyara";
        String u = "sayyara";
        boolean f1 = r==u;
        System.out.println(f1); // false because values and addresses are different
        boolean same2 = r.equals(u);
        System.out.println(same2); // false because values are different

        boolean sameIgnoreCase =  r.equalsIgnoreCase(u);
        System.out.println(sameIgnoreCase);


        //Question : Why do not we use "==" to compare String values?
        // 1.Scenario: "==" and "equals()" gives you the same output
        String r1 = "Java";
        String u1 = "java";

        boolean same1 = r1==u1;
        System.out.println(same1); // false

       boolean same = r1.equals(u1);
        System.out.println(same); // false


        // 2. Scenario: "==" and "equals()" gives you the same output
        String s1= "TechPro";
        String s2= "TechPro";

        boolean r2= s1==s2;
        System.out.println(r2); // true

        boolean r3= s1.equals(s2);
        System.out.println(r3); // true

        // 3.Scenario: "==" and "equals()" gives you different output
        String t1= "Python";
        String t2= new String("Python");               // new String : yeni bir String olusturuyor

        boolean d1= t1==t2;
        System.out.println(d1); // false

        boolean d2= t1.equals(t2);
        System.out.println(d2); // true



    }
}
