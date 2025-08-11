import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_Q3 {
     public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        double h=scan.nextDouble(),w=scan.nextDouble();
        double bmi=w/(h*h);
        bmi=Math.round(bmi*100)/100.0;
        System.out.printf("BMI: %.2f\n",bmi);
        String str="";
        if(bmi <18.5)
        str="Underweight";
        else if(bmi >18.6 && bmi < 24.9)
        str= "Normal Weight";
        else if(bmi >25 && bmi <29.9)
        str="Overweight";
        else if(bmi >=30)
        str="Obese";
        System.out.print("Classification: "+str);
    }   
}
