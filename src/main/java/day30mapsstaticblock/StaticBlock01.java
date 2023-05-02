package day30mapsstaticblock;

import java.time.LocalDate;

public class StaticBlock01 {

    /*
            1)other name of the "static variable" is "class variable"
              because "Java Class Loader" loads the static variables together with the class
              so static variables are created when the class was created
            2)Non-Static variables(Instance/object variables) are created when you create an object
            3)To initialize "static variables" we have two options
               i)initialize directly like "public static int price=1000;"
               ii)initialize by using "static block"
               Why do we need static block to initialize a static variable?
               1)Sometimes to initialize a static variable, we need to type codes.
                 To do that; use "static block"
               2)Static blocks are executed before everything in the class even main method; static block is created with the class even before main
             4)There is "instance block" as well
               Instance block is used if you want to execute same code in all constructors in a class
     */
    public static int price;

    static {
        LocalDate d= LocalDate.now();
        if(d.getMonthValue()==2) {
            price = 1000;
        }else {
            price=2000;
        }

    }

    public int year;
    {
        System.out.println("I am instance block");
    }

    public StaticBlock01(){
        System.out.println("I am first constructor");
    }
    public StaticBlock01(int year){
        this.year=year;
        System.out.println("I am second constructor");
    }


}