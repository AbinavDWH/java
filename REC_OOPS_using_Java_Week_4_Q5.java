// In a secure banking system, customers are required to create PIN codes for accessing their accounts. The bank wants to validate these PIN codes before accepting them.


// A PIN code is considered valid if:


//     It consists of exactly 4 digits.
//     All characters must be numeric (0–9).
//     It cannot contain all identical digits (e.g., 1111 is invalid).


// Your task is to determine whether each PIN code in the list is valid or not.
// Input format :

// The first line of input contains an integer T, representing the number of PIN codes to check.

// The next T lines each contain a string S, representing a PIN code.
// Output format :

// For each PIN code S, the output print "YES" if it is valid.

// Otherwise, the output print "NO".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ T ≤ 1000

// The combined length of all PIN codes does not exceed 10,000

// Each PIN may contain digits, letters, or special characters
// Sample test cases :
// Input 1 :

// 1
// 1234

// Output 1 :

// YES

// Input 2 :

// 1
// 1111

// Output 2 :

// NO

// Input 3 :

// 1
// 12a47

// Output 3 :

// NO

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_4_Q5 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            String s=scan.nextLine();
            if(s.matches("[0-9]+") && s.length()==4&& (s.charAt(0)!=s.charAt(1)||s.charAt(1)!=s.charAt(2)||s.charAt(2)!=s.charAt(3)))
            System.out.println("YES");
            else
            System.out.println("No");
        }
    }
}
