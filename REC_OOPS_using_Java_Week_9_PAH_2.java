// Rekha is a teacher who wants to calculate the average of marks scored by her students in a test. She needs to store all the marks dynamically because the number of students may vary each time. Using an ArrayList allows her to easily add any number of marks without worrying about the initial size. 


// Help her implement the task.
// Input format :

// The first line of input is an integer n, representing the number of students..

// The second line of input consists of n double values, representing the marks of each student, separated by a space.
// Output format :

// The output prints: "Average of the list: " followed by the average value formatted to two decimal places.


// Refer to the sample output for the formatting specifications.
// Code constraints :

// In this scenario, the test cases will fall under the following constraints:

// 1 ≤ n ≤ 100

// 0.0 ≤ marks ≤ 100.0
// Sample test cases :
// Input 1 :

// 5 
// 1.0 2.0 3.0 4.0 5.0

// Output 1 :

// Average of the list: 3.00

// Input 2 :

// 3 
// 4.5 6.7 8.9

// Output 2 :

// Average of the list: 6.70

import java.util.ArrayList;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_9_PAH_2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        ArrayList<Double> arr=new ArrayList<>();
        
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            arr.add(scan.nextDouble());
        }
        
        double avg=arr.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.printf("Average of the list: %.2f",avg);
    }
}
