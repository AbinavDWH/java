// Ram is designing a program to calculate the Body Mass Index (BMI). Your task is to assist him by following the given specifications.


// Create a base class BMIcalculator with a method calculateBMI() to compute BMI using the formula weight / (height * height). 


// Extend the class with a subclass CustomBMIcalculator that overrides the method calculateBMI() to calculate BMI based on custom criteria, assigning categories such as "Underweight," "Normal Weight," "Overweight," or "Obese." 


//     BMI < 18.5, category = "Underweight"
//     BMI >= 18.5 & < 24.9, category = "Normal Weight"
//     BMI >= 25 & < 29.9, category = "Overweight"
//     else category = "Obese"


// Implement user input for weight and height and display both the standard and custom BMI calculations.
// Input format :

// The first line of input consists of a double value, representing the weight in kgs.

// The second line consists of a double value, representing the height in meters.
// Output format :

// The first line of output prints: "Standard BMI Calculation:"

// The second line of output prints: "BMI: " followed by the calculated BMI value (to two decimal places).

// The third line of output prints: "Custom BMI Calculation:"

// The fourth line of output prints: "Category: " followed by the BMI category.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The test cases will fall under the following constraints:

// 1.0 ≤ weight ≤ 100.0

// 1.0 ≤ height ≤ 5.0
// Sample test cases :
// Input 1 :

// 69.7
// 2.6

// Output 1 :

// Standard BMI Calculation:
// BMI: 10.31
// Custom BMI Calculation:
// Category: Underweight

// Input 2 :

// 75.5
// 1.9

// Output 2 :

// Standard BMI Calculation:
// BMI: 20.91
// Custom BMI Calculation:
// Category: Normal Weight

// Input 3 :

// 65.9
// 1.5

// Output 3 :

// Standard BMI Calculation:
// BMI: 29.29
// Custom BMI Calculation:
// Category: Overweight

// Input 4 :

// 78.6
// 1.2

// Output 4 :

// Standard BMI Calculation:
// BMI: 54.58
// Custom BMI Calculation:
// Category: Obese

import java.util.Scanner;

class BMIcalculator{
    static double weight,height;
    
    BMIcalculator( double weight,double height){
        this.weight=weight;
        this.height=height;
        
    }
    static double calculateBMI(){
        return weight/(height*height);
    }
    static void displayBMI(){
        
        System.out.printf("BMI: %.2f\n",calculateBMI());
        
    
    }
    
}

class CustomBMIcalculator extends BMIcalculator{
    
    CustomBMIcalculator(double weight,double height){
        super(weight, height);
    }
    
     static void displayCustomBMI(){
        double bmi=calculateBMI();
        String str[]={"Underweight","Normal Weight","Overweight","Obese"};
        int i=0;
        if(bmi<18.5){
          i=0;  
        }else if(bmi>=18.5&&bmi<24.9)
        i=1;
        else if(bmi>=25&&bmi<29.9)
        i=2;
        else
        i=3;
        
        System.out.println("Category: "+str[i]);
        
    }
    
}

public class REC_OOPS_using_Java_Week_6_PAH_2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();

        BMIcalculator bmiCalculator = new BMIcalculator(weight, height);
        System.out.println("Standard BMI Calculation:");
        bmiCalculator.displayBMI();

        CustomBMIcalculator customBMIcalculator = new CustomBMIcalculator(weight, height);
        System.out.println("Custom BMI Calculation:");
        customBMIcalculator.displayCustomBMI();

        scanner.close();
    }
}
