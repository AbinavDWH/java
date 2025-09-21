// Anjali is now working as a developer for the City Marathon Association, which wants to build a system to track and find the fastest runner among marathon participants.


// Each runner’s record has:


//     Runner ID (integer)
//     Runner Name (string)
//     An array of times (in minutes) taken in 5 marathon events (integers)


// The system must calculate:


//     The average time of each runner (sum of all times / 5).
//     Identify the fastest runner (the one with the lowest average time).
//     If two or more runners have the same average time, the one with the lower Runner ID is considered the fastest runner.


// Anjali has been asked to implement this system using:


//     A class with attributes for runner details.
//     A constructor to initialize runner details.
//     Getter and Setter methods to retrieve and update runner details if required.
//     A method to calculate the average time.
//     Objects of the class to represent runners.


// Finally, display each runner’s details and announce the Fastest Runner.
// Input format :

// The first line of input contains an integer N (number of runners).

// For each runner:

//     The next line contains the Runner ID (integer).
//     The following line contains the Runner Name (string).
//     The next line contains 5 integers separated by spaces (times in minutes for 5 marathon events).

// Output format :

// For each runner the output prints the following details:

//     Runner ID: <runner_id>
//     Runner Name: <runner_name>
//     Average Time: <average_time>


// Finally, print "Fastest Runner: <runner_name> with <average_time> minutes"


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 50

// 1000 ≤ Runner ID ≤ 9999

// Runner Name should not be empty

// Time taken in each event > 0
// Sample test cases :
// Input 1 :

// 1
// 1001
// Ravi Kumar
// 240 250 245 255 260

// Output 1 :

// Runner ID: 1001
// Runner Name: Ravi Kumar
// Average Time: 250
// Fastest Runner: Ravi Kumar with 250 minutes

// Input 2 :

// 4
// 1030
// Varun Singh
// 200 200 200 200 200
// 1031
// Shivani Sharma
// 210 210 210 210 210
// 1032
// Alok Yadav
// 190 190 190 190 190
// 1033
// Simran Kaur
// 195 195 195 195 195

// Output 2 :

// Runner ID: 1030
// Runner Name: Varun Singh
// Average Time: 200
// Runner ID: 1031
// Runner Name: Shivani Sharma
// Average Time: 210
// Runner ID: 1032
// Runner Name: Alok Yadav
// Average Time: 190
// Runner ID: 1033
// Runner Name: Simran Kaur
// Average Time: 195
// Fastest Runner: Alok Yadav with 190 minutes

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class p_list{
     int p_id;
    String p_name;
    int arr[]=new int[5];
    int total=0,avg;
    p_list(int p_id,String p_name,int arr[]){
        this.p_id=p_id;
        this.p_name=p_name;
        this.arr=arr;
    }
    void result(){
        total=0;int f=0;
        for(int i=0;i<5;i++){
            total+=arr[i];

        }
        avg=total/5;
        System.out.println("Runner ID: "+p_id);
        System.out.println("Runner Name: "+p_name);
        //System.out.println("Average Score: "+total);
        System.out.println("Average Time: "+avg);
        
    }
    
}


public class REC_OOPS_using_Java_Week_5_CY_1 {
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
       
        p_list obj[]=new p_list[n];
        for(int i=0;i<n;i++){
            int id=scan.nextInt();
            scan.nextLine();
            String name=scan.nextLine();
            int arr[]=new int[5];
            for(int j=0;j<5;j++){
                arr[j]=scan.nextInt();
            }
            obj[i]=new p_list(id,name,arr);
            obj[i].result();
                    
            
            }
            Arrays.sort(obj,Comparator.comparing(p->p.total));
      
        if(n>1 && obj[0].total==obj[1].total){
            if(obj[0].p_id>obj[1].p_id){
            System.out.println("Top Scorer: "+obj[1].p_name +" with "+obj[1].total+" points");
            return;}
        }
        System.out.println("Fastest Runner: "+obj[0].p_name +" with "+obj[0].avg+" minutes");
        
    }    
}
