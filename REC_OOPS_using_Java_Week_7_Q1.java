// Problem Statement:


// Rajiv is analyzing the energy consumption in his household and wants to calculate the total cost based on the daily energy usage. He is given the rate per unit of electricity and the energy consumed for multiple days. To structure this calculation efficiently, he decides to use an interface-based approach.


// Implement an interface CostCalculator with the necessary methods to retrieve energy details and compute the cost. The calculations should be handled in the EnergyConsumptionTracker class, while the EnergyConsumptionApp class should only handle input and output.


// Formula

// Energy Cost for one day = Energy Consumed per day * Rate Per Unit
// Input format :

// The first line of input consists of the rate per unit as an 'R' (a double value).

// The second line of input consists of the number of days 'N' (an integer).

// The third line of input consists of the daily energy consumption values for each day 'D" (double values), separated by space.
// Output format :

// The first line of the output prints: "Day-wise Energy Cost:"

// The next N lines of the output print the day-wise energy costs(double type) and the total energy cost (double type) in Indian Rupees in the following format: "Day [day_number]: Rs. [energy_cost]"

// The last line of the output prints: "Total Energy Cost: Rs. [total_cost]"


// Note: energy_cost and total_cost are rounded off to two decimal points


// Refer to the sample output for the formatting specifications.
// Code constraints :

// In this scenario, the test cases will fall under the following constraints:

// 0.1 ≤ R ≤ 100.0

// 1 ≤ N ≤ 10

// 0.1 ≤ D ≤ 1000.0
// Sample test cases :
// Input 1 :

// 0.01
// 3
// 10.0 20.0 30.0

// Output 1 :

// Day-wise Energy Cost:
// Day 1: Rs. 0.10
// Day 2: Rs. 0.20
// Day 3: Rs. 0.30
// Total Energy Cost: Rs. 0.60

// Input 2 :

// 45.0
// 3
// 250.0 400.0 345.67

// Output 2 :

// Day-wise Energy Cost:
// Day 1: Rs. 11250.00
// Day 2: Rs. 18000.00
// Day 3: Rs. 15555.15
// Total Energy Cost: Rs. 44805.15

// Input 3 :

// 100.0
// 1
// 1000.0

// Output 3 :

// Day-wise Energy Cost:
// Day 1: Rs. 100000.00
// Total Energy Cost: Rs. 100000.00

import java.util.Scanner;

interface CostCalculator{
    void calculateAndDisplayCost();
    void getEnergyDetails(Scanner scanner);
}



class EnergyConsumptionTracker implements CostCalculator{
    double ratePerUnit;
    int numDays;
    EnergyConsumptionTracker(double ratePerUnit,int numDays){
        this.ratePerUnit=ratePerUnit;
        this.numDays=numDays;
    }
    double arr[];
    @Override
    public void getEnergyDetails(Scanner scanner){
        arr=new double[numDays];
        for(int a=0;a<arr.length;a++){
            arr[a]=scanner.nextDouble()*ratePerUnit;
        }
        
        System.out.println("Day-wise Energy Cost:");
        
        for(int i=0;i<arr.length;i++){
            System.out.printf("Day %d: Rs. %.2f\n",i+1,arr[i]);
        }
    }
    
    
    @Override
    public void calculateAndDisplayCost(){
        double sum=0;
        for(double i:arr){
            sum+=i;
        }
        
        System.out.printf("Total Energy cost: Rs. %.2f",sum);
    }
    
    
    
}


public class REC_OOPS_using_Java_Week_7_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ratePerUnit = scanner.nextDouble();
        int numDays = scanner.nextInt();

        CostCalculator tracker = new EnergyConsumptionTracker(ratePerUnit, numDays);

        tracker.getEnergyDetails(scanner);
        tracker.calculateAndDisplayCost();

        scanner.close();
    }
}
