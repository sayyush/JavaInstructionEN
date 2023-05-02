package sorubankasorulari;

public class S3TypeCasting01TR {
    public static void main(String[] args) {

     // Short data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz
        short yas = 23;
        System.out.println(yas);
        int BYas = yas;
        System.out.println("BYas = " + BYas);


     // Long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz

        long a = 123456;  // 123456L
        int b = (int)a;


     // Double data tipinde bir değişken oluşturunuz ve onu bir float değişkenine dönüştürünüz

        double c = 12.45;
        float d = (float) c;

     // Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
     //Sonrasında bu short değişkenin değerini konsolda yazdırınız.
      //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır


        double x = 456.78;
        System.out.println(x);

        short y =(short) x;
        System.out.println("y = " + y);


        // Byte data tipinde bir değişken oluşturunuz ve onu bir double değişkenine dönüştürünüz.
     //Sonrasında bu double değişkenin değerini konsolda yazdırınız.
     //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır      *******?????????**********

        byte yas1 = 45;
        System.out.println(yas1);
        double AC = yas1;
        System.out.println("AC = " + AC);


    }
}
