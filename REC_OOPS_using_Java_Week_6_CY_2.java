
// Teena is launching a new airline, Boeing747, and needs to calculate the total revenue generated from ticket sales based on the ticket cost and seat availability. Teena's airline offers two types of seats: regular and premium. The ticket cost and seat availability for both types of seats need to be considered for revenue calculation.


// To help with this, Teena wants to implement a system using multilevel inheritance with three classes:

//     Airline: This class will have the ticket cost as an attribute and  defines the method setCost(double cost) and double getCost().
//     Indigo: This class will extend Airline and add the seat availability attribute and  defines the method getSeatAvailability() and setSeatAvailability(int seatAvailability) .
//     Boeing747: This class will extend Indigo and include a method  calculateTotalRevenue() based on the ticket cost and seat availability .


// Teena needs to calculate the total revenue using the formula:

//     Total Revenue = ticket cost * seat availability


// Help Teena implement this system for calculating the revenue of her airline.
// Input format :

// The first line of input consists of a double value, representing the flight's ticket cost.

// The second line consists of an integer, representing seat availability.
// Output format :

// The first line of output prints "Ticket Cost: Rs. " followed by a double value representing the ticket cost rounded to one decimal place.

// The second line of output prints "Seat Availability: X seats" where X is an integer value representing the seat availability.

// The third line of output prints "Total Revenue: Rs. " followed by a double value representing the total revenue rounded to one decimal place.


// Refer to the sample output for the exact text and format.
// Code constraints :

// The given test cases fall under the following constraints:

// 1000.0 ≤ ticket price ≤ 50,000.0

// 10 ≤ seat availability ≤ 300
// Sample test cases :
// Input 1 :

// 1000.0
// 100

// Output 1 :

// Ticket Cost: Rs. 1000.0
// Seat Availability: 100 seats
// Total Revenue: Rs. 100000.0

// Input 2 :

// 22000.0
// 300

// Output 2 :

// Ticket Cost: Rs. 22000.0
// Seat Availability: 300 seats
// Total Revenue: Rs. 6600000.0

// Input 3 :

// 50000.0
// 30

// Output 3 :

// Ticket Cost: Rs. 50000.0
// Seat Availability: 30 seats
// Total Revenue: Rs. 1500000.0

import java.util.Scanner;

class Airline{
    double cost;
    
    
    void setCost(double cost){
        this.cost=cost;
    }
    double getCost(){
        return cost;
    }
}


class Indigo extends Airline{
    int seatAvailability;
    
    
    void setSeatAvailability(int seatAvailability){
         this.seatAvailability=seatAvailability;
    }
    
    int getSeatAvailability(){
        return seatAvailability;
    }
}


class Boeing747 extends Indigo{
    double calculateTotalRevenue(){
        return cost*seatAvailability;
    }
}

public class REC_OOPS_using_Java_Week_6_CY_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boeing747 plane = new Boeing747();
        
        double ticketCost = scanner.nextDouble();
        plane.setCost(ticketCost);
        int seatAvailability = scanner.nextInt();
        plane.setSeatAvailability(seatAvailability);
        
        System.out.printf("Ticket Cost: Rs. %.1f\n", plane.getCost());
        System.out.println("Seat Availability: " + plane.getSeatAvailability() + " seats");
        System.out.printf("Total Revenue: Rs. %.1f\n", plane.calculateTotalRevenue());
    }
}
