// Bobby is tasked with processing a sequence of numbers from a monitoring system. He needs to extract a strictly increasing subsequence using an ArrayList. The program should dynamically add numbers to the ArrayList only if they are greater than the last number currently stored in the list. Bobby aims to efficiently utilize the dynamic resizing and indexing features of the ArrayList to solve this problem.


// Help Bobby implement this solution.
// Input format :

// The first line of input consists of an integer N, representing the number of elements.

// The second line consists of N space-separated integers, representing the elements.
// Output format :

// The output prints the list of integers in increasing sequence, ignoring out-of-order elements.


// Refer to the sample output for the formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints

// 1 ≤ N ≤ 20

// 1 ≤ elements ≤ 100
// Sample test cases :
// Input 1 :

// 7
// 3 5 9 1 11 7 13

// Output 1 :

// [3, 5, 9, 11, 13]

// Input 2 :

// 4
// 11 7 5 1

// Output 2 :

// [11]

// Input 3 :

// 5
// 12 37 12 10 39

// Output 3 :

// [12, 37, 39]

import java.util.ArrayList;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_9_Q1 {
    public static void main(String arg[]){
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int t=scan.nextInt();
            if(arr.isEmpty()||arr.get(arr.size()-1)<t){
                arr.add(t);
            }
        }
        System.out.print(arr);
    }
}
