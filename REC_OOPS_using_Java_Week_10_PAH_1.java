// Riya is building a calendar event scheduler where each event is stored in chronological order using a TreeMap. The key represents the event time in 24-hour format (HH:MM), and the value is the event description.


// She wants the system to:

//     Automatically sort events by time.
//     Avoid duplicate time entries — if a duplicate time is entered, ignore the new entry.
//     Print all scheduled events in order.


// Implement this logic using a class named EventManager.
// Input format :

// The first line of the input contains an integer n, representing the number of events.

// The next n lines each contain a string in the format: "HH:MM Description"

// (Example: 09:00 TeamMeeting).
// Output format :

// The first line of the output prints "Scheduled Events:"

// The next k lines print each event in the format: "HH:MM - Description"


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ n ≤ 50

// HH:MM will always be a valid 24-hour time

// Descriptions do not contain spaces

// Ignore any duplicate HH:MM entries
// Sample test cases :
// Input 1 :

// 5
// 09:00 TeamMeeting
// 13:30 LunchBreak
// 11:00 ProjectUpdate
// 09:00 Standup
// 15:00 ClientCall

// Output 1 :

// Scheduled Events:
// 09:00 - TeamMeeting
// 11:00 - ProjectUpdate
// 13:30 - LunchBreak
// 15:00 - ClientCall

// Input 2 :

// 4
// 10:00 CallClient
// 09:00 MorningBrief
// 12:00 Lunch
// 09:00 DuplicateEvent

// Output 2 :

// Scheduled Events:
// 09:00 - MorningBrief
// 10:00 - CallClient
// 12:00 - Lunch

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class REC_OOPS_using_Java_Week_10_PAH_1 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        
        Map<String,String> map=new TreeMap<>();
        
        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            String str[]=scan.nextLine().split(" ");
            if(!map.containsKey(str[0])){
                map.put(str[0],str[1]);
            }
        }
        
        System.out.println("Scheduled Events:");
        map.forEach((key,value)->System.out.println(key+" - "+value));
    }        

}
