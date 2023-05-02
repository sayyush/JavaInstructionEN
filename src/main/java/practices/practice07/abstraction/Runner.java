package practices.practice07.abstraction;

public class Runner {


    public static void main(String[] args) {

        //Type code to calculate area of rectangle and triangle.(Use abstraction)


        Triangle triangle = new Triangle();
        System.out.println(triangle.calculateArea(4, 5));
        System.out.println(triangle.calculateArea(7, 5));

      //  System.out.println(new Rectangle().calculateArea(10,5));// This is not recommended

        // Recommended
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.calculateArea(10,5));
        System.out.println(rectangle.calculateArea(5,5));

    }
}
