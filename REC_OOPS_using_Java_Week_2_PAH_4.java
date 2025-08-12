// Ravi wants to estimate the total utility bill for a household based on the consumption of electricity, water, and gas. 


// Write a program to calculate the total bill using the following criteria:

//     The cost per unit for electricity is 0.12, for water is 0.05, and for gas is 0.08.
//     A discount is applied to the total cost based on the following conditions:
//     If the total cost is 100 or more, a 10% discount is applied.
//     If the total cost is between 50 and 99.99, a 5% discount is applied.
//     No discount is applied if the total cost is less than 50.


// The program should output the total bill after applying the discount with two decimal places.
// Input format :

// The input consists of three double values, representing the number of units consumed for electricity, water, and gas respectively.
// Output format :

// The output prints a double value, representing the total bill after applying the discount, formatted to two decimal places.


// Refer to the sample output for formatting specifications.
// Code constraints :

// 1.00 ≤ units consumed ≤ 10000.00
// Sample test cases :
// Input 1 :

// 1000.0
// 200.0
// 100.0

// Output 1 :

// 124.20

// Input 2 :

// 500.0
// 30.0
// 20.0

// Output 2 :

// 59.95

// Input 3 :

// 120.0
// 70.0
// 45.0

// Output 3 :

// 21.50

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_PAH_4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        double n1=scan.nextDouble(),n2=scan.nextDouble(),n3=scan.nextDouble();
        
        double t=n1*0.12+n2*0.05+n3*0.08;
        
        if(t>100){
            t=t-t*0.1;
        }
        else if(t>50 && t<99.99){
            t=t-t*0.05;
        }
        
        System.out.printf("%.2f",t);
        
        
        
    }
}
