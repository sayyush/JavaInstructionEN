package day08ternaryswitch;

public class Switch01 {

    public static void main(String[] args) {


       /* SWITCH ( yer degistir demek)   case : durum demek
          If else ile cozdugumuz sorularda kontrol etmemiz gereken sart sayisi cok oldugunda switch statement kullaniriz.
          BREAK komutu yapacagimiz islem bittiginde switch statement'in sonuna gitmemizi saglar.
          DEFAULT (if else statements da en sonda yazdigimiz else gibi calisir)
          Switch Statament'da LONG DOUBLE FLOAT BOOLEAN kullanilamaz cunku memoryde cok yer kaplar.
          Switch'de String int byte short char kullanilabilir.
        */


        // Ex 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //       Sunday==>1..... Saturday==>7
        String dayName = "Tuesday";

        // 1. YOL: IF-ELSE
        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        } else {
            System.out.println("Lutfeb gecerli gun ismi giriniz");
        }

        // 2. YOL: Switch

        switch (dayName.toLowerCase()) {

            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }
        // K ve B harf'e duyarsiz olmasi icin (tolowercase) kullanilir






















          /*
        Example 1:For the number of the days, print the day names
                  ... 3==>Tuesday ... 7==>Saturday
     */

     /*
      SWITCH - degis demek.  bir duruma gore is yapmak , baska duruma gore baska is yapmak.
      2den fazla durumu varsa switch kullanicaz
     */


        int dayNumber = 3;

        switch (dayNumber) {

            case 1:  // case durum demek
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:  // else gibi
                System.out.println("Enter valid day numbers");
        }

    }
}
