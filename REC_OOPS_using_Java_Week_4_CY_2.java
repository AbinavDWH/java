// A bookstore wants to analyze the titles of books to determine their longest word in each title. This helps in designing banners and covers.


// Your task is to write a program that, given a sentence (book title), finds and prints the longest word. If multiple words have the same maximum length, print the first one.
// Input format :

// The input contais a single line containing a sentence representing the book title.
// Output format :

// The output prints a string representing the longest word in the sentence (book title).


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ |S| ≤ 1000 (length of the input sentence)

// Words are separated by a single space

// Words may contain letters, digits, and punctuation
// Sample test cases :
// Input 1 :

// The Chronicles of Narnia

// Output 1 :

// Chronicle

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class REC_OOPS_using_Java_Week_4_CY_2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String arr[]=s.split(" ");
        TreeMap<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            map.put(arr[i].length(),arr[i]);
        }
        System.out.print(map.get(map.firstKey()));
    }
}
