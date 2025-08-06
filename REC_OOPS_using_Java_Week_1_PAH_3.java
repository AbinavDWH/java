
// In the Kingdom of Delivery Logistics, there is a giant truck used for transporting packages across the kingdom. The truck has a maximum capacity represented by an integer, and each package also has a specific weight. The truck’s efficiency and safety depend on whether the weight of the package is below a certain threshold.


// The kingdom's delivery service has a rule: if the weight of a package is less than one-third of the truck’s total capacity, the package is eligible for quick processing and dispatch. However, if the weight is too heavy, the package will require special handling.


// As a logistics manager, you need to check whether the weight of the package is less than one-third of the truck's total capacity.


// Write a program using a ternary operator that helps determine whether the package weight meets the requirement for quick processing or if it needs special handling.
// Input format :

// The first line of input consists of an integer p, representing the weight of the package.

// The second line consists of an integer w, representing the total weight capacity of the truck.
// Output format :

// The first line of output prints "One-third of Truck: X," where X is one-third of the truck's total weight capacity as a double value with two decimal places.

// The second line of output displays one of the following:

//     If p is less than one-third of the truck's total weight capacity, print "Package weight is less than one-third of the truck's capacity".
//     Otherwise, print "Package weight is not less than one-third of the truck's capacity".


// Refer to the sample output for the formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// 1 ≤ p, w ≤ 100
// Sample test cases :
// Input 1 :

// 13
// 60

// Output 1 :

// One-third of Truck: 20.00
// Package weight is less than one-third of truck's capacity

// Input 2 :

// 19
// 36

// Output 2 :

// One-third of Truck: 12.00
// Package weight is not less than one-third of truck's capacity

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_PAH_3 {
     public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int p=scan.nextInt(),t=scan.nextInt();
        System.out.printf("One-third of Truck: %.2f",(float)t/3);
        String n;
        if (t/3>p){
            n="";
        }
        else
        n="Not ";
        System.out.print("\nPackage weight is "+n+"less than one-third of truck's capacity");
    }    
}
