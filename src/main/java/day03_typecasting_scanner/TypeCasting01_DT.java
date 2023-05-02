package day03_typecasting_scanner;

public class TypeCasting01_DT {

    public static void main(String[] args) {

       /*

       There are two types of data type in Java

       1)Primitive data types==> byte < short < int < long < float < double ==> numaric primitive data types

       2) Non-Primitive data types ==> String==> used for multiple different characters storage inside an object

       String str= "Tom Hanks 123)?";

                        ********      INTERVIEW  QUESTIONS    ***********
       What are the differences between "Primitive Data Types"  and "Non-Primitive Data Types" ?
       1) Primitive data types have just values but Non-Primitive Data Types have  values and methods

       2)Primitive Data Types are created by Java, we cannot create a primitive data type
        But we can create Non-Primitive data types whenever we need
        3) Primitive data types uses lower cases in naming convention and Non-Primitive ones uses Uppercase naming convention
        4) Usage of memory for primitive data types changes from data type to data type
        But Non-Primitive data types use same amount of memory in heap memory

     There are 2 types of memory in Java.
     1)Stack memory==> 1) Primitive data 2) References(address) of Non-Primitive data types are stored

     2)Heap memory ==> Stores Non-Primitive data types/values

        int a= 23;

        String str= "tOM";

        str.toUpperCase();  // TOM

        */

        int a= 23, i=12;

        String str= "Tom";
        System.out.println(str + a + i); // Tom2312
        System.out.println(a + i + str); // 35Tom
        System.out.println((a + i) + str); // 35Tom
        System.out.println(str+a*i); // Tom276

        //Type Casting

       /*
        1) AutoWidening
        Java can put small data types into large data types automatically
         When you put small data type object into a large data type object, you are widening the small data type.
        */
        int m=14;
        double d = m;

       /*
        2)Explicit Narrowing
        Java does not put large data types into small data types automatically. Java thinks this is risky.
        */


   long numberLong = 345;
        System.out.println(numberLong);

   short numberShort = (short) numberLong;
        System.out.println(numberShort);

   int n =20;
        System.out.println(n);
   byte b = (byte) n;    // parantez icinde byte diye yazarsan duzeliyor
        System.out.println(b);

int num1=123;
short num2=(short )num1;
        System.out.println(num2);

    }
}
