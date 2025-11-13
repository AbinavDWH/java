// Emily, an analyst at a data processing firm, is tasked with cleaning up datasets to remove duplicate values from lists of integers. 


// Create a Java program that allows Emily to input a series of integers, with the program then utilizing a lambda expression to efficiently remove any duplicates. 
// Input format :

// The first line of input consists of an integer N, representing the size of the array.

// The second line consists of N space-separated integers, each denoting an array element.
// Output format :

// The output prints the array elements after removing the duplicates inside the square bracket separated by a comma and space.


// Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// 1 ≤ N ≤ 10

// 1 ≤ array elements ≤ 100
// Sample test cases :
// Input 1 :

// 15
// 1 2 3 4 3 2 1 2 3 4 4 4 5 5 6

// Output 1 :

// [1, 2, 3, 4, 5, 6]

// Input 2 :

// 20
// 11 11 12 23 34 34 45 56 56 67 67 78 78 89 89 90 90 90 22 33

// Output 2 :

// [11, 12, 23, 34, 45, 56, 67, 78, 89, 90, 22, 33]

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

@FunctionalInterface
interface summa{
    int a(int n);
}


public class REC_OOPS_using_Java_Week_12_PAH_1 {
     public static void main(String arg[]){
        
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        
        Set<Integer> set=new LinkedHashSet<>();
        
        summa e=(a)->a;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        
        for(int i=0;i<n;i++){
            set.add(e.a(arr[i]));
        }
        System.out.print(set);
        
    }
}
