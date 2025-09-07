// // In a college, students are required to create unique usernames for accessing the digital library.

// The librarian needs your help to verify whether the usernames entered by students are valid.


// A username is considered valid if:


//     It contains only letters (a–z, A–Z) and digits (0–9).
//     Its length is between 5 and 15 characters (inclusive).
//     It must start with a letter (not a digit).


// Your task is to determine whether each username in the list is valid or not.
// Input format :

// The first line of input contains an integer T, representing the number of usernames to check.

// The next T lines each contain a string S, representing a username.
// Output format :

// For each username S, the output print "YES" if it is valid.

// Otherwise, the output print "NO".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ T ≤ 1000

// The combined length of all usernames does not exceed 100,000

// The string may contain letters, digits, special characters, and spaces
// Sample test cases :
// Input 1 :

// 1
// Alice123

// Output 1 :

// YES

// Input 2 :

// 1
// 9student

// Output 2 :

// NO

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_4_CY_3 {
    public static void main(String arg[]){
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            String s=scan.nextLine();
            if(s.matches("[a-zA-Z0-9]+")&&s.length()>=5&&s.length()<=15&&!Character.isDigit(s.charAt(0))){
                System.out.print("YES");
            }
            else
            System.out.print("NO");
        }
    }
}
