
// Sanjay is working on a program to merge two sorted linked lists into a single sorted list using Java's LinkedList class from the Collections framework. Given two sorted linked lists, he wants to merge them while maintaining the sorted order.


// Write a Java program that:

//     Reads two sorted linked lists.
//     Merges them into a single sorted linked list.
//     Prints the merged list in ascending order.

// Input format :

// The first line contains an integer m (the size of the first linked list).

// The second line contains m space-separated integers (sorted).

// The third line contains an integer n (the size of the second linked list).

// The fourth line contains n space-separated integers (sorted).
// Output format :

// The output prints the merged linked list as space-separated integers.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 0 ≤ m, n ≤ 100

// 1≤ list elements ≤1000

// The two linked lists are already sorted in non-decreasing order.
// Sample test cases :
// Input 1 :

// 2
// 5 10
// 3
// 1 3 8

// Output 1 :

// 1 3 5 8 10 

// Input 2 :

// 3
// 2 6 8
// 3
// 1 3 7

// Output 2 :

// 1 2 3 6 7 8 

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_9_CY_1 {
    public static void main(String[] args) {
        //type your code here
        LinkedList<Integer> node =new LinkedList<>();
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        
        for(int i=0;i<n;i++){
            node.add(scan.nextInt());
        }
        
        n=scan.nextInt();
        
        for(int i=0;i<n;i++){
            node.add(scan.nextInt());
        }
        
        Collections.sort(node);
        
        for(int i:node){
            System.out.print(i+" ");
        }
    }    
}
