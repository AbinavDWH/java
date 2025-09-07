// Neha is analyzing text messages to identify words that have repeated characters. A word is considered “repetitive” if any character appears more than once in that word.


// Your task is to write a program that extracts all words that contain repeated characters from a given sentence.


// If no such word exists, print "No repetitive words found".
// Input format :

// The input contains a single line containing a sentence with multiple words.
// Output format :

// The output prints all words that contain repeated characters separated by a space.

// If no word contains repeated characters, print "No repetitive words found".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ |S| ≤ 1000 (length of the input sentence)

// Words are separated by a single space

// Words may contain letters and digits
// Sample test cases :
// Input 1 :

// letter balloon apple tree

// Output 1 :

// letter balloon apple tree

// Input 2 :

// dog cat fish

// Output 2 :

// No repetitive words found

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_4_CY_1 {
    static boolean isrept(String str){
        int l=str.length();
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(str.charAt(i)==str.charAt(j))
                return true;    
            }
        }
         return false;
    }
    
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String str[]=s.split(" ");
        int f=0;
        for(int i=0;i<str.length;i++){
            if(isrept(str[i])){
                System.out.print(str[i]+" ");
                f=1;
            }
        }
        if(f==0){
            System.out.print("No repetitive words found");
        }
    }    
}
