// You are working as a developer for CityCab, a taxi service company that wants to build a ride fare management system.


// Each customer booking has:


//     A Booking ID (integer)
//     A Customer Name (string)
//     A Distance Travelled in km (double)


// The fare calculation rules are:


//     Base Fare = 50 units (flat charge for every ride).
//     Per km charge = 10 units/km.
//     If the distance is greater than 20 km, a 10% discount is applied on the total fare.


// You are required to implement this system using:


//     A class with attributes for booking details.
//     A constructor to initialize booking details.
//     Setter methods to update details if needed.
//     Getter methods to retrieve details.
//     Objects of the class to represent customer rides.


// Finally, display each booking’s details and final fare.
// Input format :

// The first line of input contains an integer N, representing the number of bookings.

// For each booking:

//     The next line contains the booking ID (integer).
//     The following line contains the customer's name (string).
//     The next line contains the distance travelled (double).

// Output format :

// For each booking, print the details in the following format:

//     Booking ID: <booking_id>
//     Customer Name: <customer_name>
//     Final Fare: <final_fare> (rounded to one decimal place)


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 100

// 1000 ≤ Booking ID ≤ 9999

// Customer Name should not be empty

// Distance ≥ 0
// Sample test cases :
// Input 1 :

// 1
// 1234
// Rahul Sharma
// 15

// Output 1 :

// Booking ID: 1234
// Customer Name: Rahul Sharma
// Final Fare: 200.0

// Input 2 :

// 1
// 5678
// Anita Verma
// 25

// Output 2 :

// Booking ID: 5678
// Customer Name: Anita Verma
// Final Fare: 270.0

import java.util.Scanner;

class Booking {
    private int bookingId;
    private String customerName;
    private double distance;
    private double fare;

    public Booking(int bookingId, String customerName, double distance) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.distance = distance;
        calculateFare();
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDistance(double distance) {
        this.distance = distance;
        calculateFare();
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getDistance() {
        return distance;
    }

    public double getFare() {
        return fare;
    }

    private void calculateFare() {
        fare = 50 + distance * 10;
        if (distance > 20) {
            fare = fare - (fare * 0.1);
        }
    }
}

public class REC_OOPS_using_Java_Week_5_Q4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int id = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            double distance = Double.parseDouble(sc.nextLine());
            Booking booking = new Booking(id, name, distance);
            System.out.println("Booking ID: " + booking.getBookingId());
            System.out.println("Customer Name: " + booking.getCustomerName());
            System.out.printf("Final Fare: %.1f\n", booking.getFare());
        }
        sc.close();
    }

}
