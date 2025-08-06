
// Gilbert is tasked with writing a program that checks whether a given integer is an odd number. An odd number is one that cannot be exactly divided by 2. The program should take an integer as input and determine if it is an odd number or not. The task is to implement the logic to check if the provided integer is odd and return the result.
// Input format :

// The first line of the input contains an integer, "input".
// Output format :

// The output should display a boolean value, "result," which should be set to true if the input integer is an odd number and false if it is even.


// Refer to the sample output for formatting specifications.
// Code constraints :

// -109 ≤ input ≤ 109


// Sample test cases :
// Input 1 :

// 0

// Output 1 :

// Is the integer odd? false

// Input 2 :

// -5

// Output 2 :

// Is the integer odd? true

// Input 3 :

// -4

// Output 3 :

// Is the integer odd? false

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_CY_1 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        boolean t=n%2!=0;
        System.out.print("Is the integer odd? "+t);
    }
}
