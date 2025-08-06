// // 
// In the Kingdom of Finance, the royal treasury is managed by the treasurer, Sir Cedric. Sir Cedric tracks the daily expenses of the kingdom using an expense report that lists three major categories: food, clothing, and utilities. However, the King wants to know if the average daily expense is greater than at least two of these categories to ensure the kingdom is spending wisely.


// Your task is to help Sir Cedric determine if the average daily expense is greater than two of the categories. Specifically, you need to calculate the average of the three expenses and check if it is greater than any two categories.


// Note: Use the ternary operator
// Input format :

// Three integers a, b, and c represent the daily expenses for food, clothing, and utilities. Each integer is provided on a single line.
// Output format :

// The average of the three expenses, rounded to two decimal places.

// A message indicating whether the average is greater than at least two of the expense categories.

//     If the average is greater than the two smallest monthly expenses, print "Average is greater than both X and Y," where X and Y are the two smallest expenses.
//     Otherwise, display "Average is not greater than two smallest expenses".


// Refer to the sample output for formatting specifications.
// Code constraints :

// 1 ≤ a, b, c ≤ 106
// Sample test cases :
// Input 1 :

// 4
// 6
// 10

// Output 1 :

// 6.67
// Average is greater than both 4 and 6

// Input 2 :

// 5
// 100
// 10

// Output 2 :

// 38.33
// Average is greater than both 5 and 10

// Input 3 :

// 20
// 10
// 13

// Output 3 :

// 14.33
// Average is greater than both 10 and 13

// Input 4 :

// 5
// 4
// 3

// Output 4 :

// 4.00
// Average is not greater than two smallest expenses

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_Q8 {
      public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        int n1=scan.nextInt(),n2=scan.nextInt(),n3=scan.nextInt();
        float avg=(float)(n1+n2+n3)/3;
        
        int i,j;
        System.out.printf("%.2f\n",avg);
        if((float)n1<avg && (float)n2<avg )
        System.out.print("Average is greater than both "+n1+" and "+n2);
    else if((float)n2<avg && (float)n3<avg )
        System.out.print("Average is greater than both "+n2+" and "+n3);
    else if((float)n1<avg && (float)n3<avg )
        System.out.print("Average is greater than both "+n1+" and "+n3);
    else
    System.out.print("Average is not greater than two smallest expenses");
    }
}
