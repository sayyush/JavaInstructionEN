package day23encapsulationabstraction;

public class Student {

/*
        1)When we type code, we may need to hide some data for some reasons.
          "Encapsulation" means "hiding data"
        2)After encapsulating a data, if you need you may "read" the value
          by using "get method"(getter)
        3)In getters;
            i)"Access Modifier" is "public"
            ii)"Return Type" must be the same with the "Data Type" of the variable
            iii)"Method Name" should have "get + <Variable Name>" structure
                Note: If the data type of the variable is "boolean", make the "Method Name" structure like "is + <Variable Name>"
            iv)"Method Body" will have "return" keyword with the "Variable Name"
        4) After encapsulating a data, if you need you may "update" the value
           by using "set method"(setter)
        5)In setters;
            i)"Access Modifier" is "public"
            ii)"Return Type" must be "void"
            iii)"Method Name" should have "set + <Variable Name>" structure
            iv)setters use "parameters", the parameter will be the same with the variable
         6)If you want to create a "hidden", "updatable" but "not readable" variable: i)Make access modifier "private"
                                                                                      ii)Create set method for the variable
                                                                                      iii)Do not create get method for the variable





     */

    public String stdName;
    int stdGpa;
    private String psychologicalIssues = "Depression";
    private boolean success = true;

    public String getPsychologicalIssues() {
        return psychologicalIssues;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success){
        this.success = success;
    }

    public void setPsychologicalIssues(String psychologicalIssues) {
        this.psychologicalIssues = psychologicalIssues;
    }
}


/*

    /*
      Encapsulation is data hiding (bilgileri gizleme saklama).
      Nasil data saklanir bir class'in icinde: access modifier'ini private yaparim boylelikle saklamis olurum.


               Encapsulation yapilmis data'yi okuyabilir miyiz?
      get method'lar(getter) encapsule edilmis(saklanmis) data'yi okumamiza yarar.
      get method'lar(getter) her zaman "public" olur.
      get method'lar(getter) return type'i variable'larin data type'i ile ayni olur.
      get method'lar(getter) isimleri "get + variable name" seklinde olur.
      get method'lar(getter) isimleri variable boolean ise "is + variable name " seklinde olur.
      get method'lar(getter) parametre kullanmazlar.

      getGpa  - buna biz naming Convention diyoruz Isimlendirme Sistemi



     */




/*
  Encapsulation yapilmis data'larin degeri degistirilebilir mi?

  set method'lar (setter) encapsule edilmis data'larin degerlerini degistirmemize yarar.
  set method'lar (setter) her zaman "public" olur.
  set method'lar (setter) return type'i her zaman void dir.
  set method'lar (setter) isimleri "set + variable name" seklinde olur.
  set method'lar (setter) variable ile ayni data type'inda parametre kullanirlar.

  getter ve setter'larin ikisine birden "Java Beans" denir.
  set method'lar kalibi degistirmez , objeyi degistirir
 */

