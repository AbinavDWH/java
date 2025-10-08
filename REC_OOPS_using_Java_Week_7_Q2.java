// Jaheer is working on a health monitoring system to help individuals calculate their Body Mass Index (BMI). He has implemented a basic BMI calculator and an interface called HealthCalculator. It should have a method called calculateBMI.


// You are tasked with creating a program that takes weight and height as input, calculates the BMI using the BMICalculator class, and displays the result. If the height or weight is less than or equal to zero, then return -1.


// Formula: BMI = weight / (height * height)
// Input format :

// The first line of input consists of a double value W, the person's weight in kilograms.

// The second line consists of a double value H, the height of the person in meters.
// Output format :

// The output displays "BMI: " followed by a double value, representing the calculated BMI, rounded off to two decimal places.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 5.0 ≤ W ≤ 120.0

// 1.0 ≤ H ≤ 5.0
// Sample test cases :
// Input 1 :

// 70.0
// 1.75

// Output 1 :

// BMI: 22.86

// Input 2 :

// 118.7
// 3.53

// Output 2 :

// BMI: 9.53


// You are using Java

import java.util.Scanner;

interface HealthCalculator{
    double calculateBMI(double weight,double height);
}

class BMICalculator implements HealthCalculator{
    public double calculateBMI(double weight,double height){
        if(weight <=0 || height<=0)
        return -1;
        else{
            return weight/(height*height);
        }
    }
}


public class REC_OOPS_using_Java_Week_7_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();

        BMICalculator bmiCalculator = new BMICalculator();

        double bmi = bmiCalculator.calculateBMI(weight, height);

        System.out.printf("BMI: %.2f\n", bmi);


        scanner.close();
    }
}
