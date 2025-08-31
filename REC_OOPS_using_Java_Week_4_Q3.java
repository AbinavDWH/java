// Bechan Chacha is seeking help to filter out valid mobile numbers from a list provided by his crush. He can only pick his crush's number if the list contains valid mobile numbers.


// A mobile number is considered valid if:


//     It has exactly 10 digits.
//     It consists only of numeric values (0–9).
//     It does not begin with zero.


// Your task is to determine whether each mobile number in the list is valid or not.
// Input format :

// The first line contains an integer T, representing the number of mobile numbers to check.

// The next T lines each contain a string S, representing a mobile number.
// Output format :

// For each mobile number S, the output print "YES" if it is valid.

// Otherwise, print "NO".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ T ≤ 1000

// The combined length of all mobile numbers does not exceed 100,000

// The string may contain numerical, special and alphabetical characters.
// Sample test cases :
// Input 1 :

// 1
// 9876543210

// Output 1 :

// YES

// Input 2 :

// 1
// 0123456789

// Output 2 :

// NO

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_4_Q3 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            String s=scan.nextLine();
            if(s.matches("\\d+")&& '0'!=s.charAt(0) && s.length()==10)
            System.out.print("Yes\n");
            else
            System.out.print("No\n");
        }
    }    
}
