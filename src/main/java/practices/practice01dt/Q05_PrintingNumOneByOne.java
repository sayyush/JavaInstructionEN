package practices.practice01dt;

public class Q05_PrintingNumOneByOne {
    public static void main(String[] args) {

    // Write a Java program to break an integer into a sequence of individual digits.
    // Hint: use / (division operator) and % (modulus operator ==> gives remainder of a division operation)
    // x: input: 12345
    //    output: 1
    //            2
    //            3
    //            4
    //            5

        int number = 12345;

        int ones = number%10;
        System.out.println("ones = " + ones);

        int tens = (number/10)%10;
        System.out.println("tens = " + tens);

        int hundreds = (number/100)%10;
        System.out.println("hundreds = " + hundreds);

        int thousands = (number/1000)%10;
        System.out.println("thousands = " + thousands);

        int tenThousands = number/10000;
        System.out.println("tenThousands = " + tenThousands);

        System.out.println(tenThousands+"\n"+thousands+"\n"+hundreds+"\n"+tens+"\n"+ones);

    }

}
