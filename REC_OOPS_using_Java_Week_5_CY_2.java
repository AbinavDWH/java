// You are working as a developer for CityMobile, which wants to build a basic mobile data usage management system.


// Each customer has:


//     A Customer ID (integer)
//     A Customer Name (string)
//     An Initial Data Balance (in GB, double)


// The company allows two types of operations:


//     Recharge – increases the data balance.
//     Usage – decreases the data balance only if enough data is available.


// If the usage amount is greater than the available data balance, the usage should not happen, and the balance should remain the same.


// You are required to implement this system using:


//     A class with attributes for customer details.
//     A constructor to initialize customer details.
//     Setter methods to update details if needed.
//     Getter methods to retrieve details.
//     Objects of the class to represent customers.


// Finally, display each customer’s details after all operations.
// Input format :

// The first line of input contains an integer N, representing the number of customers.

// For each customer:

//     The next line contains the Customer ID (integer).
//     The following line contains the Customer Name (string).
//     The next line contains the Initial Data Balance (double).
//     The next line contains the Recharge Amount in GB (double).
//     The next line contains the Usage Amount in GB (double).

// Output format :

// For each customer, print the details in the following format:

// Customer ID: <customer_id>

// Customer Name: <customer_name>

// Final Data Balance: <final_data_balance> GB (The final balance must be rounded to one decimal place.)


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 100

// 1000 ≤ Customer ID ≤ 9999

// Customer Name should not be empty

// Initial Balance ≥ 0

// Recharge Amount ≥ 0

// Usage Amount ≤ Current Balance (otherwise, usage is ignored)
// Sample test cases :
// Input 1 :

// 1
// 1234
// Ravi Kumar
// 5.0
// 2.0
// 3.0

// Output 1 :

// Customer ID: 1234
// Customer Name: Ravi Kumar
// Final Data Balance: 4.0 GB

// Input 2 :

// 2
// 1001
// Rahul Verma
// 3.5
// 1.5
// 2.0
// 1002
// Pooja Singh
// 8.0
// 2.0
// 9.0

// Output 2 :

// Customer ID: 1001
// Customer Name: Rahul Verma
// Final Data Balance: 3.0 GB
// Customer ID: 1002
// Customer Name: Pooja Singh
// Final Data Balance: 1.0 GB

import java.util.Scanner;

class Cus{
    int c_id;
    String name;
    double data;
    Cus(int c_id,String name,double data){
        this.c_id=c_id;
        this.name=name;
        this.data=data;
    }
    
    void recharge(Double data){
        this.data+=data;
    }
    
    void use(Double data){
        if(this.data>=data){
            this.data-=data;
        }
    }
    
    void d_bal(){
        System.out.println("Customer ID: "+c_id);
        System.out.println("Customer Name: "+name);
        // data=Math.round(data*10)/10;
        System.out.printf("Final Data Balance: %.1f GB\n",data);
    }
    
}


public class REC_OOPS_using_Java_Week_5_CY_2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int id=scan.nextInt();
            scan.nextLine();
            String name=scan.nextLine();
            double n1=scan.nextDouble(),n2=scan.nextDouble(),n3=scan.nextDouble();
            var obj=new Cus(id,name,n1);
            obj.recharge(n2);
            obj.use(n3);
            obj.d_bal();
        }
    }    
}
