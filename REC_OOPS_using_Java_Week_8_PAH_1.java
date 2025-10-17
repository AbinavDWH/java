// Enigma is developing a simple web application that takes a user-input URL, validates it, and throws a custom exception InvalidURLFormatException if the URL does not start with "http://" or "https://". 


// The main method prompts the user for input, validates the URL, and prints whether it is valid or not.
// Input format :

// The input consists of a string, representing the URL entered by the user.
// Output format :

// The output displays one of the following results:


// If the entered URL is valid according to the specified format, the program prints:

// "[URL] is a valid URL"

// If the entered URL is not valid according to the specified format, the program prints:

// "Invalid URL format: [URL]"


// Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// 1 ≤ Length of the String ≤ 50
// Sample test cases :
// Input 1 :

// http://www.example.com

// Output 1 :

// http://www.example.com is a valid URL

// Input 2 :

// ftp://ftp.example.com

// Output 2 :

// Invalid URL format: ftp://ftp.example.com

// Input 3 :

// https://google.com

// Output 3 :

// https://google.com is a valid URL

import java.util.Scanner;

class InvalidURLFormatException extends Exception{
    InvalidURLFormatException(String s){
        super("Invalid URL format: "+s);
    }
}

public class REC_OOPS_using_Java_Week_8_PAH_1 {
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        try {
            String str=scan.nextLine();
            if(!(str.startsWith("http://")||str.startsWith("https://"))){
                throw new  InvalidURLFormatException(str);
            }
            System.out.print(str+" is a valid URL");
        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
