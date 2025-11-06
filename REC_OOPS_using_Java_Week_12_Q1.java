// Sabrina is working on a project that involves analyzing a set of numbers. In her exploration, she encounters scenarios where extracting even numbers and finding their sum is essential.


// Create a program that calculates the sum of even numbers from a given array of integers using a lambda expression.
// Input format :

// The first line of input consists of an integer N, representing the size of the array.

// The second line consists of N space-separated integers, representing the elements of the array.
// Output format :

// The output prints the sum of the even integers from the array.


// Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// 1 ≤ N ≤ 10

// 1 ≤ array elements ≤ 100
// Sample test cases :
// Input 1 :

// 3
// 29 37 45

// Output 1 :

// 0

// Input 2 :

// 5
// 12 56 98 74 35

// Output 2 :

// 240

// Input 3 :

// 8
// 25 34 16 23 67 93 24 15

// Output 3 :

// 74

import java.util.Scanner;

@FunctionalInterface
interface addIfEven{
    int even(int a);
}

class REC_OOPS_using_Java_Week_12_Q1{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int t=0;
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        
        addIfEven eev=(a)->a%2==0?a:0;
        for(int i=0;i<n;i++){
            t+=eev.even(arr[i]);
        }
        System.out.print(t);
    }
}