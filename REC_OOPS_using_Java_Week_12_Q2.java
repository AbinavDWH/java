// Alex is learning about Java’s functional interfaces and lambda expressions.


// He wants to write a simple program that prints the square of each number in an array using a predefined functional interface.

// Help Alex complete this task using the Consumer functional interface.
// Input format :

//     The first line contains an integer N, the number of elements in the array.
//     The second line contains N space-separated integers.

// Output format :

//     Print the squares of all elements in the array, separated by a space.


// Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// 1 ≤ N ≤ 15

// 1 ≤ array elements ≤ 50


// Sample test cases :
// Input 1 :

// 4
// 1 2 3 4

// Output 1 :

// 1 4 9 16 

// Input 2 :

// 5
// 2 3 4 5 6

// Output 2 :

// // 4 9 16 25 36 

import java.util.Scanner;

@FunctionalInterface
interface it{
    int sq(int n);
}


public class REC_OOPS_using_Java_Week_12_Q2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        it eve = (a)->a*a;
        for(int i=0;i<n;i++){
            int a=scan.nextInt();
            System.out.print(eve.sq(a)+" ");
        }
    }
}
