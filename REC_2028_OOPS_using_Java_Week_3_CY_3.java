// magine you have an array of integer values, and you're tasked with identifying a pair of elements within the array. This pair of elements should have a sum that is the closest to zero when compared to any other pair in the array.


// Your goal is to create a program that solves this problem efficiently. The program should accept an array of integers and return the pair of elements whose sum is closest to zero.
// Input format :

// The first line of the input is an integer N representing the size of the array.

// The second line of the input contains N space-separated integer values.
// Output format :

// The output is displayed in the following format:

// "Pair with the sum closest to zero: {value} and {value}"


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 100

// -1000 ≤ array elements ≤ 1000

// elements displayed based on the input order.
// Sample test cases :
// Input 1 :

// 5
// 9 10 -3 -5 -2

// Output 1 :

// Pair with the sum closest to zero: 9 and -5

// Input 2 :

// 4
// 2 -7 1 6

// Output 2 :

// Pair with the sum closest to zero: -7 and 6

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class REC_2028_OOPS_using_Java_Week_3_CY_3 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i!=j)
                list.add(Math.abs(arr[i]+arr[j]));
            }
        }
        Collections.sort(list);
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i!=j&&list.get(0)==Math.abs(arr[i]+arr[j])){
                System.out.print("Pair with the sum closest to zero: "+arr[i]+" and "+arr[j]);
                    System.exit(0);
                }
            }
        }
        
    }    
}
