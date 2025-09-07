
// Sana is analyzing text for a secret code. She wants to find all words in a sentence that start and end with the same letter. These words are considered "special words" for her analysis.


// Your task is to write a program that extracts and prints all words that start and end with the same letter (case-insensitive).


// If no such word exists, print "No special words found".
// Input format :

// The input contains a single line containing a sentence with multiple words.
// Output format :

// The output prints all words that start and end with the same letter separated by a space.

// If no word satisfies the condition, print "No special words found".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ |S| ≤ 1000 (length of the input sentence)

// Words are separated by a single space

// Words may contain letters (a–z, A–Z) and digits
// Sample test cases :
// Input 1 :

// Anna went to the civic center

// Output 1 :

// Anna civic

// Input 2 :

// Hello world

// Output 2 :

// No special words found

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_4_PAH_3 {
    static boolean isspec(String str){
        int l=str.length();
        return str.charAt(0)==str.charAt(l-1);
    }
    
    
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int f=0;
        String arr[]=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(isspec(arr[i].toLowerCase())){
                System.out.print(arr[i]+" ");
                f=1;
            }
        }
        if(f==0){
            System.out.print("No special words found");
        }
    }
}
