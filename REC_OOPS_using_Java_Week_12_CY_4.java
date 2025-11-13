// Nethra is a researcher working on a project that involves analyzing experimental data. As part of her analysis, she needs to determine whether a given word is a palindrome or not.


// Create a Java program that allows Nethra to input a word, and then check and display whether the entered word is a palindrome. Use lambda expressions to perform the palindrome check.
// Input format :

// The first line of input consists of a word.
// Output format :

// The output prints whether the given word is a palindrome or not in the following format:

// "<input> is palindrome" or "<input> is not palindrome".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ length of the word ≤ 100
// Sample test cases :
// Input 1 :

// malayalam

// Output 1 :

// malayalam is palindrome

// Input 2 :

// java

// Output 2 :

// java is not palindrome

import java.util.Scanner;
import java.util.function.Function;

public class REC_OOPS_using_Java_Week_12_CY_4 {
     public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        
        Function<String,String> ispali=s->{
            char arr[]=s.toCharArray();
            for(int i=0;i<s.length();i++){
                if(arr[i]!=arr[s.length()-1-i])
                    return s+" is not palindrome";
            }
            
            return s+" is palindrome";
        };
        
        System.out.printf(ispali.apply(scan.nextLine()));
    }    
}
