// Each customer at the bank has an Account Number, Customer Name, and an Initial Balance. The bank allows two types of transactions:


//     Deposit – Increases the balance.
//     Withdrawal – Decreases the balance, but only if enough funds are available. If the withdrawal amount exceeds the available balance, the transaction should be skipped, and the balance should remain unchanged.


// You are required to implement this banking system by:


// Creating a class with the necessary attributes to store account details.

//     Using a constructor to initialize the account details when a new account is created.
//     Providing setter methods to update the details if required.
//     Providing getter methods to retrieve account details.
//     Creating objects of this class to represent different customers, where each customer can perform deposits and withdrawals.


// Instructions:

//     Implement the class to store account details.
//     Implement the logic for performing deposit and withdrawal transactions.
//     Ensure that withdrawals don't exceed the available balance.
//     After performing the transactions, print the account number, customer name, and final balance.

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


class Account {
    private int accountNumber;
    private String customerName;
    private double balance;

    public Account(int accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount >= 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }
}


public class REC_OOPS_using_Java_Week_5_PAH_4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int accNo = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            double initBal = Double.parseDouble(sc.nextLine());
            double deposit = Double.parseDouble(sc.nextLine());
            double withdraw = Double.parseDouble(sc.nextLine());

            Account acc = new Account(accNo, name, initBal);
            acc.deposit(deposit);
            acc.withdraw(withdraw);

            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Customer Name: " + acc.getCustomerName());
            System.out.println("Final Balance: " + acc.getBalance());
        }
        sc.close();
    }    
}
