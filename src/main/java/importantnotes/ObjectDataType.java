package importantnotes;

public class ObjectDataType {

    public static void main(String[] args) {

        //Ex 3 : Iki sayinin isareti ayni ise bu sayilari carpan ,
        // isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz

        int m = 5;
        int n = -6;
        // "OBJECT" javada butun "nON- PRIMITIVE DATA TYPE"(CLASS) larinin  ortak PARENT'tidir.
        //"OBJECT" in PARENT'i yoktur.
        // Farkli data type'lari icin ortak bir variable olusturmak istediginizde, data type olarak object kullanabilirsiniz.
        // Java'da "OBJECT" , insanlik aleminde "Hz.Adem" e benzer.

        Object r3 = ( m>0 && n>0)  ||  ( m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);
    }
}
