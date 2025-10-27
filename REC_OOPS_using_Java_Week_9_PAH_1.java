// Aditi is analyzing stock market trends and wants to find the Next Greater Element (NGE) for each stock price in a list. The Next Greater Element for an element x in an array is the first element to the right that is greater than x. If no greater element exists, return -1 for that position.


// Your task is to help Aditi by efficiently computing the Next Greater Element for each element in the given array using a Stack.


// Example:

// Input:

// 6  

// 4 5 2 10 8 6

// Output:

// 5 10 10 -1 -1 -1 

// Explanation:

// For each element:

//     4 → 5 (next greater element)
//     5 → 10
//     2 → 10
//     10 → -1 (No greater element)
//     8 → -1
//     6 → -1

// Input format :

// The first line contains an integer n, representing the number of elements.

// The second line contains n space-separated integers arr[i], where arr[i] is the stock price on the i-th day.
// Output format :

// The output prints n space-separated integers representing the Next Greater Element for each element in the array.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ n ≤ 10

// 1 ≤ arr[i] ≤ 1000

// The solution must run in O(n) time complexity using a stack.
// Sample test cases :
// Input 1 :

// 6  
// 4 5 2 10 8 6

// Output 1 :

// 5 10 10 -1 -1 -1 

// Input 2 :

// 5
// 30 20 25 28 35

// Output 2 :

// 35 25 28 35 -1 

import java.util.Scanner;
import java.util.Stack;

public class REC_OOPS_using_Java_Week_9_PAH_1 {
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        Stack<Integer> top =new Stack<>();
        
        int n=scan.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            int j;
            for( j=i;j<n;j++){
                if(arr[i]<arr[j]){
                    top.push(arr[j]);
                    break;
                }
            }
            if(j==n){
                top.push(-1);
                
            }
        }
        for(int i:top){
            System.out.print(i+" ");
        }
        
    }
}
