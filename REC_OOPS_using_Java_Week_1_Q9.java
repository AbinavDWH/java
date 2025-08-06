// Phill is a quality control manager at a manufacturing plant. He needs to verify if a sensor reading at a midpoint station (S2) falls exactly halfway between the readings of the previous station (S1) and the next station (S3). Help him by developing a program that checks if the second sensor reading is the average (midpoint) of the first and third sensor readings.


// Use the relational operator to solve the program.
// Input format :

// The first line of input consists of an integer S1, representing the sensor reading of the first station.

// The second line consists of an integer S2, representing the sensor reading of the midpoint station.

// The third line consists of an integer S3, representing the sensor reading of the next station.
// Output format :

// The first line of output displays a boolean value representing whether the sensor reading at the midpoint station is halfway between the readings of the first and the next stations.

// The second line displays one of the following:

//     If the result is true, print "The second integer is halfway between the first and third integers."
//     Otherwise, print "The second integer is not halfway between the first and third integers."


// Refer to the sample output for formatting specifications.
// Code constraints :

// 0 ≤ S1, S2, S3 ≤ 1000
// Sample test cases :
// Input 1 :

// 1
// 7
// 10

// Output 1 :

// false
// The second integer is not halfway between the first and third integers.

// Input 2 :

// 1
// 5
// 9

// Output 2 :

// true
// The second integer is halfway between the first and third integers.

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_Q9 {
     public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt(),n2=scan.nextInt(),n3=scan.nextInt();
        boolean t=(n1+n3)/2==n2;
        System.out.println(t);
        String s;
        if(t){
        s="";}
        else{
        s="not ";}
        System.out.print("The second integer is "+s+"halfway between the first and third integers.");
    }
}
