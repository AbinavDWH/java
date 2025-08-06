
// Tom is tasked with writing a program that determines whether a given integer is the square of another integer. A perfect square is a number that can be expressed as the square of an integer. The program should take an integer as input and determine if it is a perfect square or not. 


// The task is to implement the logic to check if the provided integer is the square of an integer and return the result.
// Input format :

// The first line of the input contains an integer, "input", where |input| represents the absolute value of the integer.
// Output format :

// The output should display a boolean value, "result," which should be set to true if the input is a perfect square (the square of an integer), and false if it is not.


// Refer to the sample output for formatting specifications.
// Code constraints :

// -109 ≤ input ≤ 109
// Sample test cases :
// Input 1 :

// 16

// Output 1 :

// Is the integer a perfect square? true

// Input 2 :

// -16

// Output 2 :

// Is the integer a perfect square? false

// Input 3 :

// -90

// Output 3 :

// Is the integer a perfect square? false

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_CY_4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double s=Math.sqrt(n);
        boolean t=(s==(double)(int)s);
        
        // String str;
        System.out.print("Is the integer a perfect square? "+t);
    
        
        
    }
}
