package sorubankasorulari;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        /*

          1)
         Yazdırmak için switch ifadesini kullanınız.
           a) Aralık, Ocak, Şubat için "Kış"
           b) Mart, Nisan, Mayıs için "Bahar"
           c) Haziran, Temmuz, Ağustos için "Yaz"
           d) Eylül, Ekim, Kasım için "Güz"
           e) Diğerleri için "Geçersiz ay adı"
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay ismi giriniz");
        String monthName = input.next().toLowerCase();

        if (monthName.equals("aralik") || monthName.equals("ocak") || monthName.equals("subat")) {
            System.out.println("Kis");

        } else if (monthName.equals("mart") || monthName.equals("nisan") || monthName.equals("mayis")) {
            System.out.println("Ilkbahar");

        } else if (monthName.equals("haziran") || monthName.equals("temmuz") || monthName.equals("agustos")) {
            System.out.println("Yaz");
        } else if (monthName.equals("eylul") || monthName.equals("ekim") || monthName.equals("kasim")) {
            System.out.println("Sonbahar");
        } else {
            System.out.println("Gecersiz ay adi girdiniz");
        }


        switch (monthName) {
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("Kis");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("Ilkbahar");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("Yaz");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("Sonbahar");
                break;
            default:
                System.out.println("Gecersiz ay adi girdiniz");
        }

       /*

        4)
         Cinsiyet "Erkek" ise "Erkek" yazdırınız.
         Cinsiyet "Kadın" ise "Kız" yazdırınız.
         Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
         Not : Bu seçenekler dışındakilerini yoksayınız.
        */


        String gender = "Kadin";
        switch(gender.toLowerCase()){
            case "erkek":
                System.out.println("Erkek");
                break;
            case "kadin":
                System.out.println("Kiz");
                break;
            default:
                System.out.println("digerleri");
        }




























    }
}
