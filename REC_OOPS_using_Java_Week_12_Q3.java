// In the mystical realm of programming, there exists a magical incantation to reveal hidden words.


// Elara, the skilled enchantress, wishes to summon a word using her spell and then reverse its characters to uncover its enchanted reflection.

// Write a program that uses the predefined functional interface Supplier<String> and a lambda expression to:


// Supply (generate) a string, and

// Display its reversed form.


// Input format :

// No input is required from the user.

// The string must be supplied internally using a Supplier<String>.
// Output format :

// Print the reversed version of the supplied string.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The supplied string can contain lowercase, uppercase, or special characters.

// Length of the string ≤ 25.


// Sample test cases :
// Input 1 :

// Wizard!!

// Output 1 :

// !!draziW

// Input 2 :

// Enchanted

// Output 2 :

// detnahcnE

import java.util.Scanner;
import java.util.function.Supplier;

public class REC_OOPS_using_Java_Week_12_Q3 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        String name=scan.nextLine();
        char str[]=name.toCharArray();
        Supplier<String> rev=()->{
            for(int i=0;i<str.length/2;i++){
                char t=str[i];
                str[i]=str[str.length-i-1];
                str[str.length-i-1]=t;
            }
            return new String(str);
        };
        
        System.out.print(rev.get());
    }    
}
