// Mr.Kapoor wants to create a program to calculate the volume of a Cuboid and a Cube using method overriding. 


// Implements a base class Cuboid with attributes for length, width, and height. Include a method calculateVolume() that computes the volume of the cuboid. 


// Extends the base class with a subclass Cube representing a cube, where all sides are equal. Override the calculateVolume() method in the Cube class to compute the volume of the cube. 


// The program should take user input for the dimensions of the cuboid and the side length of the cube and display the calculated volumes with two decimal places.
// Input format :

// The first line of input consists of 3 space-separated double values, representing the cuboid length, width, and height, respectively.

// The second line consists of a double value, representing the side length of the cube.
// Output format :

// The first line of output prints the volume of the cuboid, rounded off to two decimal places.

// The second line prints the volume of the cube, rounded off to two decimal places.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The test cases will fall under the following constraints:

// 1.00 ≤ length, width, height ≤ 60.00

// 1.00 ≤ side ≤ 50.00
// Sample test cases :
// Input 1 :

// 60.0 60.0 60.0
// 50.0

// Output 1 :

// Volume of Cuboid: 216000.00
// Volume of Cube: 125000.00

// Input 2 :

// 1.0 1.0 1.0
// 1.0

// Output 2 :

// Volume of Cuboid: 1.00
// Volume of Cube: 1.00

// Input 3 :

// 12.1 13.4 17.6
// 23.7

// Output 3 :

// Volume of Cuboid: 2853.66
// Volume of Cube: 13312.05

import java.util.Scanner;

class Cuboid{
    double length,width,height;
    
    
    Cuboid(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    
    double calculateVolume(){
        return length*width*height;
    }
    
    
}

class Cube extends  Cuboid{
  
    Cube(double side){
  
        super(side,side,side);
    }
    
    // super(side,side,side);
}

public class REC_OOPS_using_Java_Week_6_Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cuboidLength = scanner.nextDouble();
        double cuboidWidth = scanner.nextDouble();
        double cuboidHeight = scanner.nextDouble();

        // Regular object instantiation for Cuboid
        Cuboid cuboid = new Cuboid(cuboidLength, cuboidWidth, cuboidHeight);
        System.out.printf("Volume of Cuboid: %.2f\n", cuboid.calculateVolume());

        double cubeSide = scanner.nextDouble();

        // Upcasting - Using superclass reference for subclass object (DMD)
        Cuboid cube = new Cube(cubeSide); // Upcasting
        System.out.printf("Volume of Cube: %.2f", cube.calculateVolume()); // Calls Cube's method dynamically

        scanner.close();
    }
}
