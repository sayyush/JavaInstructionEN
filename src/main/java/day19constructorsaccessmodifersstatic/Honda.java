package day19constructorsaccessmodifersstatic;

public class Honda {

    public static int numOfCarsProduced = 0;

    public int price = 20000;

    public Honda(){
        numOfCarsProduced++;
        price = price + 200;
    }

}
