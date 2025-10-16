// In a user registration system, there is a requirement to implement a username validation module. Users attempting to register must adhere to specific criteria for their usernames to be considered valid. 


// Your task is to develop a program that takes user input for a desired username and validates it according to the following rules:

//     The username must not contain any spaces.
//     The username must be at least 5 characters long.


// Implement a custom exception, InvalidUsernameException, to handle cases where the entered username does not meet the specified criteria.
// Input format :

// The input consists of a string S, representing the desired username.
// Output format :

// If the username is valid, print "Username is valid: [S]".

// If the username is invalid:

//     If the username is short, print "Invalid Username: Username must be at least 5 characters long"
//     If the username contains spaces, print "Invalid Username: Username cannot contain spaces"


// Refer to the sample output for formatting specifications.
// Code constraints :

// 1 ≤ length of username ≤ 100
// Sample test cases :
// Input 1 :

// John

// Output 1 :

// Invalid Username: Username must be at least 5 characters long

// Input 2 :

// Jane Doe

// Output 2 :

// Invalid Username: Username cannot contain spaces

// Input 3 :

// Alice

// Output 3 :

// Username is valid: Alice

import java.util.Scanner;

class InvalidUsernameException extends Exception{
    InvalidUsernameException(String s){
        super("Invalid Username: "+s);    
    }
    
}


public class REC_OOPS_using_Java_Week_8_Q3 {
    public static void main(String arg[]) throws Exception{
        Scanner scan =new Scanner(System.in);
        
        try{
            String s=scan.nextLine();
            if(s.length()<5){
                throw new InvalidUsernameException("Username must be at least 5 characters long");
            }
            else if(s.contains(" ")){
                throw new InvalidUsernameException("Username cannot contain spaces");
            }
            else{
                System.out.print("Username is valid: "+s);
            }
        } 
        catch (InvalidUsernameException e){
            System.out.print(e.getMessage());
        }
    }
}
