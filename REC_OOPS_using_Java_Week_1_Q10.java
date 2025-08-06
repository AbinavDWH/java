// Aishu is supervising a construction project that needs to be completed with the help of three workers: A, B, and C.

// She knows how many days each of them would take to complete the entire project individually:


//     A can complete it in x days,
//     B in y days,
//     C in z days.


// Initially, all three workers (A, B, and C) work together for d1 days.

// After that, C leaves, and only A and B continue for another d2 days.

// Then B also leaves, and A works alone to finish the remaining work.


// Your tasks is to help aishu to implement this functionality using the class  WorkDistribution and Method calculateWork(int x, int y, int z, int d1, int d2)


//     Calculate the total work completed in the first d1 days by A, B, and C.
//     Calculate the work completed in the next d2 days by A and B.
//     Determine the remaining work after these d1 + d2 days.

// Input format :

// The first line of input contains five space-separated integers: x y z d1 d2

// where:

// x represents the Days A takes to complete the work alone

// y represents the Days B takes to complete the work alone

// z represents the Days C takes to complete the work alone

// d1 represents the Days A, B, and C work together

// d2 represents the Days A and B work together (after C leaves)
// Output format :

// The first line of output prints "Work done in first d1 days (A+B+C): " followed by a double value rounded to 2 decimal places.

// The second line of output prints "Work done in next d2 days (A+B): " followed by a double value rounded to 2 decimal places.

// The third line prints "Remaining work: " followed by a double value rounded to 2 decimal places.


// Refer to the sample output for formatting specifications.
// Code constraints :

// 1 ≤ x, y, z ≤ 1000

// 0 ≤ d1, d2 ≤ 1000
// Sample test cases :
// Input 1 :

// 10 20 30 2 2

// Output 1 :

// Work done in first d1 days (A+B+C): 0.37
// Work done in next d2 days (A+B): 0.30
// Remaining work: 0.33

// Input 2 :

// 8 12 16 2 1

// Output 2 :

// Work done in first d1 days (A+B+C): 0.54
// Work done in next d2 days (A+B): 0.21
// Remaining work: 0.25

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_Q10 {
    static void calculateWork(int x,int y,int z,int d1,int d2){
        float p1=1/(float)x,p2=1/(float)y,p3=1/(float)z;
        double r1=(Math.round((p1+p2+p3)*d1*100.0))/100.0,r2=(Math.round((p1+p2)*d2*100.0))/100.0;
        System.out.printf("Work done in first d1 days (A+B+C): %.2f\n",r1);
        System.out.printf("Work done in next d2 days (A+B): %.2f\n",r2);
        System.out.printf("Remaining work: %.2f",1-r1-r2);
    }
    
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        int n[]=new int[5];
        for(int i=0;i<5;i++){
            n[i]=scan.nextInt();
        }
       calculateWork(n[0],n[1],n[2],n[3],n[4]);
    }     
}
