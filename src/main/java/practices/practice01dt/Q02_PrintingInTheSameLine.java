package practices.practice01dt;

public class Q02_PrintingInTheSameLine {
    public static void main(String[] args) {
     /*
     Type code to print first name, last name, age, height and weight then print them on console in this way:
          First Name: ...
          Last Name: ...
          Age: ...
          Height: ...
          Weight: ...
     Note: Use containers for each element and only one "System.out.println();"
     */

        String firstName = "John";
        String lastName = "Doe";
        int age = 33;
        double height = 1.85;
        int weight = 75;

        System.out.println("firstName = " + firstName + "\nLastName = " + lastName + "\nAge = " + age + "\nHeight = "+ height + "\nWeight = " + weight);
    }

    // System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nAge: "+age+"\nHeight: "+height+"\nWeight: "+weight);
}
