// Alice has been tasked with implementing a simple calculator interface and a corresponding class for performing basic addition and subtraction operations. The task is to create an interface called Calculator with two methods: add and subtract. The add method should take two numbers as input and return their sum, while the subtract method should take two numbers as input and return their difference.


// Implement a class called SimpleCalculator that implements the Calculator interface. This class should provide the functionality for adding and subtracting numbers. Write a code that satisfies the above requirements. 
// Input format :

// The first line of input consists of a single integer, representing the choice

// If the choice is 1 or 2, the next two lines consist of 2 double values, representing the numbers to do addition or subtraction.
// Output format :

// The output prints a float-value with one decimal value representing the sum of two number or difference of two number.


// Refer to the sample output for format specification.
// Code constraints :

// 1 ≤ choice ≤ 2

// -10000 ≤ a,b ≤ 10000
// Sample test cases :
// Input 1 :

// 1
// 5.5
// 3.5

// Output 1 :

// Result: 9.0

// Input 2 :

// 2
// 8.5
// 3.5

// Output 2 :

// Result: 5.0


// You are using Java

import java.util.Scanner;

interface Calculator {
   //Type your code here
   double add(double num1,double num2);
   double subtract(double num1,double num2);
   
}

class SimpleCalculator implements Calculator {
  //Type your code here
  public double add(double num1,double num2){
      return num1+num2;
  }
  
  public double subtract(double num1,double num2){
      return num1-num2;
  }
  
}

 



public class REC_OOPS_using_Java_Week_7_PAH_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SimpleCalculator calculator = new SimpleCalculator();

        int choice = scanner.nextInt();

        if (choice == 1) {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double result = calculator.add(num1, num2);
            System.out.println("Result: " + result);
        } else if (choice == 2) {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double result = calculator.subtract(num1, num2);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid choice. Please choose 1 for addition or 2 for subtraction.");
        }

        scanner.close();
    }
}
