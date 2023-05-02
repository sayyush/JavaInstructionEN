package solvingquestions.Slidesorulari;

public class Q1VariablesClassWork {

    public static void main(String[] args) {

      // 1 - Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        boolean seviyorMu = true;
        byte age = 45;
        float cellNum = 345678.90786F;

        System.out.println("seviyorMu = " + seviyorMu);
        System.out.println("age = " + age);
        System.out.println("cellNum = " + cellNum);


        System.out.println("seviyorMu = " + seviyorMu + " age = " + age + " cellNum = " + cellNum);

        /*
         2 - isim ve soyisim icin iki variable olusturun ve bunlari
             Isminiz : Mehmet
             Soyisminiz : Bulutluoz
             seklinde yazdirin

         */

        String isminiz = "Mehmet";
        String soyIsminiz = "Bulutluoz";

        System.out.println("Isminiz: " + isminiz); // Isminiz: Mehmet
        System.out.println("Soyisminiz: " + soyIsminiz); // Soyisminiz: Bulutluoz


      // 3 - Iki farkli tamsayi  data turunde 2 variable olusturun bunlarin toplamini yazdirin

        int a = 12378;
        long b = 23456;
        System.out.println(a+b); // 35834


        // 4 - Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin

        short maas = 20000;
        double sapkaFyt = 45.76;
        System.out.println(maas+sapkaFyt); //20045.76


        // 5 - char data turunde bir variable olusturun ve yazdirin
        char ismIlkHarfi = 'B';
        System.out.println("ismIlkHarfi = " + ismIlkHarfi);


        // 6 - Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        byte ogrenciYasi= 23;
        char harf = 'A';     // 23+65=88
        System.out.println(ogrenciYasi+harf); // 88


    }
}
