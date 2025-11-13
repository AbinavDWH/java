// Aditya is developing a reading app that recommends books to users based on a predefined list.


// Each time a user opens the app, it should supply the next book title in the list, one at a time, using a lambda expression and the Supplier functional interface.


// When all books have been recommended, the list should start again from the beginning.
// Input format :

// The first line contains an integer n — the total number of available book titles.

// The next n lines each contain a book title (a string).

// The next line contains an integer m — the number of times users open the app (i.e., the number of recommendations to be made).
// Output format :

// Print the supplied book title for each recommendation, one per line.

// If m > n, repeat the list from the start.
// Code constraints :

// 1 ≤ n ≤ 10

// 1 ≤ m ≤ 50

// Each book title length ≤ 100 characters
// Sample test cases :
// Input 1 :

// 3
// The Alchemist
// Atomic Habits
// Ikigai
// 5

// Output 1 :

// The Alchemist
// Atomic Habits
// Ikigai
// The Alchemist
// Atomic Habits

// Input 2 :

// 4
// Clean Code
// Deep Work
// The Pragmatic Programmer
// Think Like a Monk
// 6

// Output 2 :

// Clean Code
// Deep Work
// The Pragmatic Programmer
// Think Like a Monk
// Clean Code
// Deep Work

import java.util.Scanner;
import java.util.function.Supplier;

public class REC_OOPS_using_Java_Week_12_PAH_4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        scan.nextLine();
        final String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=scan.nextLine();
        }
        
        int m=scan.nextInt();
        scan.nextLine();
        
        for(int i=0;i<m;i++){
            int index=i%n;
            Supplier<String> sup=()->str[index];
            System.out.println(sup.get());
        }
    }    
}
