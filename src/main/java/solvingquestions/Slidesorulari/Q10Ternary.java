package solvingquestions.Slidesorulari;

public class Q10Ternary {

    public static void main(String[] args) {

        // Soru 3 : Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
       //  mutlak degerin kurali sayi eksiyse onu -1 le carpmali, sayi pozitifse kendisi ve 0 ise kendisini yazman yeterli oluyor
        //          -4==> -1*-4      4==>4     0==>0

        int c = 4;
        int r2 = c < 0 ? -1*c : c;
        System.out.println(r2); //4













    }
}
