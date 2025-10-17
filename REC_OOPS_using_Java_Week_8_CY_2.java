
// In an online shopping cart system, users can apply coupon codes during checkout to avail of discounts. However, to ensure the validity and security of coupon codes, the system enforces specific rules for their format. Your task is to implement a Java program named CouponCodeValidator that takes user input for a coupon code and validates it according to the specified rules.


// Rules for Valid Coupon Code:

//     The coupon code must consist of exactly 10 characters.
//     The coupon code must contain at least one alphabet (uppercase or lowercase) and at least one digit (0-9).
//     Special characters are not allowed in the coupon code.


// Implement a custom exception, InvalidCouponException, to handle cases where the entered coupon code does not meet the specified criteria.
// Input format :

// The input consists of a string s, representing the coupon code.
// Output format :

// The output is displayed in the following format:

// If the entered coupon code meets the specified criteria, the program outputs

// "Coupon code applied successfully!"

// If the entered coupon code has less than or more than 10 characters it outputs

// "Error: Invalid coupon code length. It must be exactly 10 characters."

// If the entered coupon code contains only numeric or only alphabets it outputs

// "Error: Invalid coupon code format. It must contain at least one alphabet and one digit."

// If the entered coupon code contains special characters it outputs

// "Error: Coupon code should not contain special characters."


// Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// The string s contains uppercase, lowercase, alphanumeric, and special characters with at most 20 characters.
// Sample test cases :
// Input 1 :

// ABCD123456

// Output 1 :

// Coupon code applied successfully!

// Input 2 :

// AB12CD

// Output 2 :

// Error: Invalid coupon code length. It must be exactly 10 characters.

// Input 3 :

// AB#CD12345

// Output 3 :

// Error: Coupon code should not contain special characters.

// Input 4 :

// 1234567890

// Output 4 :

// Error: Invalid coupon code format. It must contain at least one alphabet and one digit.

// Input 5 :

// ABCDEFGH!!

// Output 5 :

// Error: Coupon code should not contain special characters.

import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidCouponException extends Exception{
    InvalidCouponException(String s){
        super("Error: "+s);
    }
}

public class REC_OOPS_using_Java_Week_8_CY_2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        try{
            String str=scan.nextLine();
            Pattern al=Pattern.compile("[^A-Za-z0-9]");
            Pattern alp=Pattern.compile("[A-Za-z]");
            Pattern d=Pattern.compile("[0-9]");
            if(str.length()!=10)
            throw new InvalidCouponException("Invalid coupon code length. It must be exactly 10 characters.");

            else if(al.matcher(str).find()){
                throw new InvalidCouponException("Coupon code should not contain special characters.");
            }            else if(!alp.matcher(str).find()||!d.matcher(str).find()){
                throw new InvalidCouponException("Invalid coupon code format. It must contain at least one alphabet and one digit.");
            }else if(!alp.matcher(str).find()||!d.matcher(str).find()){
                throw new InvalidCouponException("Invalid coupon code format. It must contain at least one alphabet and one digit.");
            }
            else{
                System.out.print("Coupon code applied successfully!");
            }
        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}
