// You are given a number of distribution centers (rows) and are tasked with generating a zigzag shipment route pattern. Each shipment route should alternate between left-to-right and right-to-left, as described below. 


// The program should print the zigzag pattern with a tab (\t) separating the columns. For each row, the shipment numbers should follow a diagonal pattern where numbers are placed in a zigzag, left to right on odd rows and right to left on even rows.


// Input format :

// The input consists of an integer N, which represents the number of distribution centers (rows) for the zigzag pattern.
// Output format :

// The output prints the zigzag pattern with N rows, formatted with a tab space (\t) separating the columns.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following specifications:

// 1 ≤ N ≤ 50
// Sample test cases :
// Input 1 :

// 5

// Output 1 :

// 				1		
// 			2		6		
// 		3		7		10		
// 	4		8		11		13		
// 5		9		12		14		15		

// Input 2 :

// 3

// Output 2 :

// 		1		
// 	2		4		
// 3		5		6		

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_PAH_3 {
         public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            int t=n-1;
            int l=i;
            System.out.print(i+"\t");
            for(int j=0;j<i-1;j++){
                l+=(t--);
                System.out.print(l+"\t");
            }System.out.println("");
        }
        
    }
}
