
// At a digital library, the system needs to analyze passages to identify the frequency of vowels, since they are key for linguistic research. You are asked to write a program that counts the number of vowels in each passage of text.


// The vowels of interest are:

// a, e, i, o, u (both uppercase and lowercase).
// Input format :

// The first line of input contains an integer T, representing the number of test cases (passages).

// Each of the next T lines contains a single passage of text.
// Output format :

// For each test case, print a single integer representing the total number of vowels in the passage.

// The first line of output corresponds to the first passage, the second line to the second passage, and so on.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ T ≤ 100

// Length of each passage ≤ 1000 characters

// Passages may contain letters, digits, spaces, and punctuation symbols
// Sample test cases :
// Input 1 :

// 1
// Hello World

// Output 1 :

// 3

// Input 2 :

// 1
// bcd fgh

// Output 2 :

// 0

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_4_PAH_1 {
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            String s=scan.nextLine();
            int sum=0;
            for(int j=0;j<s.length();j++){
                if(String.valueOf(s.charAt(j)).matches("[AEIUOaeiou]"))
                sum++;
            }
            System.out.println(sum);
        }
    }       
}
