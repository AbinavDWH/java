// Nikila is working as an intern in a software firm and is practicing with a matrix where each row represents a set of numerical values. Her task is to identify the row with the highest sum of its elements and remove that row from the matrix. After removing the row with the highest sum, Nikila needs to print the updated matrix.


// Your task is to help Nikila in implementing the same. If there are two or more rows that have same the highest sum, the firstly encountered row is deleted.
// Input format :

// The first line of the input consists of two space-separated integers, R and C, representing the number of rows and columns in the matrix, respectively.

// The following R lines each contain, C space-separated integers representing the matrix elements.
// Output format :

// The output prints the matrix after removing the row with the highest sum. Each row should be printed on a new line, with elements separated by a space.


// Refer to the sample output for the formatting specifications.
// Code constraints :

// In this scenario given test cases will fall under the following constraints:

// 1 ≤ R, C ≤ 10

// 1 ≤ matrix elements ≤ 100
// Sample test cases :
// Input 1 :

// 2 2
// 1 2
// 3 4

// Output 1 :

// 1 2 

// Input 2 :

// 3 3
// 5 1 2
// 2 3 4
// 1 1 1

// Output 2 :

// 5 1 2 
// 1 1 1 

// Input 3 :

// 2 2
// 1 3
// 2 2

// Output 3 :

// 2 2 

import java.util.Arrays;
import java.util.Scanner;

public class REC_2028_OOPS_using_Java_Week_3_CY_2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        
        int m=scan.nextInt(),n=scan.nextInt();
       int arr[][]=new int[m][n];
       int c[]=new int[n];
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j]=scan.nextInt();
            }
            c[i]=sum;
            
        }
        Arrays.sort(c);
        int flag=0;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
            if(flag==0&&sum==c[n-1]){
                flag=1;
                continue;
            }
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        
    }
}
