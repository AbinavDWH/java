
// Rathish is planning a road trip and needs a program to convert speeds between miles per hour (MPH) and kilometers per hour (KPH).


// Create an interface, SpeedConverter, with a method convertSpeed(double mph). Implement the interface with MPHtoKPHConverter class, allowing Rathish to input MPH and receive the converted speed in KPH, rounded to two decimal points.


// Formula: Speed in KPH = 1.60934 * Speed in MPH.
// Input format :

// The input consists of a single double-point number representing the speed in miles per hour (MPH).
// Output format :

// The output displays the converted speed (double-point number) in kilometers per hour (KPH) rounded off to two decimal points in the following format:

// "Speed in KPH: <<converted speed>>".


// Refer to the sample output for the formatting specifications.
// Code constraints :

// In this scenario, the test cases will fall under the following constraints

// 1.0 ≤ Speed in MPH ≤ 100.0
// Sample test cases :
// Input 1 :

// 1.0

// Output 1 :

// Speed in KPH: 1.61

// Input 2 :

// 50.0

// Output 2 :

// Speed in KPH: 80.47

// Input 3 :

// 99.8

// Output 3 :

// Speed in KPH: 160.61

// You are using Java

import java.util.Scanner;

interface SpeedConverter{
    
    double convertSpeed(double speedInMPH);
    
}

class MPHtoKPHConverter implements SpeedConverter{
 
    public double convertSpeed(double speedInMPH){
        return 1.60934*speedInMPH;
    }
 
    
}

 public class REC_OOPS_using_Java_Week_7_CY_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speedInMPH = scanner.nextDouble();

        SpeedConverter converter = new MPHtoKPHConverter();

        double speedInKPH = converter.convertSpeed(speedInMPH);
        
        System.out.printf("Speed in KPH: %.2f\n", speedInKPH);

        scanner.close();
    }
}
