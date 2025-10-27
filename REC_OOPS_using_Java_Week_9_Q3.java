// Assist Pranitha in developing a program that takes an integer N as input, representing the number of names to be read. Then read N names and store them in an ArrayList. Finally, input a search string and output the frequency of that string in the list of names.


// Note: Some parts of the code are provided as snippets, and you need to complete the remaining sections by writing the necessary code.
// Input format :

// The first line of input consists of an integer N, representing the number of names to be read.

// The following N lines consist of N names, as a string.

// The last line consists of a string, representing the name to be searched.
// Output format :

// The output prints a single integer, representing the frequency of the specified name in the given list.

// If the specified name is not found, print 0.


// Refer to the sample output for formatting specifications.
// Code constraints :

// 2 ≤ N ≤ 10

// The maximum length of the input string is 100.

// The input strings are case-sensitive.
// Sample test cases :
// Input 1 :

// 5
// Alice
// Bob
// Ankit
// Alice
// Pranitha
// Alice

// Output 1 :

// 2

// Input 2 :

// 3
// Mitchell
// Sofia
// Lily
// Cameron

// Output 2 :

// 0

// Input 3 :

// 6
// Benjamin
// Emma
// Emma
// Benjamin
// emma
// Daniel
// Emma

// Output 3 :

// 2
// // 

import java.util.ArrayList;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_9_Q3 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        
        int n=scan.nextInt();
        
        scan.nextLine();
        for(int i=0;i<n;i++){
            arr.add(scan.nextLine());    
        }
        String ch=scan.nextLine();
        int i=0;
        for(String s:arr){
            if(s.equals(ch))
            i++;
        }
        System.out.print(i);
    }
}
