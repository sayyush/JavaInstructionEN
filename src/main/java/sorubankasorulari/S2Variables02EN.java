package sorubankasorulari;

public class S2Variables02EN {
    public static void main(String[] args) {

        // JAVA ENGLISH QUESTION BANK



        /*

      Create double variables for the prices of any 3 items. Print the sum of the prices on the
      console with a label.

         */

        double shirtPrice = 11.2;
        double hatPrice = 22.3;
        double jacketPrice = 34.2;
        System.out.println("Total price: " + (shirtPrice + hatPrice + jacketPrice));


      /*
      Create a float variable, a long variable, and an integer variable for any 3 items. Print the
        multiplication of the values on the console with a label.
       */

        float a = 11.3F;
        long b = 234;
        int c = 12;
        System.out.println("Multiplication: " + a * b * c);



     /*
     Type a code to find simple interest.
    Note: Simple interest formula = principal * rate * numberOfYear / 100
     */

        int principal = 10000, rate = 4, numberOfYear = 5;
        int simpleInterest = principal * rate * numberOfYear / 100;
        System.out.println("The simple interest is: " + simpleInterest);



     /*
      Create a String and two Long variables. Print the sum and the multiplication of the long
     variables with the String on the console.
      */

        String ss = "The result is ";
        long q = 123;
        long w = 132;
        System.out.println(ss + (q + w));
        System.out.println(ss + q * w);


     /*
     Create two boolean variables whose values are different and print their values in the same
     line with a space between two consecutive values.
     */

        boolean x = true;
        boolean y = false;
        System.out.println('x' + " " + 'y');


     /*
      Create 3 float variables for the price of a book, notebook, and laptop.
       Print the total price of 2 books, 4 notebooks and 3 laptops on the console.
      */

        float book = 56.6F;
        float notebook = 98.6F;
        float laptop = 76.6F;
        float totalPrice = 2 * book + 4 * notebook + 3 * laptop;
        System.out.println("The total price is: " + totalPrice);


    }
}
