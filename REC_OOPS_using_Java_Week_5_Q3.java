// // Neha is working as a developer for CityElectricity Board, which wants to build a household electricity billing system.


// Each customer’s electricity account has:


//     A Customer ID (integer)
//     A Customer Name (string)
//     Units Consumed (double)


// The electricity bill is calculated based on these rules:


//     For the first 100 units → 5 units charge per unit
//     For the next 100 units (101–200) → 7 units charge per unit
//     For units above 200 → 10 units charge per unit
//     If the total bill exceeds 2000 units, a 5% discount is applied on the final bill.


// Neha has been asked to implement this system using:


//     A class with attributes for customer details.
//     A constructor to initialize customer details.
//     Setter methods to update details if needed.
//     Getter methods to retrieve details.
//     Objects of the class to represent customers.


// Finally, display each customer’s details and final bill amount.
// Input format :

// The first line of input contains an integer N, representing the number of customers.

// For each customer:

//     The next line contains the Customer ID (integer).
//     The following line contains the Customer Name (string).
//     The next line contains the Units Consumed (double).

// Output format :

// For each customer, print the details in the following format:

// Customer ID: <customer_id>

// Customer Name: <customer_name>

// Final Bill: <final_bill> (rounded to one decimal place)


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 100

// 1000 ≤ Customer ID ≤ 9999

// Customer Name should not be empty

// Units Consumed ≥ 0
// Sample test cases :
// Input 1 :

// 1
// 1001
// Ravi Kumar
// 80

// Output 1 :

// Customer ID: 1001
// Customer Name: Ravi Kumar
// Final Bill: 400.0

// Input 2 :

// 1
// 1002
// Sita Sharma
// 103

// Output 2 :

// Customer ID: 1002
// Customer Name: Sita Sharma
// Final Bill: 521.0

import java.util.Scanner;

class customer_detail{
    int id;
    String name;
    
    customer_detail(int id,String name){
        this.id=id;
        this.name=name;
    }
   double unit=0;
    void Unit(double unit){
        this.unit=unit;
    }
        
        
     void bill(){       
       double price=0;
        if(unit<=100){
            price+=unit*5;
        }
        else if(unit>100 && unit<=200){
            price+=100*5+(unit-100)*7;
        }
        else if(unit>200){
            price+=(100*5+(100)*7+(unit-200)*10);
        }
        
        if(price>=2000){
            price*=0.95;
        }
        System.out.println("Customer ID: "+id);
        System.out.println("Customer Name: "+name);
        System.out.printf("Final Bill: %.1f",price);
    }
    
}



public class REC_OOPS_using_Java_Week_5_Q3 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int id=scan.nextInt();
            scan.nextLine();
            String name =scan.nextLine(); 
            var obj=new customer_detail(id,name);
            obj.Unit(scan.nextDouble());
            obj.bill();
            
        }
    }
}

