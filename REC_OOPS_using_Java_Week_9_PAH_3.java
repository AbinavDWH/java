// Arun is building a task manager to keep track of tasks using a LinkedList. The task manager supports the following operations:


//     "ADD <task>" → Adds the given task to the end of the list.
//     "REMOVE" → Removes the first task from the list.
//     "SHOW" → Displays all tasks in the list in order. If the list is empty, print "EMPTY".


// Help Arun implement this functionality using a LinkedList.
// Input format :

// The first line of the input consists of an integer n, the number of operations.

// The next n lines, each containing a command:

//     "ADD <task>"
//     "REMOVE"
//     "SHOW"

// Output format :

// For each "SHOW" command, the output prints the tasks in order, separated by spaces.

// If no tasks exist, print "EMPTY".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1≤n≤100

// Task names consist of lowercase letters (a-z).
// Sample test cases :
// Input 1 :

// 5
// ADD homework
// ADD project
// SHOW
// REMOVE
// SHOW

// Output 1 :

// homework project
// project

// Input 2 :

// 4
// ADD testing
// SHOW
// REMOVE
// SHOW

// Output 2 :

// testing
// EMPTY

import java.util.LinkedList;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_9_PAH_3 {
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        LinkedList <String> node=new LinkedList<>();
        
        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            String str[]=scan.nextLine().split(" ");
            
            switch(str[0]){
                
                case "ADD":
                    node.add(str[1]);
                    break;
                case "SHOW":
                    if(node.isEmpty()){
                        System.out.println("EMPTY");
                    }
                    for(String s:node)
                    System.out.print(s+" ");
                    System.out.println();
                    
                    break;
                    
                case "REMOVE":
                    if(!node.isEmpty())
                    node.removeFirst();
                    
                    break;
            }
        }
    }
}
