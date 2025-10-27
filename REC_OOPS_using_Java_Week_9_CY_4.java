// Aarav is developing a music playlist application where users can manage their favorite songs. He wants to implement a feature that allows users to reorder the playlist by moving a song from one position to another.


// You need to implement a function that performs the following operations using a LinkedList:

//     Add songs to the playlist in the given order.
//     Move a song from a specified position to another position in the playlist.
//     Print the final playlist after all operations.

// Input format :

// The first line of the input consists of an integer n representing the number of songs.

// The next n lines, each containing a string representing a song name.

// After the songs are given the next line contains an integer m, the number of move operations.

// The next m lines, each containing two integers x and y representing the move operation where the song at position x (0-based index) should be moved to position y.
// Output format :

// The output prints the final playlist, each song on a new line.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ n ≤ 100

// 1 ≤ m ≤ 50

// 0 ≤ x, y < n

// x ≠ y
// Sample test cases :
// Input 1 :

// 5  
// SongA  
// SongB  
// SongC  
// SongD  
// SongE  
// 2  
// 2 4  
// 0 3  

// Output 1 :

// SongB  
// SongD  
// SongE  
// SongA  
// SongC  

// Input 2 :

// 3  
// Rock  
// Jazz  
// Pop  
// 1  
// 1 0  

// Output 2 :

// Jazz  
// Rock  
// Pop  

import java.util.LinkedList;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_9_CY_4 {
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        
        LinkedList<String> node = new LinkedList<>();
        
        int n=scan.nextInt();
        
        
        scan.nextLine();
        
        for(int i=0;i<n;i++){
            node.add(scan.nextLine());
        }
        
        int f=scan.nextInt();
        int int_arr[][]=new int[f][2];
        for(int i=0;i<f;i++){
            int_arr[i][0]=scan.nextInt();
            int_arr[i][1]=scan.nextInt();
        }
        
        for(int i=0;i<f;i++){
            String temp1=node.get(int_arr[i][0]);
            node.remove(int_arr[i][0]);
            node.add(int_arr[i][1],temp1);
        }
        
        for(String s:node){
            System.out.println(s);
        }
        
    }    
}
