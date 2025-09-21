// // Anjali is working as a developer for the City Basketball Association, which wants to build a system to track and find the top scorer among basketball players.


// Each player’s record has:


//     Player ID (integer)
//     Player Name (string)
//     An array of points scored in 5 matches (integers)


// The system must calculate:


//     The total score of each player (sum of all match points).
//     Identify the highest scorer among all players.
//     If two or more players have the same total score, the one with the lower Player ID is considered the top scorer.


// Anjali has been asked to implement this system using:


//     A class with attributes for player details.
//     A constructor to initialize player details.
//     Getter and Setter methods to retrieve and update player details if required.
//     A method to calculate the total score.
//     Objects of the class to represent players.


// Finally, display each player’s details and announce the Top Scorer.
// Input format :

// The first line of input contains an integer N (number of players).

// For each player:

//     The next line contains the Player ID (integer).
//     The following line contains the Player Name (string).
//     The next line contains 5 integers separated by spaces (points scored in 5 matches).

// Output format :

// For each player the output prints the following details:

//     Player ID: <player_id>
//     Player Name: <player_name>
//     Total Score: <total_score>


// Finally, print "Top Scorer: <player_name> with <total_score> points"


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 50

// 1000 ≤ Player ID ≤ 9999

// Player Name should not be empty

// Points scored per match ≥ 0
// Sample test cases :
// Input 1 :

// 1
// 1001
// Ravi Kumar
// 10 20 30 40 50

// Output 1 :

// Player ID: 1001
// Player Name: Ravi Kumar
// Total Score: 150
// Top Scorer: Ravi Kumar with 150 points

// Input 2 :

// 2
// 1005
// Deepak Mehta
// 30 30 30 30 30
// 1006
// Neha Gupta
// 25 35 30 30 30

// Output 2 :

// Player ID: 1005
// Player Name: Deepak Mehta
// Total Score: 150
// Player ID: 1006
// Player Name: Neha Gupta
// Total Score: 150
// Top Scorer: Deepak Mehta with 150 points

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
        for(int i:arr){
            total+=i;
        }
        System.out.println("Player ID: "+p_id);
        System.out.println("Player Name: "+name);
        System.out.println("Total Score: "+total);
    } 
}


public class REC_OOPS_using_Java_Week_5_CY_3 {
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


