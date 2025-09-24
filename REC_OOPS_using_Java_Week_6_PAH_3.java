// John is planning a long road trip and wants to calculate the distance his car can travel based on its speed and fuel capacity. As John knows that different cars have different fuel efficiencies, he wants a program that can help him estimate the travel distance for any given car.


// To do this, you are tasked with creating a program that calculates the travel distance of a car based on its speed and fuel capacity. The calculation is simple and follows the formula:


// Travel Distance = Speed * Fuel Capacity


// You need to model this system using a Vehicle class and a Car class. The Vehicle class will have attributes for the speed and fuel capacity, while the Car class will inherit from the Vehicle class and include a method to calculate the travel distance.
// Input format :

// The first line of input consists of a double value representing the speed of the car in km/h.

// The second line of input consists of a double value representing the fuel capacity of the car in liters.
// Output format :

// The first line should print "Speed: X km/h", where X is the speed of the car, rounded to two decimal places.

// The second line should print "Fuel Capacity: Y liters", where Y is the fuel capacity of the car, rounded to two decimal places.

// The third line should print "Travel Distance: Z km", where Z is the total travel distance the car can cover, rounded to two decimal places.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 10.0 ≤ speed ≤ 1000.0

// 1.0 ≤ fuel capacity ≤ 400.0
// Sample test cases :
// Input 1 :

// 10.0
// 1.0

// Output 1 :

// Speed: 10.00 km/h
// Fuel Capacity: 1.00 liters
// Travel Distance: 10.00 km

// Input 2 :

// 456.90
// 12.54

// Output 2 :

// Speed: 456.90 km/h
// Fuel Capacity: 12.54 liters
// Travel Distance: 5729.53 km

// Input 3 :

// 150.75
// 9.8

// Output 3 :

// Speed: 150.75 km/h
// Fuel Capacity: 9.80 liters
// Travel Distance: 1477.35 km

import java.util.Scanner;

class Vehicle{
    double speed,fuelCapacity;
    Vehicle(double speed,double fuelCapacity){
        this.speed=speed;
        this.fuelCapacity=fuelCapacity;
    }
}


class Car extends Vehicle{
    Car(double speed,double fuelCapacity){
        super(speed,fuelCapacity);
    }
    
    double calculateTravelDistance(){
        return speed*fuelCapacity;
    }
}

public class REC_OOPS_using_Java_Week_6_PAH_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = scanner.nextDouble();
        double fuelCapacity = scanner.nextDouble();

        Car car = new Car(speed, fuelCapacity);

        System.out.println("Speed: " + String.format("%.2f", car.speed) + " km/h");
        System.out.println("Fuel Capacity: " + String.format("%.2f", car.fuelCapacity) + " liters");
        System.out.println("Travel Distance: " + String.format("%.2f", car.calculateTravelDistance()) + " km");

        scanner.close();
    }
}
