// // Noah is analyzing numbers within a given range [A, B] and wants to calculate a special sum. For each number in the range, he calculates the product of its odd digits (ignoring even digits). If the number contains no odd digits, it is skipped. The sum of these products for all numbers in the range is the result. 


// Write a program to compute this sum.


// Example


// Input:

// 10 12

// Output:

// 3

// Explanation:

// For 10, odd digits = 1, product = 1.

// For 11, odd digits = 1, 1, product = 1 * 1 = 1.

// For 12, odd digits = 1, product = 1.

// Total sum = 1 + 1 + 1 = 3
// Input format :

// The input consists of two space-separated integers A and B, representing the inclusive range boundaries.
// Output format :

// The output prints a single integer representing the sum of the products of odd digits for all numbers in the range.


// Refer to the sample output for the formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ A, B ≤ 103, and A ≤ B
// Sample test cases :
// Input 1 :

// 10 12

// Output 1 :

// 3

// Input 2 :

// 15 17

// Output 2 :

// 13

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_CY_3 {
    static int sum=0;
    static void odd(int n){
        int a=n,p=0;
        while(n>0){
            if(n%2!=0){
                p=1;
            }
            n/=10;
        }
        while(a>0){
            if(a%2!=0){
                p*=a%10;
            }a/=10;
        }
        sum+=p;
    }
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt(),n2=scan.nextInt();
        for(int i=n1;i<=n2;i++){
            odd(i);
        }
        System.out.print(sum);
    }
}
