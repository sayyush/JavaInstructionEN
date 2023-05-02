package importantnotes;

public class IncrementDecrement {
    public static void main(String[] args) {

        /*
      INCREMENT 2 sekilde yapilir: artirma ve carpma

      DECREMENT 2 turlu yapilir :cikarma ve bolme



       */
        int a = 5;
        System.out.println(a);//5
        //INCREMENT //

        a= a +2; // VEYA  a += 2;
        System.out.println(a);//7

        //Ex1: Bir tane integer variable olusturun ve onu iki sekilde 5 arttirin
        int b = 10;
        System.out.println(b); // 10

        b= b+5;
        System.out.println(b); // 15

        b += 5;
        System.out.println(b);//20

        // DECREMENT (azaltmak)
        int c=8;
        System.out.println(c);//8
        c= c-3;
        System.out.println(c); //5
        c -= 3;
        System.out.println(c);

        // INCREMENT 2:
        int d= 6;
        System.out.println(d);//6

        d= d*2;
        System.out.println(d);//12

        d *= 2;
        System.out.println(d);//24

        // DECREMENT 2:
        int e=24;
        System.out.println(e);//24

        d = e/2;
        System.out.println(d);//12

        e /= 2;
        System.out.println(e);//6

        // "1" ile increment ve decrement

        int f= 12;
        System.out.println(f);

        f= f+1; // 1 artirmalarda bu kullanilmaz
        f +=1; // // 1 artirmalarda bu kullanilmaz
        f++;  // EN COK KULLANILAN BUDUR

        // "1" ile decrement
        int h= 10;
        h -= 1;
        h--; //EN COK KULLANILAR BUDUR


        //POST(SONRA) INCREMENT VE "PRE(ONCE) iNCREMENT"     //( bunlarin hepsini iyi ogren java sertifika almada ve interviewde sorulur)

        int i= 10;
        int k = i++;       // POST INCREMENT cunku increment variable 'in isminden sonra yazildi
        System.out.println(k);//10 ==> "i" artirilmadan "k"ya konuldugu icin "k"nin degeri 10 olur
        System.out.println(i);//11  ==. "i" satir sonunda artirildigi icin "i" nin degeri 11 olur

        int m=15;
        int n= ++m;   // PRE INCREMENT      // ++(increment) m(variable)

        System.out.println(m); //16 ==> "m" satir sonunda artirildigi icin "m" nin degeri 16 olur
        System.out.println(n); // 16 ==> "m" artirildiktan sonra "n" ye konuldugu icin "N" nin degeri 16 olur

        //"POST DECREMENT VE "PRE DECREMENT"

        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19

    }
}
