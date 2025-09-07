// Ravi is analyzing text messages for his research on typing patterns. He wants to count the number of uppercase letters, lowercase letters, and digits in a sentence to understand typing trends.


// Your task is to help Ravi by writing a program that takes a sentence and prints the count of uppercase letters, lowercase letters, and digits.
// Input format :

// The input contains a single line containing a sentence (string).
// Output format :

// The output prints three integers separated by spaces:

//     Number of uppercase letters
//     Number of lowercase letters
//     Number of digits


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ length of the string ≤ 1000

// The string may contain letters, digits, spaces, and punctuation symbols.
// Sample test cases :
// Input 1 :

// Hello World 123

// Output 1 :

// 2 8 3

// Input 2 :

// AI2025 Rocks

// Output 2 :

// 3 4 4

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_4_PAH_4 {
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        String s=scan.nextLine();
        int u=0,l=0,d=0;
        for(int i=0;i<s.length();i++){
            String str=(String.valueOf(s.charAt(i)));
            if(str.matches("[a-z]"))
            l++;
            else if(str.matches("[A-Z]"))
            u++;
            else if(str.matches("[0-9]"))
            d++;
        }
        
        System.out.print(u+" "+l+" "+d);
    }
}
