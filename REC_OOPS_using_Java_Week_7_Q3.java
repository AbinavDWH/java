
// A financial analyst, Alex, needs a program to calculate simple interest for various financial transactions. He requires a straightforward tool that takes in the principal amount, interest rate, and time in years and computes the interest.


// The formula to be used is: Interest = Principal × Rate × Time / 100


// Implement this functionality using the InterestCalculator interface and the SimpleInterestCalculator class.
// Input format :

// The first line of input consists of the principal amount P as a double value.

// The second line of input consists of the annual interest rate r as a double value.

// The third line of input consists of the number of years t as a positive integer, which is an integer value.
// Output format :

// The output displays the calculated simple interest in the following format: "Simple Interest: [interest_value]", Here, [interest_value] should be replaced with the actual interest value calculated by the program.


// Refer to the sample output for the formatting specifications.
// Code constraints :

// The given test cases fall under the following specifications:

// 100.0 < P ≤ 10.06

// 1.0 < r ≤ 10.02

// 0 < t ≤ 30
// Sample test cases :
// Input 1 :

// 1000.00
// 5.00
// 2

// Output 1 :

// Simple Interest: 100.0

// Input 2 :

// 5000.0
// 6.25
// 2

// Output 2 :

// Simple Interest: 625.0

// Input 3 :

// 8000.0
// 12.5
// 2

// Output 3 :

// Simple Interest: 2000.0

// You are using Java

import java.util.Scanner;

interface InterestCalculator{
    double simpleInterest(double principal,double rate,int time);
}

class SimpleInterestCalculator implements InterestCalculator{
    public double simpleInterest(double principal,double rate,int time){
        return principal*rate*time/100;
    }
}


public class REC_OOPS_using_Java_Week_7_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal = scanner.nextDouble();

        double rate = scanner.nextDouble();

        int time = scanner.nextInt();

        InterestCalculator calculator = new SimpleInterestCalculator();

        double interest = calculator.simpleInterest(principal, rate, time);

        System.out.println("Simple Interest: " + interest);

    }   
}
