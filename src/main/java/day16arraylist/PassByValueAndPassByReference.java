package day16arraylist;

public class PassByValueAndPassByReference {

    public static void main(String[] args) {
      int shirtPrice=100;
        studentsShirtPrice(shirtPrice,10);

    }
   public static void studentsShirtPrice(int shirtPrice, int discount){
     int discountedPrice = shirtPrice-discount;
       System.out.println(discountedPrice);

   }







}
