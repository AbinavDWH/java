// You are working as a developer for CityBank, which wants to build a basic account management system.


// Each customer at the bank has:


//     An Account Number (integer)
//     A Customer Name (string)
//     An Initial Balance (double)


// The bank allows two types of transactions:


//     Deposit – increases the balance.
//     Withdrawal – decreases the balance only if enough funds are available.


// If the withdrawal amount is greater than the balance, the withdrawal should not happen, and the balance should remain the same.


// You are required to implement this system using:


//     A class with attributes for account details.
//     A constructor to initialize account details.
//     Setter methods to update details if needed.
//     Getter methods to retrieve details.
//     Objects of the class to represent customers.


// Finally, display each customer’s account details after all transactions.
// Input format :

// The first line of input contains an integer N, representing the number of customers.

// For each customer:

//     The next line contains the account number (integer).
//     The following line contains the customer name (string).
//     The next line contains the initial balance (double).
//     The next line contains the deposit amount (double).
//     The next line contains the withdrawal amount (double).

// Output format :

// For each customer, print the details in the following format:

//     Account Number: <account_number>
//     Customer Name: <customer_name>
//     Final Balance: <final_balance> (rounded to one decimal place)


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 100

// 1000 ≤ Account Number ≤ 9999

// Customer Name should not be empty

// Initial Balance ≥ 0

// Deposit Amount ≥ 0

// Withdrawal Amount ≤ Current Balance (otherwise, withdrawal is ignored)
// Sample test cases :
// Input 1 :

// 1
// 1234
// Rahul Sharma
// 5000
// 2000
// 3000

// Output 1 :

// Account Number: 1234
// Customer Name: Rahul Sharma
// Final Balance: 4000.0

// Input 2 :

// 1
// 8765
// Suresh Patel
// 1500
// 1000
// 3000

// Output 2 :

// Account Number: 8765
// Customer Name: Suresh Patel
// Final Balance: 2500.0

import java.util.Scanner;

class bank{
    int acc;
    double init=0;
    String name;
    bank(int acc){
        this.acc=acc;
    }
}

public class REC_OOPS_using_Java_Week_5_Q2 {
     public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            
            var obj=new bank(scan.nextInt());
            scan.nextLine();
            obj.name=scan.nextLine();
            obj.init=scan.nextDouble();
            obj.init+=scan.nextDouble();
            double wd=scan.nextDouble();
            if(wd<=obj.init)
            obj.init-=wd;
            
            System.out.println("Account number: "+obj.acc);
            System.out.println("Customer name: "+obj.name);
            System.out.printf("Final balance: %.1f\n",obj.init);
        }
    }
}
