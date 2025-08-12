// Rohit is tasked with designing a program to analyze the digits of a given integer. 


// Write a program to help Rohit that takes an integer as input and identifies the minimum odd digit and the maximum even digit present in the number. If no odd or even digits are present, display appropriate messages. 


// Implement the solution using a 'while' loop to iterate through the digits of the given number.
// Input format :

// The input consists of an integer n.
// Output format :

// The first line of output prints the message "Minimum odd digit: " followed by an integer representing the smallest odd digit found in the input number.

// If no odd digit exists, it prints "There are no odd digits in the number."

// The second line of output prints the message "Maximum even digit: " followed by an integer representing the largest even digit found in the input number.

// If no even digit exists, it prints "There are no even digits in the number."


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ n ≤ 107
// Sample test cases :
// Input 1 :

// 3465

// Output 1 :

// Minimum odd digit: 3
// Maximum even digit: 6

// Input 2 :

// 97975

// Output 2 :

// Minimum odd digit: 5
// There are no even digits in the number.

// Input 3 :

// 24642

// Output 3 :

// There are no odd digits in the number.
// Maximum even digit: 6

import java.util.Arrays;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_PAH_1 {
    static int z=-1,y=-1; 
    static int o[]=new int[7];
    static int  e[]=new int[7];
    
    static void isodd(int n){
        if(n%2!=0)
        o[++z]=n;
        else
        e[++y]=n;
    }
    
    
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        String n=scan.nextLine();
        char num[]=n.toCharArray();
        for(int i=0;i<num.length;i++){
            isodd(num[i]-'0');
        }
        Arrays.sort(o);
        Arrays.sort(e);
        if(z<0){
            System.out.println("There are no odd digits in the number.");
        }else{
            System.out.println("Minimum odd digit: "+o[o.length-1-z]);
        }
        if(y<0){
            System.out.println("There are no even digits in the number.");
        }else{
            System.out.println("Maximum even digit: "+e[e.length-1]);
        }
        // for(int a:o){
        //     System.out.print(a);
        // }
    }
}
