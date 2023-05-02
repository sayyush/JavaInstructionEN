package day19constructorsaccessmodifersstatic;

public class TeacherRunner {

    public static void main(String[] args) {

        Teacher myTeacher = new Teacher();
         // teacherName variable is "public" that is why we can access it from entire the project
        System.out.println(myTeacher.teacherName);// Tom Hanks
        // phone variable is "protected" that is why we can access it from inside the package
        // phone variable myTeacher object are in "day19constructorsaccessmodifersstatic"  package
        System.out.println(myTeacher.phone);// 1408432165
        // Salary variable is "default" that is why we can access it from inside the package
        // salary variable myTeacher object are in "day19constructorsaccessmodifersstatic"  package
        System.out.println(myTeacher.salary); // 6000

        // In teacher class there is one more variable which is "ssn" it is private
        // that is why we can not access to it from TeacherRunner Class
        // Note : A class can be "public" and "default", do not use "private", "protected" for the classes.

    }


}
