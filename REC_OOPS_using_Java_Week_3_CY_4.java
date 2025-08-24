// Priya is building a system to automate image transformations using matrix operations. To do this, she needs to multiply two matrices representing pixel data and transformation rules. 


// Help Priya perform matrix multiplication and print the resulting matrix if the operation is valid.
// Input format :

// The first line of input consists of two int values, representing the number of rows R1 and columns C1 of the first matrix.

// The next R1 × C1 integers represent the elements of the first matrix.

// The next line consists of two int values, representing the number of rows R2 and columns C2 of the second matrix.

// The next R2 × C2 integers represent the elements of the second matrix.
// Output format :

// If matrix multiplication is possible, print R1 lines, each containing C2 space-separated int values representing the resulting matrix.

// Otherwise, print "Matrix multiplication not possible".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ R1, C1, R2, C2 ≤ 10

// 0 ≤ Matrix Elements ≤ 10000
// Sample test cases :
// Input 1 :

// 2 3
// 1 2 3
// 4 5 6
// 3 2
// 7 8
// 9 10
// 11 12

// Output 1 :

// 58 64 
// 139 154 

// Input 2 :

// 1 1
// 5
// 1 1
// 4

// Output 2 :

// 20 

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_3_CY_4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int m1=scan.nextInt(),n1=scan.nextInt();
        int arr1[][]=new int[m1][n1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr1[i][j]=scan.nextInt();
            }
        }
        
        int m2=scan.nextInt(),n2=scan.nextInt();
        int arr2[][]=new int[m2][n2];
        for(int i=0;i<m2;i++){
            for(int j=0;j<n2;j++){
                arr2[i][j]=scan.nextInt();
            }
        }
        if(n1!=m2){
            System.out.print("Matrix multiplication not possible");
        }
        else{
            
            int re[][]=new int[m1][n2];
            for(int i=0;i<m1;i++){
                for(int j=0;j<n2;j++){
                    re[i][j]=0;
                    for(int k=0;k<n1;k++){
                        re[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            for(int i=0;i<m1;i++){
                for(int j=0;j<n2;j++){
                    System.out.print(re[i][j]+" ");
                }System.out.println(" ");
            }
        }
    }
}
