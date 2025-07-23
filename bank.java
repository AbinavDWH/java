import java.util.*;


class BankAccount{
    int accountNumber;
    String accountHolderName;
    double balance;


    BankAccount(){
        accountNumber = 123456;
        accountHolderName = "John Doe";
        balance = 0.0;
        System.out.println("Bank Account Created for " + accountHolderName);
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance-=amount;
        System.out.println(amount);
    }

    void displayAccountInfo() {
        System.out.println(accountHolderName+accountNumber+balance);
    }
}




public class bank {



    public static void main(String[] args) {
        System.out.println("Welcome to the Bank!");
        // Additional bank-related functionality can be added here

        BankAccount account= new BankAccount();
        Scanner scan=new Scanner(System.in);
        
    }    
}
