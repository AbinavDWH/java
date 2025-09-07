// Riya is preparing a puzzle game for her friends. She wants to include a feature that highlights special words in a sentence — specifically, palindromic words (words that read the same forward and backward).


// Your task is to help Riya by writing a program that extracts all palindrome words from the given sentence. If there are no palindromes, print "No palindromes found".
// Input format :

// The input contains a single string S representing a sentence.
// Output format :

// The output prints all palindromic words separated by a space.

// If no palindrome exists, print "No palindromes found".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ |S| ≤ 200

// Words are separated by a single space.

// Words contain only lowercase English letters.
// Sample test cases :
// Input 1 :

// madam went to school

// Output 1 :

// madam

// Input 2 :

// hello world

// Output 2 :

// No palindromes found

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_4_PAH_2 {
    static boolean ispali(String str){
        int l=str.length();
        for(int i=0;i<l;i++){
            if(str.charAt(i)!=str.charAt(l-i-1))
            return false;
        }
        return true;
    }
    public static void main(String arg[]){
        int f=0;
        Scanner scan =new Scanner(System.in);
        String s=scan.nextLine();
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(ispali(arr[i])){
                f=1;
                System.out.print(arr[i]+" ");
            }
        }
        if(f==0){
            System.out.print("No palindromes found");
        }
    }
}
