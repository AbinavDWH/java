
// ﻿﻿Sharon is creating a program that finds the first repeated element in an integer array. The program should efficiently identify the first element that appears more than once in the given array. If no such element is found, it should appropriately display a message.


// Help Sharon to complete the program.
// Input format :

// The first line of input consists of an integer n, representing the number of elements in the array.

// The second line consists of n space-separated integers, representing the array elements.
// Output format :

// If a repeated element is found, print the first element that appears more than once.

// If no repeated element is found, print "No repeated element found in the array".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ n ≤ 50

// 1 ≤ array elements ≤ 100
// Sample test cases :
// Input 1 :

// 8
// 12 21 13 14 21 36 47 21

// Output 1 :

// 21

// Input 2 :

// 5
// 15 23 15 34 23

// Output 2 :

// 15

// Input 3 :

// 6
// 14 28 32 46 54 65

// Output 3 :

// No repeated element found in the array

import java.util.Arrays;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_3_Q5 {
    static boolean rep(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]);
                return true;
            }
        }
        return false;
    }
    
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        if(!rep(arr)){
            System.out.print("No repeated element found in the array");
        }
    }
}
