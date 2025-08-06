// Mickey and Miney are walking through a magical forest. The forest is full of enchanted stones, each with a unique number. There is a legend that says the magic power of the stones can be revealed by using a special operation. To determine the magic power of a given stone, you need to perform a bitwise AND operation with the number 15.


// Each stone's number is represented by an integer, and Mickey needs to find the magic power of each stone by applying this operation. 


// Your task is to help Mickey compute the result of the bitwise AND operation of the given stone number with 15, and print the result.
// Input format :

// The input consists of a single integer.
// Output format :

// The output should display a single integer, which is the result of the bitwise AND operation between input and 15.


// Refer to the sample output for format specifications.
// Code constraints :

// The given test cases will fall under the following constraints.

// 1 ≤ Input integer ≤ 100
// Sample test cases :
// Input 1 :

// 25

// Output 1 :

// 9

// Input 2 :

// 9

// Output 2 :

// 9

// Input 3 :

// 212

// Output 3 :

// 4

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_PAH_2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.print(n&15);
        
    }
}
