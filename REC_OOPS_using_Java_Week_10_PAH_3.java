// Sarah is working on a spam detection system that analyzes incoming messages for unique patterns. Spammers often use repetitive character sequences, making it important to identify the first non-repeating character in a message. 


// Given a string, Sarah needs to determine the first character that appears only once. If all characters repeat, the system should return -1. 


// She decides to use a HashMap to efficiently track character frequencies and find the solution.
// Input format :

// The first line contains an integer N representing , the length of the string.

// The second line contains a string of N lowercase English letters (a-z).
// Output format :

// The output prints a character representing the first non-repeating character. If none exist, print -1.


// Refer to the sample output for formatting specifications.
// Code constraints :

// 1 ≤ N ≤ 100
// Sample test cases :
// Input 1 :

// 10
// abacabadac

// Output 1 :

// d

// Input 2 :

// 4
// abcd

// Output 2 :

// a

// Input 3 :

// 4
// iioo

// Output 3 :

// -1

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_10_PAH_3 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        Map<Character,Integer> map=new LinkedHashMap<>();
        
        int n=scan.nextInt();
        scan.nextLine();
        String str=scan.nextLine();
        char arr[]=str.toCharArray();
        
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1); 
        }
        
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.print(entry.getKey());
                return;
            }
        }
        System.out.print("-1");
    }    
}
