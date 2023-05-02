package practices.practice06.encapsulation;

public class BMI {

   private double weight;
   private double height;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }


    public void calculateBMI(){
    double  bmi = weight/(height*height);

    if(bmi<18.5){
        System.out.println("underweight ");
    }else if(bmi>18.5 && bmi<25){
        System.out.println("normal weight");
    }else if(bmi>=25 && bmi<30){
        System.out.println("overweight");
    }else{
        System.out.println("obese");
    }
    }

  //  underweight (under 18.5 kg/m2), normal weight (18.5 to 25), overweight (25 to 30), and obese (30 or more).
}
