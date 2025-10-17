
// Elsa, a busy professional, is using a scheduling application to plan her meetings efficiently. The application requires users to input meeting durations in minutes, ensuring that the duration is a positive integer and does not exceed 240 minutes (4 hours). Elsa needs a program to assist her in scheduling meetings securely with proper exception handling.


//     Create a Java class named ElsaMeetingScheduler.
//     Implement a custom exception:
//     InvalidDurationException for invalid meeting duration entries.
//     Implement the main method to interactively take user input for a meeting duration.
//     Implement the validateMeetingDuration method to validate the meeting duration based on the specified rules and throw a custom exception if the validation fails.
//     Print appropriate success or error messages based on the meeting duration.


// Implement a custom exception, InvalidDurationException, to handle cases where the entered meeting duration does not meet the specified criteria.
// Input format :

// The input consists of an integer value 'n', representing the meeting duration.
// Output format :

// The output is displayed in the following format:

// If the entered meeting duration meets the specified criteria, the program outputs

// "Meeting scheduled successfully!"

// If the entered meeting duration is invalid, the program outputs an error message indicating the issue.

// "Error: Invalid meeting duration. Please enter a positive integer not exceeding 240 minutes (4 hours)."


// Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// -30 ≤ n ≤ 500
// Sample test cases :
// Input 1 :

// 120

// Output 1 :

// Meeting scheduled successfully!

// Input 2 :

// -30

// Output 2 :

// Error: Invalid meeting duration. Please enter a positive integer not exceeding 240 minutes (4 hours).

// Input 3 :

// 241

// Output 3 :

// Error: Invalid meeting duration. Please enter a positive integer not exceeding 240 minutes (4 hours).

// Input 4 :

// 500

// Output 4 :

// Error: Invalid meeting duration. Please enter a positive integer not exceeding 240 minutes (4 hours)

import java.util.Scanner;

class InvalidDurationException extends Exception{
    InvalidDurationException(){
        
    }
}

public class REC_OOPS_using_Java_Week_8_Q2 {
    public static void main(String arg[]) throws Exception{
        Scanner scan=new Scanner(System.in);
        try {
            int s=scan.nextInt();
            if(s<0||s>240)
            throw new InvalidDurationException();
            else System.out.println("Meeting scheduled successfully!");
        }
        catch (Exception e){
           System.out.print("Error: Invalid meeting duration. Please enter a positive integer not exceeding 240 minutes (4 hours).");
        }
    }
}
