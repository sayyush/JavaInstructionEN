package sorubankasorulari;

import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {

          /* Soru 4:
           Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
             a) Aralık, Ocak, Şubat için "Kış"
             b) Mart, Nisan, Mayıs için "İlkbahar"
             c) Haziran, Temmuz, Ağustos için "Yaz"
             d) Eylül, Ekim, Kasım için "Sonbahar"
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
            System.out.println("Gecersiz ay adi");
        }
    }
}
