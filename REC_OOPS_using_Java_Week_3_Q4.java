// Sesha is developing a weather monitoring system for a region with multiple weather stations. Each weather station collects temperature data hourly and stores it in a 2D array. 


// Write a program that can add the temperature data from two different weather stations to create a combined temperature record for the region. 
// Input format :

// The first line of input consists of two space-separated integers N and M, representing the number of rows and columns of the matrices, respectively.

// The next N lines consist of M space-separated integers, representing the values of the first matrix.

// The following N lines consist of M space-separated integers, representing the values of the second matrix.
// Output format :

// The output prints the addition of the two matrices in N rows and M columns, representing the combined temperature record.


// Refer to the sample output for formatting specifications.
// Code constraints :

// 1 ≤ N, M ≤ 10
// Sample test cases :
// Input 1 :

// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// 1 1 1
// 2 2 2
// 3 3 3

// Output 1 :

// 2 3 4 
// 6 7 8 
// 10 11 12 

// Input 2 :

// 1 3
// 25 5 5
// 5 44 5

// Output 2 :

// 30 49 10 

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_3_Q4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt(),n=scan.nextInt();
        int arr1[][]=new int[m][n];
        int arr2[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }System.out.println("");
        }
    }
}
