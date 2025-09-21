// Meera is working as a developer for CityGas Supply Board, which wants to build a household gas billing system.


// Each household’s gas account has:


//     A Customer ID (integer)
//     A Customer Name (string)
//     Units Consumed in cubic meters (double)


// The gas bill is calculated based on these rules:


//     For the first 50 units → ₹4 per unit
//     For the next 100 units (51–150) → ₹6 per unit
//     For units above 150 → ₹8 per unit
//     If the total bill exceeds ₹2000, a 15% discount is applied on the final bill.


// Meera has been asked to implement this system using:


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

// Final Bill: <final_bill> (The final bill must be rounded to one decimal place.)


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
// 30

// Output 1 :

// Customer ID: 1001
// Customer Name: Ravi Kumar
// Final Bill: 120.0

// Input 2 :

// 4
// 2007
// Sunita Yadav
// 50
// 2008
// Manoj Kumar
// 175
// 2009
// Priya Nair
// 90
// 2010
// Ashok Jain
// 600

// Output 2 :

// Customer ID: 2007
// Customer Name: Sunita Yadav
// Final Bill: 200.0
// Customer ID: 2008
// Customer Name: Manoj Kumar
// Final Bill: 1000.0
// Customer ID: 2009
// Customer Name: Priya Nair
// Final Bill: 440.0
// Customer ID: 2010
// Customer Name: Ashok Jain
// Final Bill: 3740.0

import java.util.Scanner;

class Eb{
    int id;
    String name;
    double unit;
    
    
    Eb(int id,String name,double unit){
        this.id=id;
        this.name=name;
        this.unit=unit;
    }
    double total=0;
    void bill(){
        if(unit <51){
            total=unit*4;
        }else if(unit >50&& unit<=150){
            total=50*4+(unit-50)*6;
        }
        else{
            total=50*4+100*6+(unit-150)*8;
        }
        
        if(total>2000){
            total*=.85;
        }
        
        
        System.out.println("Customer ID: "+id);
        System.out.println("Customer Name: "+name);
        System.out.printf("Final Bill: %.1f",total);
    }
}

public class REC_OOPS_using_Java_Week_5_CY_4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int g=0;g<n;g++){
            int id=scan.nextInt();
            scan.nextLine();
            String name=scan.nextLine();
            double unit=scan.nextDouble();
            
            var obj=new Eb(id,name,unit);
            obj.bill();
        }
    }
}
