// Maya, a student in an arts and crafts class, wants to create a pattern using stars (*) in a specific format. She plans to use a program to help her construct the pattern.


// Write a program that takes an integer as input and constructs the following pattern using nested for loops.


// Input: 5


// Output:

// * 

// * * 

// * * * 

// * * * * 

// * * * * * 

// * * * * 

// * * * 

// * * 

// *
// Input format :

// The input consists of a number (integer) representing the number of rows.
// Output format :

// The output displays the required pattern.


// Refer to the sample output for the formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ rows ≤ 20
// Sample test cases :
// Input 1 :

// 5

// Output 1 :

// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

// Input 2 :

// 7

// Output 2 :

// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * * * 
// * * * * * * * 
// * * * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_CY_4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }System.out.println("");
        }
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }System.out.println("");
        }
        
    }
}
