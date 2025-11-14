// In a ticket reservation system, you store the available seat numbers in a TreeSet. Users input their desired seat number, and the program checks whether the chosen seat is available. 


// Using a TreeSet ensures quick and efficient verification of seat availability, ensuring a smooth and organized ticket booking process.
// Input format :

// The first line of input contains a single integer n, representing the number of available seats.

// The second line contains n space-separated integers, representing the available seat numbers.

// The third line contains an integer m, representing the seat number that needs to be searched.
// Output format :

// The output displays "[m] is present!" if the given seat is available. Otherwise, it displays "[m] is not present!"


// Refer to the sample output for the formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ n ≤ 10

// 1 ≤ seat number ≤ 10
// Sample test cases :
// Input 1 :

// 4
// 2 4 5 6
// 5

// Output 1 :

// 5 is present!

// Input 2 :

// 10
// 2 4 6 8 5 9 7 1 2 10
// 3

// Output 2 :

// 3 is not present!

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class REC_OOPS_using_Java_Week_10_Q4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        
        Set <Integer> set=new HashSet<>();
        
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            set.add(scan.nextInt());
        }
        int k=scan.nextInt();
        if(set.contains(k)){
            System.out.print(k+" is present!");
        }else
        System.out.print(k+" is not present!");
    }    
}
