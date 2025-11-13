// Sophia, a data analyst, is studying experimental results collected from various lab sensors. Each sensor provides a list of numeric readings, and Sophia wants to calculate the average of these readings to analyze consistency.


// She decides to use lambda expressions and the Function functional interface to compute the average of all the recorded values efficiently.

// Your Task

// Write a Java program that:

//     Reads the total number of measurements.
//     Reads all the measurement values as doubles.
//     Uses a Function<double[], Double> lambda expression to calculate the average value.
//     Displays the final average, formatted to two decimal places.


// Input format :

// The first line of input consists of an integer N, representing the number of measurements.

// The second line contains N space-separated double values.
// Output format :

// Print the average of the entered values, rounded to two decimal places.


// ﻿Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:


// 1 ≤ N ≤ 25

// 1.0 ≤ array elements ≤ 100.0


// Sample test cases :
// Input 1 :

// 6
// 2.2 1.2 5.4 4.6 2.9 55.7

// Output 1 :

// 12.00

// Input 2 :

// 20
// 9.0 8.0 7.0 6.0 5.0 3.0 2.0 1.0 10.0 12.0 13.0 14.0 15.0 16.0 12.22 21.23 34.22 45.44 56.55 54.44

// Output 2 :

// 17.26

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class REC_OOPS_using_Java_Week_12_CY_2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        
        Function<double[],Double> avg=s->{
            double t=0;
            for(int i=0;i<s.length;i++){
                t+=s[i];
            }  
            t/=s.length;
            return t;
        };
        
        int n=scan.nextInt();
        scan.nextLine();
        
        double arr[]=Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        System.out.printf("%.2f",avg.apply(arr));
        
    }
}
