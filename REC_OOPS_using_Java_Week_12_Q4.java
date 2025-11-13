
// Abi is working on a text analysis project where she needs to categorize words based on their length.


// Words that have three or fewer characters are considered “Short”, while


// words with more than three characters are classified as “Long.”

// Write a Java program that takes a sentence as input, analyzes each word, and prints a list showing whether each word is “Short” or “Long.”


// Use the predefined functional interface Function<String, String> along with a lambda expression for categorization.
// Input format :

// A single line containing a sentence (words separated by spaces).
// Output format :

//     A single line with each word categorized as "Short" or "Long", separated by spaces.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The sentence can have both lowercase and uppercase letters.

// Maximum sentence length: 50 characters.


// Sample test cases :
// Input 1 :

// I love my cat

// Output 1 :

// Short Long Short Short 

// Input 2 :

// The sun shines bright

// Output 2 :

// Short Short Long Long 

// Input 3 :

// We are family

// Output 3 :

// Short Short Long 

import java.util.Scanner;
import java.util.function.Function;

public class REC_OOPS_using_Java_Week_12_Q4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        Function<String,String> f=s->s.length()<=3?"Short ":"Long ";
        
        String str[]=scan.nextLine().split(" ");
        
        for(int i=0;i<str.length;i++){
            System.out.print(f.apply(str[i]));
        }
    }   
}
