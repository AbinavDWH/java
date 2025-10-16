// n a file management system, users are required to provide a valid file name when creating new files. The system enforces specific rules for file names to maintain consistency and avoid potential issues. Your task is to implement a Java program named FileNameValidator that takes user input for a file name and validates it according to the specified rules.


// Rules for Valid File Name:

//     The file name must consist of alphanumeric characters (letters and digits) only.
//     The file name must have a minimum length of 3 characters.


// Implement a custom exception, FileNameValidator, to handle cases where the entered filename does not meet the specified criteria.
// Input format :

// The input consists of a string S, representing the desired filename.
// Output format :

// The output is displayed in the following format:

// If the entered file name meets the specified criteria, the program outputs

// "Valid file name"

// If the entered file name does not meet the criteria and triggers the InvalidFileNameException, the program outputs

// "Error: Invalid file name. It must be alphanumeric and have a minimum length of 3 characters."


// Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// The string s contains uppercase, lowercases, alphanumerics, spaces, and special characters with at most 20 characters.
// Sample test cases :
// Input 1 :

// myfile123

// Output 1 :

// Valid file name

// Input 2 :

// ab

// Output 2 :

// Error: Invalid file name. It must be alphanumeric and have a minimum length of 3 characters.

// Input 3 :

// file@name

// Output 3 :

// Error: Invalid file name. It must be alphanumeric and have a minimum length of 3 characters.

// Input 4 :

// file name

// Output 4 :

// Error: Invalid file name. It must be alphanumeric and have a minimum length of 3 characters.

// Input 5 :

// File_name

// Output 5 :

// Error: Invalid file name. It must be alphanumeric and have a minimum length of 3 characters.

// Input 6 :

// letter

// Output 6 :

// Valid file name

// Input 7 :

// 1234

// Output 7 :

// Valid file name

import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidFileNameException extends Exception{
    InvalidFileNameException(){
        super("Error: Invalid file name. It must be alphanumeric and have a minimum length of 3 characters.");
    }
}



public class REC_OOPS_using_Java_Week_8_Q5 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        try{
            Pattern al=Pattern.compile("[^0-9A-Za-z]");
            
            String str=scan.nextLine();
            
            
             
             
            if(str.length()>=3){
                if(al.matcher(str).find()){
                    throw new  InvalidFileNameException();
                }
                else{
                     System.out.print("Valid file name");
                }
                
            }
            else{
                throw new  InvalidFileNameException();
            }
        }
        
        catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
