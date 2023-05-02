package ssgscanner;

public class Variables01 {

    private String name="Esra";// class variable
    public static int x=12;// this is static variable
    public static void main(String[] args) {


        // 1- Create 3  variables different data types and print them.

        String schoolName = "Start school"; // local variables
        System.out.println(schoolName);

        System.out.println(x);


        Variables01 obj = new Variables01();
        System.out.println(obj.name);

        System.out.println(Variables01.x);

        // Create two variables for name and surname and print  them int console?
        // your name : Muhmmad
        // your last name: Frotan
        // ouptut Mohammad Frotan


        String fName = "Eylem";
        String lName = "Pinkney";
        String fullName = fName + " " + lName;

        System.out.println(fullName);
        System.out.print(fName + " " + lName);
        System.out.println();

        //- Create 2 variables in two different integer data types and print their sum and also give a label
        // sum : 20;

        int a = 12;
        int b = 12;
        int sum = a + b;
        System.out.println("sum :" + sum);// 24

        //Create an integer and a char variable and print their sum.// 40 sec

        int num1 = 15;
        char ch = '!';//33

        System.out.println(ch + 0);

        System.out.println(num1 + ch);//15A


        String num3 = "a";
        System.out.println(num3); //97


    }
}
