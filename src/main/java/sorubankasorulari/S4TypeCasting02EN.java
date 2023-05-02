package sorubankasorulari;

public class S4TypeCasting02EN {
    public static void main(String[] args) {


      // Create a short variable and convert it to an int variable.
        short age = 45;
        int MyAge = age;    // AutoWidening

        // Create a long variable and convert it to an int variable.
        long Yage = 23;
        int Mage = (int) Yage;


        // Create a double variable and convert it to a float variable
        double price = 67.8;
        float NewPrice = (float) price;

        // Create a double variable and convert it to a short variable, then print the value of the short
        //variable on the console. Be careful about the output, it will not be a decimal value.

        double a = 45.9;
        short b = (short) a;     // Explicit Narrowing
        System.out.println("b = " + b);

        // Create a byte variable and convert it to a double variable, then print the value of the double
        // variable on the console. Be careful about the output, it will be a decimal number.

        byte x = 78;
        double y = x;
        System.out.println("y = " + y);

        //  1 - Verilen sayi1 ve sayi2 variable'larinin degistiren (SWAP) bir program yaziniz
      //    Orn :  sayi1 =10 ve sayi2 = 20;
     //           kod calistiktan sonra
        //          sayi1 =20 ve sayi2 = 10

        int sayi1= 10;
        int sayi2 = 20;

        System.out.println(sayi1);
        System.out.println("sayi2 = " + sayi2);


        sayi1= sayi1+ sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        /*

        a= a+b;
        b = a-b;
        a = a-b;

         */





















    }
}
