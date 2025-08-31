
// Arjun is learning how to filter words from a sentence based on grammar rules. He wants to identify the valid words in a sentence.


// A word is considered valid if it satisfies all these conditions:


//     The word contains only alphabets (a–z, A–Z).
//     The word length is at least 2 characters.
//     The word should not contain digits or special characters.


// Your task is to read a sentence and print all the valid words in it.
// Input format :

// The input contains a single line containing a sentence S.
// Output format :

// The output prints all the valid words separated by spaces.

// If no valid word exists, print "No valid words."


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1≤∣S∣≤1000 (length of the input sentence)

// Sentence S may contain alphabets, digits, spaces, and special characters.

// Words are separated by one space.

// A valid word:

//     Contains only letters a-z or A-Z.
//     Must have a length of at least 2.

// Sample test cases :
// Input 1 :

// Hello world1 123 ab" @#$ Hi

// Output 1 :

// Hello Hi

// Input 2 :

// a b c3e

// Output 2 :

// No valid words

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_4_Q4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        String s = scan.nextLine();
        String arr[]=s.split(" ");
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].matches("[a-zA-Z]+")&& arr[i].length()>=2){
                System.out.print(arr[i]+" ");
                n++;
            }
            
        }
        if(n==0)
        System.out.print("No valid words.");
    }
}
