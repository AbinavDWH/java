// Maria, a software developer, is working on a project to create a simple program to determine which of two integers is closest to zero. The integers can be either positive or negative. The program needs to take two integer inputs and calculate which one is closer to zero. If both integers are equidistant from zero, the program should return 0.
// Input format :

// The input contains two lines:

// The first line of the input contains an integer, which can be either a positive or a negative integer.

// The second line of the input contains an integer, which can be either a positive or a negative integer.
// Output format :

// The output displays the integer that is closest to zero in the following format:


// "The integer closest to zero is: [closest_integer]"


// Here, [closest_integer] should be replaced with the integer that is closer to zero based on its absolute value.


// Refer to the sample output for the formatting specifications.
// Code constraints :

// The input integers can be positive or negative.

// The absolute values of the input integers will not exceed 2,000.
// Sample test cases :
// Input 1 :

// 5
// 8

// Output 1 :

// The integer closest to zero is: 5

// Input 2 :

// -15
// -10

// Output 2 :

// The integer closest to zero is: -10

// Input 3 :

// 1000
// 100

// Output 3 :

// The integer closest to zero is: 100

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_PAH_1 {
        public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n1=(scan.nextInt()),n2=(scan.nextInt());
        int n;
        if(Math.abs(n1)<Math.abs(n2))
        n=n1;
        else if (Math.abs(n1)>Math.abs(n2))
        n=n2;
        else
        n=0;
        System.out.print("The integer closest to zero is: "+n);
        
    }     
}
