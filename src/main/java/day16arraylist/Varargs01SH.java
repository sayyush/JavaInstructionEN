package day16arraylist;

public class Varargs01SH {

    public static void main(String[] args) {
        // Method cagirmalar main'nin icinde

        addThreeNumbers(12, 4, 6);
        add(4, 5, 6, 7, 9);// gercek sayilar bunlarada argument denir

    }
    // Method olusturmalar main'nin disinda

    // Uc sayiyi toplayan method olusturnuz. BU SADECE 3 TANE SAYIYI TOPLAMAK ICINDIR BASKA SENARYOYA CALISMIYOR.
    public static void addThreeNumbers(int a, int b, int c) {  // <== methodun icine yani parantezin icine yazdiginiz seyler parametredir
        System.out.println(a + b + c);
    }
    // Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar.
    // Method'un parantezleri icine yazilanlara "PARAMETRE" denir.
    // Method' u cagirirken kullanilan sayilarada "ARGUMENT" denir.
    // Bir method'da 1 den fazla Varargs Parametre kullanilamaz cunku ikincisi "UNREACHABLE CODE" olur.  add(int... a, int... b) ==< bu sekilde kullanilamaz
    // Varargs methoduyla  add(4, 5, 6, 7, 9);  add();  add(0); 3 ssekildede calisabiliyor.
    // Varargs olusturmak icin (data tipi+3 nokta + variable ismi)==(int... isim).
    // Varargs yeni bir yapidir, arkada Array mantigini kullanir, yani Array gibi calisir, ama Array degildir.
   // Varargs, varargs disindaki parametrelerle kullanilabilir((String s,int... a)) ama "Varargs" her zaman "son parametre" olmalidir.
    // (int... a,String s) bu sekilde kullanim yanlis error verir cunku sen dipsiz kuyuyu dolduramiyorsun 2.ye nasil gececek.


    // Istediginiz sayida sayiyi toplamak icin bir method olusturunuz
    public static void add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }
        System.out.println(sum);
    }


}
