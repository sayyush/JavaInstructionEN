package day16arraylist;

public class MethodCreation01 {

    public static void main(String[] args) { // main methodun icindeki hersey static olmali, static 'in ne oldugunu sonra ogrenicez
        addTwoNumbers(4,6);
        System.out.println(additionOfThreeInts(12, 5, 7));//24
        System.out.println("subtractIntegers(12,5) = " + subtractIntegers(12, 5));//subtractIntegers(12,5) = 7
        System.out.println("multiplyIntegers(34,3) = " + multiplyIntegers(34, 3));//multiplyIntegers(34,3) = 102
        System.out.println("divisionOfInts(56,3) = " + divisionOfInts(56, 3));// divisionOfInts(56,3) = 18.666666666666668
    }
// Iki sayiyi toplayan method olusturunuz
    public static void addTwoNumbers(int a, int b){System.out.println(a+b);}
    public static int additionOfThreeInts(int a, int b, int c) {return a + b + c;}

    public static int subtractIntegers(int a, int b) {return a - b;}

    public static int multiplyIntegers(int a, int b) {return a * b;}
    public static double divisionOfInts(double a, double b){return a/b;}

}
