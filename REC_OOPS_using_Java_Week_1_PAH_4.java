// Maria, a software developer, is working on a program to determine if two given integers which can be either positive or negative integers have the same parity (both even or both odd). She needs your help in writing this program.


// Write a program that takes two integers as input and checks if both integers are either even or odd.
// Input format :

// The input consists of two lines:

// The first line consists of an integer (input1) which can be either positive or negative.

// The second line consists of an integer (input2) which can be either positive or negative.
// Output format :

// The output is dispalyed in the following format:


// If both integers have the same parity (i.e., both even or both odd), print:

// "Both integers are either even or odd"


// Otherwise, print:

// "The integers have different parities"


// Refer to the sample output for the formatting specifications.
// Code constraints :

// The integrs must be in the range of -1000 to 1000.
// Sample test cases :
// Input 1 :

// 2
// -4

// Output 1 :

// Both integers are either even or odd

// Input 2 :

// 64
// 105

// Output 2 :

// The integers have different parities

// Input 3 :

// 999
// 777

// Output 3 :

// Both integers are either even or odd

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_PAH_4 {
     public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt(),n2=scan.nextInt();
        if(n1%2==0&&n2%2==0||n1%2!=0&&n2%2!=0){
            System.out.print("Both integers are either even or odd");
        
        }
        else
        System.out.print("The integers have different parities");
    }
}
