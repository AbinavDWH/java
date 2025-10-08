// Ray is developing a tax calculation program in Java. The program includes an interface named TaxCalculator with a method to calculate tax based on salary. The SimpleTaxCalculator class implements this interface and determines the tax to be paid based on the salary amount using progressive tax slabs.


// Your task is to implement this system. The program first takes an integer T representing the number of test cases, followed by T salary values. For each salary, calculate the total tax to be paid based on the following progressive tax rules:


//     For the first ₹50,000 of salary, the tax rate is 5%.
//     For the next ₹50,000 (i.e., from ₹50,001 to ₹1,00,000), the tax rate is 10%.
//     For any amount above ₹1,00,000, the tax rate is 20%. (That is, only the amount above ₹1,00,000 is taxed at 20%.)


// Example


// Input

// 3

// 78000

// 110000

// 23000

// Output

// 5300

// 9500

// 1150


// Explanation


// For Salary Rs. 78,000

// Tax =  0.1 *﻿ (78,000 - 50,000) + 0.05 * 50,000 = 5,300

// For Salary Rs. 1,10,000

// Tax = 0.2 * (110000 - 100000)+ 0.1 * 50,000 + 0.05 * 50,000 = 9,500

// For Salary Rs. 23,000

// Tax = 0.05 * 23,000 = 1,150
// Input format :

// The first line of the input consists of an integer, T, representing the number of test cases.

// The next T lines of the input consist of a single integer, representing the annual salary of an individual, separated by a line.
// Output format :

// The output displays the calculated tax as an integer for each test case, separated by a line.


// Refer to the sample output for the formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// 1 ≤ T ≤ 10

// 100 ≤ salary ≤ 106
// Sample test cases :
// Input 1 :

// 2
// 100
// 300

// Output 1 :

// 5
// 15

// Input 2 :

// 3
// 3000
// 4000
// 2300

// Output 2 :

// 150
// 200
// 115

// Input 3 :

// 3
// 78000
// 110000
// 23000

// Output 3 :

// 5300
// 9500
// 1150


// You are using Java

import java.util.Scanner;

interface TaxCalculator{
    int calculateTax(int salary);
}


class SimpleTaxCalculator implements TaxCalculator{
    public int calculateTax(int salary){
        if(salary<=50000){
            return (int)(float)(salary*0.05);
        }
        else if(salary>50000 && salary<=100000){
            return (int)(float)(0.1*(salary-50000)+0.05*50000);
        }
        else if(salary>100000)
            return (int)(float)(0.2*(salary-100000)+0.1*50000+0.05*50000);
        return 0;
    }
}


class REC_OOPS_using_Java_Week_7_CY_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        TaxCalculator taxCalculator = new SimpleTaxCalculator();

        for (int i = 0; i < T; i++) {
            int salary = scanner.nextInt();
            int tax = taxCalculator.calculateTax(salary);
            System.out.println(tax);
        }

        scanner.close();
    }
}