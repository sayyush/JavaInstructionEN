package day21inheritance;

public class VehicleRunner {

    public static void main(String[] args) {

        //1.way for object creation
        int a=12;
        String name="Tom";

        //2.way is using the class constructors

        Civic myCivic= new Civic(true);

        myCivic.move();
        myCivic.engine();
        myCivic.ecoSystem();
        int hashCode=myCivic.hashCode();
        System.out.println(hashCode);//2114889273 --> hashCode() coming from Object Class


        Vehicle myVehicle=new Vehicle();




    }
}
