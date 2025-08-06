// In a logistics company, each delivery pack contains a specific number of items, and the priority customer receives double the amount. Write a program to determine the total number of delivery packs required for the operation, considering the number of items per pack and the number of customers given as input by the user.


// Example


// Input:

// Number of items per pack = 96

// Number of customers = 8

// Output:

// 10

// Explanation:

// Given the number of items per pack = 96 and the number of customers = 8, the calculations are as follows:

//     Total number of items needed = number of items per pack * number of customers = 96 * 8 = 768.
//     Priority customer's share = double the amount of items per pack = 2 * 96 = 192.
//     Total items with the priority customer = total items needed + priority share = 768 + 192 = 960.
//     Number of packs needed = (960 + 96 − 1)/ 96 = 10.98

// Since we cannot have a fraction of a pack, the output is 10.
// Input format :

// The input consists of two space-separated integers N and C, representing the number of items per pack and the number of customers.
// Output format :

// The output displays an integer, representing the total number of delivery packs required for the operation.


// Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// 1 ≤ N ≤ 100

// 1 ≤ C ≤ 10
// Sample test cases :
// Input 1 :

// 1 1

// Output 1 :

// 3

// Input 2 :

// 43 7

// Output 2 :

// 9

// Input 3 :

// 96 8

// Output 3 :

// 10

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_CY_2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt(),n2=scan.nextInt();
        
        int t=n1*n2,p=n1*2,to;
        to=t+p;
        to=(to+n1-1)/n1;
        System.out.print(to);
        
        
    }
}
