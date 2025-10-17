// Hemanth is designing a banking system for XYZ Bank. The system should allow customers to perform deposit, withdrawal, and balance inquiry operations. Implement exception handling for scenarios involving invalid transaction amounts or insufficient funds.


//     Create two custom exception classes, InvalidAmountException and InsufficientFundsException, both extending the Exception class.
//     Throw an InvalidAmountException with a message if the deposit amount is less than or equal to zero.
//     Throw an InsufficientFundsException if the withdrawal amount is greater than the available balance.
//     Deduct the withdrawal amount from the balance if the withdrawal is successful.


// Assist Hemanth in designing the program.
// Input format :

// The first line of input consists of a double value B, representing the initial balance.

// The second line consists of a double value D, representing the deposit amount.

// The third line consists of a double value W, representing the withdrawal amount.
// Output format :

// If the withdrawal is successful, print the amount withdrawn and the current balance, rounded off to one decimal place.

// If an InvalidAmountException occurs, print "Error: [D] is not valid".

// If an InsufficientFundsException occurs, print "Error: Insufficient funds".


// Refer to the sample output for formatting specifications.
// Code constraints :

// 0 ≤ B ≤ 109

// −109 ≤ D ≤ 109

// 0 ≤ W ≤ 109
// Sample test cases :
// Input 1 :

// 1050.1
// 270.2
// 150.3

// Output 1 :

// Amount Withdrawn: 150.3
// Current Balance: 1170.0

// Input 2 :

// 1500.4
// 0.0
// 100.3

// Output 2 :

// Error: 0.0 is not valid

// Input 3 :

// 10075.7
// 50000.5
// 750750.9

// Output 3 :

// Error: Insufficient funds

// Input 4 :

// 750.2
// -456.8
// 196.5

// Output 4 :

// Error: -456.8 is not valid

import java.util.Scanner;

class InsufficientFundsException extends Exception{
    InsufficientFundsException(){
        super("Error: Insufficient funds");
    }
}

class InvalidAmountException extends Exception{
    InvalidAmountException(double e){
        super("Error: "+e+" is not valid");
    }
}

public class REC_OOPS_using_Java_Week_8_CY_4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        try{
            double n1=scan.nextDouble();
            double n2=scan.nextDouble();
            double n3=scan.nextDouble();
            double t=(n1+n2-n3);
            if(n2<=0){
                throw new InvalidAmountException(n2);
            }
            else if(n1+n2<n3){
                throw new InsufficientFundsException();
            }else{
                System.out.printf("Amount Withdrawn: %.1f",n3);
                System.out.printf("\nCurrent Balance: %.1f",t);
            }
        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
