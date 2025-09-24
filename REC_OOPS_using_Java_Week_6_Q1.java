
// Elsa subscribes to a premium service with a base monthly cost, a service tax and an extra feature cost. Assist her in writing an inheritance program that takes input for these values and calculates the total monthly cost. 


// Refer to the below class diagram:

// Input format :

// The first line of input consists of a double value, representing the base monthly cost.

// The second line consists of a double value, representing the service tax.

// The third line consists of a double value, representing the extra feature cost.
// Output format :

// The output prints "Rs. X" where X is a double value, rounded off to two decimal places.


// Refer to the sample output for formatting specifications.
// Code constraints :

// 0.1 ≤ base monthly cost, service tax, extra feature cost ≤ 100.00
// Sample test cases :
// Input 1 :

// 10.0
// 2.5
// 5.0

// Output 1 :

// Rs. 17.50

// Input 2 :

// 12.765
// 34.98
// 10.23

// Output 2 :

// Rs. 57.97

// Input 3 :

// 98.56
// 99.67
// 94.56

// Output 3 :

// Rs. 292.79

import java.util.Scanner;

class Subscription{
    double monthlyCost;
    double serviceTax;
    double extraFeatureCost;
}

class PremiumSubscription extends Subscription{
    
    PremiumSubscription(double monthlyCost,double serviceTax,double extraFeatureCost){
        this.monthlyCost=monthlyCost;
        this.serviceTax=serviceTax;
        this.extraFeatureCost=extraFeatureCost;
    }
    
    double calculateMonthlyCost(){
        return monthlyCost+serviceTax+extraFeatureCost;
    }
    
}


public class REC_OOPS_using_Java_Week_6_Q1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baseMonthlyCost = scanner.nextDouble();
        double serviceTax = scanner.nextDouble();
        double extraFeatureCost = scanner.nextDouble();

        PremiumSubscription premiumSubscription = new PremiumSubscription(baseMonthlyCost, serviceTax, extraFeatureCost);

        double totalMonthlyCost = premiumSubscription.calculateMonthlyCost();

        System.out.printf("Rs. %.2f%n", totalMonthlyCost);

        scanner.close();
    }
}
