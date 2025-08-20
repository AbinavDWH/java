
// You are developing a warehouse management system for a shipping company. The system uses an integer array to represent the weights of packages in a specific order. To verify that the weight capacity is not exceeded, the program needs to calculate the sum of the weights of the first and last packages in the list.


// Task:

// Write a code to calculate the sum of the weights of the first and last packages in the list. The program should take an integer array as input and return the total weight of the first and last packages.
// Input format :

// The first line of the input is an integer N representing the size of the array.

// The second line of the input is N space-separated integer values.
// Output format :

// The output is displayed in the following format:

// "Sum of the first and last elements: <<Sum>>"


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ N ≤ 20

// -100 ≤ Elements ≤ 100
// Sample test cases :
// Input 1 :

// 5
// 10 20 30 40 50

// Output 1 :

// Sum of the first and last elements: 60

// Input 2 :

// 9
// 100 -200 300 -400 500 -600 700 800 -900

// Output 2 :

// Sum of the first and last elements: -800

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_3_Q3 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Sum of the first and last elements: "+(arr[0]+arr[n-1]));
    }
}
