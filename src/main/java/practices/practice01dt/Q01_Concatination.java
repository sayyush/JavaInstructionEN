package practices.practice01dt;

public class Q01_Concatination {
    public static void main(String[] args) {

        // Practice ' dekiler Yasin hocanin sorulari

        //Initialize variable  // bir degisken olusturun
        int age = 33;
        int weight = 85;

        //Print variables with label(EXPLANATION)
        System.out.println("age = " +  age);     // label ile yazdiriyor <== age.soutv+enter
        System.out.println("weight = " + weight);

        //Copy the variable's value
        int myAge = age;
        System.out.println("myAge = " + myAge);

        //Declare (IFADE EDIN ) multiple variables in the same line
        int year = 2022, month = 12, day = 29;
        System.out.println("day = " + day);

        //Update (guncellemek) a variable
        day = 30;
        System.out.println("day = " + day);

        //Declare a variable : x
        int x;

        //Initialize another variable : y
        int y = 12;

        //Initialize another variable : z
        int z = 10;

        //Initialize variable x by z
        x = z;

        //Update the variable y
        y = 5;

        //Print the variables
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
}

