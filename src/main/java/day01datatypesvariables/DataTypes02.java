package day01datatypesvariables;

public class DataTypes02 {
    public static void main(String[] args) {


        //What is "Data"?
        //Data is used, is stored, is processed in Java . (Veriler kullanilir, depolanir, islenir Javada)
        //What are the "Data Types" in Java?
        //There are 2 main "Data Types" in Java i)primitive data types  ii)Non-primitive data types
        //What are the  "primitive data types"?
        //i)"primitive data types" were created by Java, developers cannot create "primitive date types".
        //ii) There are 8 "primitive date types":
        //    1)byte  2)short  3)int 4)long 5)float 6)double 7)char 8)boolean
        //1)byte : "byte" is for "whole numbers".
        //         "byte" is from -128 to 127.
        //         We have 258 different values in "byte" primitive data types
        // Let's create a byte variable and assign a value to it
        //"byte stdAge" code i)create reserved area in memory
        //                   ii)Names it by using the name you gave
        //                   iii)Puts zero(default value) in the reserved area.


        //"=" is NOT "equals sign", it is "assignment operator"
        //"assignment operator" takes the value from the right outs it into the reserved area on the left
        //Naming Convention of Variables :i)Start with lower cases
        //                                ii)All words except the first should start with upper cases
        //                                That two rules are called "Camel Case"
        //";" is used to end any "Java Sentences"(Statement)
        byte stdAge = 127;
        //2)short: "short" is for whole numbers
        //         "short" is from -32,768 to 32,767
        short populationInAnApartment = 546;
        //3)int: "int" stands for "Integer" and it is for whole number
        //       "int" is from -2 billion (-2,147,483,648 to 2,147,483,647) to +2billion
        int populationInACity = 650000;
        //4)long: "long" is for whole numbers
        //        "long" is from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //        Even you make data type "long", Java insists on using "int" to save memory
        //        To insist on Java to make data type "long", put "L" or "l" at the end of the value.
        //        If the value is in "int range" no need to put "L" or "l" to the end of the value but
        //        if the value is NOT in "int range" you have to put "L" or "l" to the end of the value but
        long populationOfTheWorld = 7200000000L;
        //6)double: "double" is for decimal values
        //          "doubles" can have up to 16 digits inn decimal part, it is so sensitive
        double weightOfACell = 0.000000023045;
        //5)float: "float" is for decimal values
        //         "float" has up to 7 digits in decimal part
        //         All decimal values are in "double" as default in Java.
        //         Even you type "float" as data type, Java will accept it as "double"
        //         to insist on Java, it is float put "F" or "f" to the end of the values.
        float shirtPrice = 12.99F;
        //7)char: "char" is for "single characters"
        //    A, ?, !, s, 3 etc.
        //    The value of "char data type" must be between the "single quotes"
        char initial = 'S';
        char punctuationMark = '!';
        //8)boolean: It is for "true" or "false" answers,
        boolean isRetired = true;
        boolean isOld = false;


    /*
    What did we learn today ?
    1)How to create "project", "package", "class", "variable".
    2)How to name "project", "package", "class", "variable".
    3)Data types
    4)Primitive data types.
     */


    }
}
