
// Vikram loves listening to music and wants to create a simple playlist manager using Java Collections. The playlist supports the following operations:


//     "ADD <song>" → Adds the song to the end of the playlist.
//     "REMOVE <song>" → Removes the first occurrence of the song from the playlist. If the song is not found, do nothing.
//     "SHOW" → Displays all songs in the playlist in order. If the playlist is empty, print "EMPTY".
//     "NEXT" → Moves to the next song in the playlist and prints its name. If the playlist is empty, print "EMPTY".


// The playlist maintains a "current song" position that starts at the first song when it's added. The NEXT command moves to the next song and prints it, wrapping around to the first song after reaching the last song. When removing songs, the current position adjusts accordingly to maintain proper navigation.


// Help Vikram implement this playlist manager.
// Input format :

// The first line of the input consists of an integer n, the number of operations.

// The next n lines, each containing a command:

//     "ADD <song>"
//     "REMOVE <song>"
//     "SHOW"
//     "NEXT"

// Output format :

// For each "SHOW" command, print the songs in order, separated by spaces.

// For each "NEXT" command, print the next song in the playlist.

// If no song exists, print "EMPTY".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ n ≤ 100

// Song names consist of lowercase letters (a-z).
// Sample test cases :
// Input 1 :

// 7
// ADD song1
// ADD song2
// SHOW
// NEXT
// REMOVE song2
// SHOW
// NEXT

// Output 1 :

// song1 song2 
// song2
// song1 
// song1

// Input 2 :

// 4
// SHOW
// ADD track1
// ADD track2
// NEXT

// Output 2 :

// EMPTY
// track2

import java.util.LinkedList;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_9_Q2 {
     public static void main(String arg[]){
        LinkedList<String> node=new LinkedList<>();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            String temp=scan.nextLine();
            String str[]=temp.split(" ");
            
            switch (str[0]){
                case "SHOW":
                    if(!node.isEmpty())
                    node.forEach(System.out::println);
                    else{
                        System.out.println("EMPTY");
                    }
                    break;
                case "REMOVE":
                    node.removeIf(s->s.equals(str[1]));
                    break;
                case "NEXT":
                    if(node.size()==1){
                        System.out.println(node.get(0));
                    }
                    else if (node.size()>1)
                    System.out.println(node.get(1));
                    else{
                        System.out.print("EMPTY");
                    }
                    
                    break;
                    
                case "ADD":
                        node.addLast(str[1]);
                    break;
            }
        }
}
}