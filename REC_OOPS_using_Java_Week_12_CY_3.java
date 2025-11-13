// Riya is developing a college admission system that assigns unique roll numbers to each newly admitted student.

// Each roll number should follow this fixed format:

// <DEPT>-<YEAR>-<4-digit-sequence>


// where:

//     <DEPT> is the department code (in uppercase, e.g., CSE, ECE, MECH).
//     <YEAR> is the admission year (e.g., 2025).
//     <4-digit-sequence> starts from a given number and increases sequentially for each student.

// Write a Java program using a Supplier<String> lambda to generate and print the roll numbers for n students.
// Input format :

// First line: integer n — number of roll numbers to generate

// Second line: string DEPT — department code (uppercase letters only)

// Third line: integer YEAR — admission year

// Fourth line: integer start — starting sequence number (0 ≤ start ≤ 9999)
// Output format :

// Print n roll numbers, one per line, in the required format

// Sequence must be zero-padded to 4 digits

// If sequence exceeds 9999, wrap around to 0000
// Code constraints :

// 1 ≤ n ≤ 50

// DEPT length: 2–10 uppercase letters

// YEAR: 2000–2100

// 0 ≤ start ≤ 9999
// Sample test cases :
// Input 1 :

// 5
// CSE
// 2025
// 98

// Output 1 :

// CSE-2025-0098
// CSE-2025-0099
// CSE-2025-0100
// CSE-2025-0101
// CSE-2025-0102

// Input 2 :

// 3
// ECE
// 2024
// 9997

// Output 2 :

// ECE-2024-9997
// ECE-2024-9998
// ECE-2024-9999

import java.util.Scanner;
import java.util.function.Supplier;

public class REC_OOPS_using_Java_Week_12_CY_3 {
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        int i[]={0};
        Supplier<Integer> print =()->{
            return i[0]++;
        };
        
        int n=scan.nextInt();
        scan.nextLine();
        String dept=scan.nextLine();
        int y=scan.nextInt();
        int id=scan.nextInt();
        for(int j=0;j<n;j++)
        System.out.printf("%s-%d-%04d\n",dept,y,(print.get()+id)%10000);
    }    
}
