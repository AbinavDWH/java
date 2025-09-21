// Neha is working as a developer for CityQuiz Platform, which wants to build a system to calculate quiz scores and identify top scorers among participants.


// Each participant’s record has:


//     Participant ID (integer)
//     Participant Name (string)
//     An array of scores in 5 quiz rounds (integers, each between 0 and 100)


// The system must calculate:


//     Total Score = sum of scores in all 5 rounds.
//     Average Score = Total Score ÷ 5.
//     If a participant scores above 80 in all rounds, a bonus of 10 points is added to the total score.
//     Identify the Top Scorer among all participants. If two participants have the same total score, the one with the lower Participant ID is considered the top scorer.


// Neha has been asked to implement this system using:


//     A class with attributes for participant details.
//     A constructor to initialize participant details.
//     Getter and setter methods to retrieve or update participant details.
//     A method to calculate total score and average score (including bonus if applicable).
//     Objects of the class to represent participants.


// Finally, display each participant’s details and announce the Top Scorer.
// Input format :

// The first line of input contains an integer N, representing the number of participants.

// For each participant:

//     Next line: Participant ID (integer)
//     Next line: Participant Name (string)
//     Next line: 5 integers separated by spaces (scores for 5 quiz rounds)

// Output format :

// For each participant:

//     Participant ID: <participant_id>
//     Participant Name: <participant_name>
//     Total Score: <total_score>
//     Average Score: <average_score>


// Finally, print "Top Scorer: <participant_name> with <total_score> points"


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 50

// 1000 ≤ Participant ID ≤ 9999

// Participant Name should not be empty

// Scores per round are between 0 and 100
// Sample test cases :
// Input 1 :

// 1
// 1001
// Ravi Kumar
// 85 90 88 92 87

// Output 1 :

// Participant ID: 1001
// Participant Name: Ravi Kumar
// Total Score: 452
// Average Score: 90
// Top Scorer: Ravi Kumar with 452 points

// Input 2 :

// 2
// 1002
// Sita Sharma
// 70 75 80 65 60
// 1003
// Amit Verma
// 88 90 85 92 89

// Output 2 :

// Participant ID: 1002
// Participant Name: Sita Sharma
// Total Score: 350
// Average Score: 70
// Participant ID: 1003
// Participant Name: Amit Verma
// Total Score: 454
// Average Score: 90
// Top Scorer: Amit Verma with 454 points

import java.util.Arrays;
import java.util.Scanner;


class player{
    int p_id;
    String name;
    int arr[];
    player(int p_id,String name,int arr[]){
        this.p_id=p_id;
        this.name=name;
        this.arr=arr;
    }
    int total=0;
    
    void score(){
        int f=0;
        for(int i:arr){
            total+=i;
            if(i<=80){
                f=1;
            }
        }
        if(f==0)
        total+=10;
        System.out.println("Participant ID: "+p_id);
        System.out.println("Participant Name: "+name);
        System.out.println("Total Score: "+total);
        System.out.println("Average Score: "+total/5);
    } 
}



public class REC_OOPS_using_Java_Week_5_PAH_2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        player obj[]=new player[n];
        for(int i=0;i<n;i++){
            int id=scan.nextInt();
            scan.nextLine();
            String name=scan.nextLine();
            int arr[]=new int[5];
            for(int j=0;j<5;j++){
                arr[j]=scan.nextInt();
            }
            obj[i]=new player(id,name,arr);
            obj[i].score();
        }
        
        Arrays.sort(obj,(a,b)->{
            if(b.total!=a.total){
                return b.total-a.total;
            }
            else{
                return a.p_id-b.p_id;
            }
        });
        
        System.out.print("Top Scorer: "+obj[0].name+" with "+obj[0].total+" points");
    }     
}
