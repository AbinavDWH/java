
// Alice is designing a program that requires users to enter positive numbers. She wants to implement a solution that validates whether the entered number is positive. In case the input is not a positive number, she wants to throw a custom exception.


//     The number should be a positive integer.
//     If this condition is violated, the program should throw a custom exception:
//     InvalidPositiveNumberException with the message "Invalid input. Please enter a positive integer."


// Implement a custom exception, InvalidPositiveNumberException , to handle cases where the entered number does not meet the specified criteria.
// Input format :

// The input consists of an integer value 'n', representing the entered number.
// Output format :

// The output is displayed in the following format:

// If the validation passes, print

// "Number {number} is positive."

// The {number} represents the entered positive integer.

// If the entered number is negative then it displays

// "Error: Invalid input. Please enter a positive integer."


// Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// -500 ≤ n ≤ 100
// Sample test cases :
// Input 1 :

// 100

// Output 1 :

// Number 100 is positive.

// Input 2 :

// -500

// Output 2 :

// Error: Invalid input. Please enter a positive integer.

import java.util.Scanner;

class InvalidPositiveNumberException extends Exception{
    InvalidPositiveNumberException(){
        super("Error: Invalid input. Please enter a positive integer.");
    }
}

public class REC_OOPS_using_Java_Week_8_CY_1 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        try{
            int n=scan.nextInt();
            if(n<0){
                throw new InvalidPositiveNumberException();
            }
            System.out.print("Number "+n+" is positive.");
        }
        
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
}
