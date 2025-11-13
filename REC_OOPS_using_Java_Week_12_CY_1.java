
// A company named TechNova is collecting feedback from its customers. Each customer gives a feedback score (an integer between 1 and 10) along with their name.


// The company wants to:

//     Display each customer’s name along with their feedback in a formatted way using a lambda expression and a Consumer functional interface.
//     After displaying all feedbacks, calculate and display the average feedback score.

// You need to implement this functionality using Java lambda expressions and streams, emphasizing the Consumer interface for displaying formatted output.
// Input format :

// The first line of input contains an integer n, representing the number of customers.

// The next n lines each contain a String (customer name) followed by an int (feedback score).
// Output format :

//     Each line prints a customer’s name and feedback in the format:
//     Customer: <name>, Feedback Score: <score>


//     After all customers are displayed, print the average feedback as:
//     Average Feedback: <average_value>


// (Average should be displayed up to two decimal places.)
// Code constraints :

// 1 ≤ n ≤ 100

// 1 ≤ feedback score ≤ 10

// Names contain only alphabets and up to 20 characters.
// Sample test cases :
// Input 1 :

// 3
// Ravi 7
// Ananya 9
// Kiran 8

// Output 1 :

// Customer: Ravi, Feedback Score: 7
// Customer: Ananya, Feedback Score: 9
// Customer: Kiran, Feedback Score: 8
// Average Feedback: 8.00

// Input 2 :

// 2
// Asha 10
// Varun 9

// Output 2 :

// Customer: Asha, Feedback Score: 10
// Customer: Varun, Feedback Score: 9
// Average Feedback: 9.50

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class REC_OOPS_using_Java_Week_12_CY_1 {
     public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        
        List<String> str=new ArrayList<>();
        List<Double> arr=new ArrayList<>();
        
        Consumer<Integer> con=s->{
            System.out.printf("Customer: %s,Feedback Score: %.0f\n",str.get(s),arr.get(s));  
        };
        
        for(int i=0;i<n;i++){
            String s_arr[]=scan.nextLine().split(" ");
            str.add(s_arr[0]);
            arr.add(Double.parseDouble(s_arr[1]));
        }
        
        double t=0;
        for(int i=0;i<n;i++){
            con.accept(i);
            t+=arr.get(i);
        }
        t/=n;
        System.out.printf("Average Feedback: %.2f",t);
    }    
}
