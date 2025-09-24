// // Sharon, a software developer, is working on a project to automate velocity calculations for various objects. She wants to create a class named VelocityCalculator with overloaded methods calculateVelocity to calculate the velocity. One method will accept distance in meters and time in seconds as integers, while another will accept distance and time as doubles.


// Help her in completing the project.


// Formula: Velocity = distance / time
// Input format :

// The first line of input consists of an integer, representing the distance in meters (for the integer method).

// The second line consists of an integer, representing the time in seconds (for the integer method).

// The third line consists of a double value, representing the distance in meters (for the double method).

// The fourth line consists of a double value, representing the time in seconds (for the double method).
// Output format :

// The first line prints the velocity calculated using the integer inputs in the format:

// Velocity with integer inputs: <velocity> m/s

// The second line prints the velocity calculated using the double inputs in the format:

// Velocity with double inputs: <velocity> m/s


// Note:

// The velocity for the double inputs should be printed with two decimal places.


// Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// 1 ≤ Integer distance ≤ 100000

// 1 ≤ Integer time ≤ 100000

// 1.0 ≤ double distance ≤ 100000.0

// 1.0 ≤ double time ≤ 100000.0
// Sample test cases :
// Input 1 :

// 100
// 10
// 100.5
// 10.2

// Output 1 :

// Velocity with integer inputs: 10 m/s
// Velocity with double inputs: 9.85 m/s

// Input 2 :

// 500
// 30
// 300.5
// 25.2

// Output 2 :

// Velocity with integer inputs: 16 m/s
// Velocity with double inputs: 11.92 m/s

// Input 3 :

// 10000
// 3600
// 876.5
// 3600.7

// Output 3 :

// Velocity with integer inputs: 2 m/s
// Velocity with double inputs: 0.24 m/s

import java.util.Scanner;

class VelocityCalculator{
    static int calculateVelocity(int distance,int time){
        return distance/time;
    }
    
    static double calculateVelocity(double distance,double time){
        return distance/time;
    }
}

public class REC_OOPS_using_Java_Week_6_PAH_1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanceInt = scanner.nextInt();
        int timeInt = scanner.nextInt();

        double distanceDouble = scanner.nextDouble();
        double timeDouble = scanner.nextDouble();

        int velocityInt = VelocityCalculator.calculateVelocity(distanceInt, timeInt);
        double velocityDouble = VelocityCalculator.calculateVelocity(distanceDouble, timeDouble);

        System.out.println("Velocity with integer inputs: " + velocityInt + " m/s");
        System.out.printf("Velocity with double inputs: %.2f m/s", velocityDouble);

        scanner.close();
    }
}
