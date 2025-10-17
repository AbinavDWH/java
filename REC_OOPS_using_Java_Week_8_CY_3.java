// Faustus is managing his bank account and wants to create a program to update his account balance based on certain conditions. However, he needs to handle specific scenarios related to invalid inputs and insufficient balances. Faustus wants to update his account balance. He inputs the current balance and the amount to be updated.


//     The initial account balance should be positive. If Faustus enters a negative initial balance, the program should throw an InvalidAmountException with the message "Invalid amount. Please enter a positive initial balance."
//     If the amount to be updated is negative, the program should check if the subtraction results in a negative balance. If so, it should throw an InsufficientBalanceException with the message "Insufficient balance."
//     If the amount to be updated is positive, it should be added to the current balance, and the new balance should be printed.


// Implement a custom exception, InvalidAmountException, and InsufficientBalanceException, to manage his bank account.
// Input format :

// The first line of input consists of a double value 'd', representing the initial account balance.

// The second line of input consists of a double value 'd1', representing the amount to be updated.
// Output format :

// The output is displayed in the following format:

// If the validation passes, print

// "Account balance updated successfully! New balance: {new_balance}"

// where {new_balance} is the updated account balance.

// If the initial bank amount is negative it displays

// "Error: Invalid amount. Please enter a positive initial balance."

// If the updated amount exceeds the initial account balance in withdrawal it displays

// "Error: Insufficient balance."


// Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// -5000 ≤ d ≤100000

// -100000 ≤ d1 ≤ 100000
// Sample test cases :
// Input 1 :

// 1000
// 500

// Output 1 :

// Account balance updated successfully! New balance: 1500.0

// Input 2 :

// 2000
// -700

// Output 2 :

// Account balance updated successfully! New balance: 1300.0

// Input 3 :

// -5000
// 200

// Output 3 :

// Error: Invalid amount. Please enter a positive initial balance.

// Input 4 :

// 5000
// -7000

// Output 4 :

// Error: Insufficient balance.

import java.util.Scanner;

class InvalidAmountException extends Exception{
    InvalidAmountException(){
        super("Error: Invalid amount. Please enter a positive initial balance.");
    }
}


class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){
        super("Error: Insufficient balance.");
    }
}


public class REC_OOPS_using_Java_Week_8_CY_3 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        try{
            double n=scan.nextInt();
            double n2=scan.nextInt();
            if(n<0){
                throw new InvalidAmountException();
            }else if(n+n2<0)
            throw new InsufficientBalanceException();
            System.out.printf("Account balance updated successfully! New Balance: %.1f",n+n2);
        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
