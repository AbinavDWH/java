// Neha is working as a developer for CityMovie Theatre, which wants to build a system to calculate total ticket cost for movie-goers based on the number of tickets and type of seats booked.


// Each customer’s booking has:


//     Booking ID (integer)
//     Customer Name (string)
//     Number of Tickets (integer)
//     Seat Type (string: "Standard", "Premium", "VIP")


// The ticket prices are:


//     Standard – 250 units per ticket
//     Premium – 400 units per ticket
//     VIP – 600 units per ticket


// The calculation rules:


// Total Amount = Number of Tickets × Seat Price

// If a customer books more than 4 tickets, they get a 10% discount on the total amount.

// If the booking is for VIP seats and the total amount exceeds 3000 units, a 5% luxury tax is added after any discount.


// Neha has been asked to implement this system using:


//     A class with attributes for booking details.
//     A constructor to initialize booking details.
//     Getter and Setter methods to retrieve and update booking details if required.
//     A method to calculate the final ticket cost.
//     Objects of the class to represent bookings.


// Finally, display each customer’s details and final ticket amount.
// Input format :

// The first line contains an integer N, representing the number of bookings.

// For each booking:

//     The next line contains the Booking ID (integer).
//     The next line contains the Customer Name (string).
//     The next line contains Number of Tickets (integer).
//     The next line contains Seat Type ("Standard", "Premium", or "VIP").

// Output format :

// For each booking, print:

//     Booking ID: <booking_id>
//     Customer Name: <customer_name>
//     Final Ticket Amount: <final_amount> (rounded to one decimal place)


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 100

// 1000 ≤ Booking ID ≤ 9999

// Customer Name should not be empty

// Number of Tickets ≥ 1

// Seat Type must be one of the given types
// Sample test cases :
// Input 1 :

// 1
// 1001
// Ravi Kumar
// 3
// Standard

// Output 1 :

// Booking ID: 1001
// Customer Name: Ravi Kumar
// Final Ticket Amount: 750.0

// Input 2 :

// 3
// 1003
// Deepak Mehta
// 6
// VIP
// 1004
// Neha Gupta
// 2
// VIP
// 1005
// Varun Singh
// 4
// Standard

// Output 2 :

// Booking ID: 1003
// Customer Name: Deepak Mehta
// Final Ticket Amount: 3402.0
// Booking ID: 1004
// Customer Name: Neha Gupta
// Final Ticket Amount: 1200.0
// Booking ID: 1005
// Customer Name: Varun Singh
// Final Ticket Amount: 1000.0

import java.util.Scanner;


class ticket{
    int t_id ,no_t;
    String name,std;
    ticket(String name,int t_id,int no_t,String std){
        this.name=name;
        this.t_id=t_id;
        this.no_t=no_t;
        this.std=std;
    }
    void amount(){
       int p_range[]={250,400,600};
       int n=0;
       for(int i=0;i<3;i++){
           if(REC_OOPS_using_Java_Week_5_PAH_3.str[i].equals(std)){
               n=i;
               break;
           }
       }
       double price=p_range[n]*no_t;
       if(no_t>4){
           price*=.9;
       }
       if(n==2&&price>3000){
           price*=1.05;
       }
       System.out.println("Booking ID: "+t_id);
       System.out.println("Customer Name: "+name);
       System.out.printf("Final Ticket Amount: %.1f\n",price);
    }
}



public class REC_OOPS_using_Java_Week_5_PAH_3 {
    static String str[]={"Standard","Premium","VIP"}; 
    
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int id=scan.nextInt();
            scan.nextLine();
            String name=scan.nextLine();
            int t_no=scan.nextInt();
            scan.nextLine();
            String std=scan.nextLine();
            var obj=new ticket(name,id,t_no,std);
            obj.amount();
        }
    }
    
}
