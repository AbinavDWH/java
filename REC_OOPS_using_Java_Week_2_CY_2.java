// Ram wants to evaluate the time required to break even on an investment based on initial costs, monthly profits, and monthly expenses. Write a program to calculate the break-even point in months and categorize the return on investment.


//     Compute the break-even point by using the formula: initial cost / (monthly profit - monthly expenses)
//     Based on the break-even point, classify the return on investment into one of the following categories:
//     Quick Return: If the break-even point is 3 months or fewer.
//     Average Return: If the break-even point is between 4 and 12 months, inclusive.
//     Long-term Return: If the break-even point exceeds 12 months.


// Ram is new to programming, so he seeks your assistance in creating the program.


// Note: monthly profit is always greater than monthly expenses.
// Input format :

// The first line of input consists of a double value representing the initial cost.

// The second line consists of a double value representing the monthly profit.

// The third line consists of a double value representing the monthly expenses.
// Output format :

// The first line prints "Break-even Point:", followed by the break-even point as a decimal number (of double datatype), formatted to two decimal places.

// The second line prints "Category: ",followed by the investment return as a String, which can be one of:

//     "Quick Return" if break-even point ≤ 3
//     "Average Return" if break-even point ≤ 12
//     "Long-term Return" if break-even point > 12


// Refer to the sample output for formatting specifications.
// Code constraints :

// 100.00 ≤ initial cost ≤ 10,00,000.00

// 100.00 ≤ monthly profit ≤ 15,500.00

// 100.00 ≤ monthly expenses ≤ 5000.00
// Sample test cases :
// Input 1 :

// 10000.50
// 5000.75
// 1000.10

// Output 1 :

// Break-even Point: 2.50
// Category: Quick Return

// Input 2 :

// 30000.45
// 5000.30
// 1000.48

// Output 2 :

// Break-even Point: 7.50
// Category: Average Return

// Input 3 :

// 100000.79
// 5000.50
// 1000.25

// Output 3 :

// Break-even Point: 25.00
// Category: Long-term Return

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_CY_2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        double n1=scan.nextDouble(),n2=scan.nextDouble(),n3=scan.nextDouble();
        double be=n1/(n2-n3);
        
        System.out.printf("Break-even Point: %.2f\nCategory: ",be);
        
        if(be<=3){
            System.out.print("Quick Return");
        }else if(be<=12){
            System.out.print("Average Return");
            
        }
        else{
            System.out.print("Long-term Return");
        }
    }    
}
