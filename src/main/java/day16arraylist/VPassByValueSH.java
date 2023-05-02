package day16arraylist;

public class VPassByValueSH {

/*

   1) Java "Pass-by-value" sayesinde variable'larin orijinal degerlerini koruma altina alir.
 */

    public static void main(String[] args) {
        double shirt= 100;
double studentShirtPrice = discount("student",shirt);
double veteranShirtPrice = discount("veteran",shirt);
double seniorShirtPrice = discount("senior",shirt);

        System.out.println(shirt);
        System.out.println(studentShirtPrice);
        System.out.println(veteranShirtPrice);
        System.out.println(seniorShirtPrice);


        shirt = discount("veteran", shirt);//    herkese gazilerin indirimininden faydalansin
        System.out.println(shirt);// 80

    }
    public static double discount(String state, double price) {
        switch (state) {

            case "student":
                price = price * 0.90;
                break;

            case "veteran":
                price = price * 0.80;
                break;

            case "senior":
                price = price * 0.95;
                break;
            default:
                price=price;

        }
        return price;


    }




}
