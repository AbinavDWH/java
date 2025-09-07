
// ﻿A library wants to analyze book titles to count the number of words that start with an uppercase letter. This helps the library track proper nouns and important words in titles.


// Your task is to write a program that, for each given title, counts and prints the number of words that start with an uppercase letter.
// Input format :

// The first line contains an integer T, representing the number of book titles.

// Each of the next T lines contains a single title (string).
// Output format :

// For each title, the output print a single integer representing the number of words starting with an uppercase letter.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ T ≤ 100

// 1 ≤ length of each title ≤ 1000

// Words are separated by a single space

// Titles may contain letters, digits, spaces, and punctuation symbols
// Sample test cases :
// Input 1 :

// 1
// The Chronicles of Narnia

// Output 1 :

// 3

// Input 2 :

// 1
// a tale of two cities

// Output 2 :

// 0

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_4_CY_4 {
    static int c=0;
    
    
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            c=0;
            String s=scan.nextLine();
            String arr[]=s.split(" ");
            for(int j=0;j<arr.length;j++){
                if(Character.isUpperCase(arr[j].charAt(0)))
                c++;
            }
            System.out.println(c);
        }
    }
}
