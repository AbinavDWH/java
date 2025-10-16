
// Write a program to validate the email address and display suitable exceptions if there is any mistake.


// Create 3 custom exception classes as below

//     DotException
//     AtTheRateException
//     DomainException


// A typical email address should have a " . " character, and a "@" character, and also the domain name should be valid. Valid domain names for practice be 'in', 'com', 'net', or 'biz'. 


// Display Invalid Dot usage, Invalid @ usage, or Invalid Domain message based on email id.


// Get the email address from the user, validate the email by checking the above-mentioned criteria, and print the validity status of the input email address.
// Input format :

// The first line of input contains the email to be validated.
// Output format :

// The output prints a Valid email address or an Invalid email address along with the suitable exception

// If email ends with . or contains not exactly one . after @, it throws:

// DotException: Invalid Dot usage

// Invalid email address


// If @ appears not exactly once, it throws:

// AtTheRateException: Invalid @ usage

// Invalid email address


// If the part after the last dot is not among accepted domains:

// DomainException: Invalid Domain

// Invalid email address


// If all conditions satisfied then print:

// Valid email address


// Refer to the sample input and output for format specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// ﻿The email address will contain only alphanumeric characters, '.', '@', and domain extensions.

// The length of the email address will be between 5 ≤ length(email) ≤ 50.

// The email must contain exactly one '@' character.

// The email must contain at least one '.' after the '@' character.

// The domain extension must be one of 'in', 'com', 'net', 'biz'.

// The email must not start or end with '.' or '@'.

// Consecutive occurrences of '.' or '@' are not allowed.
// Sample test cases :
// Input 1 :

// sample@gmail.com

// Output 1 :

// Valid email address

// Input 2 :

// sample@gmail.com.

// Output 2 :

// DotException: Invalid Dot usage
// Invalid email address

// Input 3 :

// sample@gmail.con

// Output 3 :

// DomainException: Invalid Domain
// Invalid email address

// Input 4 :

// a@b.v

// Output 4 :

// DomainException: Invalid Domain
// Invalid email address

import java.util.Scanner;

class DotException extends Exception{
    public DotException(){
        super("DotException: Invalid Dot usage");
    }
}

class AtTheRateException extends Exception{
    
    
    public  AtTheRateException(){
        super("AtTheRateException: Invalid @ usage");
    }
    
}

class DomainException extends Exception{
    
    public  DomainException(){
        super("DomainException: Invalid Domain");
    }  
}


public class REC_OOPS_using_Java_Week_8_Q1 {
     public static void isvalid(String str) throws Exception {
        
        char arr[]=str.toCharArray();
        if(!str.contains(".")) throw new DotException();
        else if(str.endsWith(".")||str.startsWith("."))   throw new DotException();
        
        else if(!str.contains("@")) throw new  AtTheRateException();
        else if(str.contains("@")){
            if(str.endsWith("@")||str.startsWith("@")) throw new    AtTheRateException();
            int c=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='@')
                c++;
                
            }
            if(c>1) throw new AtTheRateException();
            
        }
        
        if(!(str.endsWith(".in")||str.endsWith(".com")||str.endsWith(".net")||str.endsWith(".biz")))
        throw new  DomainException();
        
    }
    
    
    public static void main(String arg[]) {
        Scanner scan =new Scanner(System.in);
        
        try{
            String email=scan.nextLine();
            isvalid(email);
            System.out.println("Valid email address");
        }
        catch(Exception e){
            System.out.println(e.getMessage()+"\nInvalid  email address");
        }
        
    }
}
