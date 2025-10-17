// An HR software system is being developed to process employee payrolls. During payroll processing, the system must ensure that no employee has a negative salary and that no employee's salary exceeds ₹2,00,000. If either condition occurs, the system should throw a custom exception. 


// Create a custom exception InvalidSalaryException and a class Employee that processes salary according to the following rules:


//     If salary < 0, throw InvalidSalaryException with the message: "Salary cannot be negative". 
//     If salary > 200000, throw InvalidSalaryException with the message: "Salary exceeds threshold limit". 
//     Otherwise, display: "Salary processed successfully for <empName>: <salary>". 


// The payroll processing should always display: "Payroll process completed" at the end, regardless of whether an exception occurs.
// Input format :

// The first line of input contains an integer representing the employee ID.

// The second line contains a string representing the employee's name.

// The third line contains a floating-point number representing the salary of the employee.
// Output format :

// If the salary is valid: "Salary processed successfully for <empName>: <salary>"

// "Payroll process completed"

// If the salary is invalid: "<Exception Message>"

// "Payroll process completed"


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// empId > 0

// empName is a non-empty string salary can be any floating-point number

// Maximum salary allowed: 200000

// Minimum salary allowed: 0
// Sample test cases :
// Input 1 :

// 101
// Rahul
// 150000.0

// Output 1 :

// Salary processed successfully for Rahul: 150000.0
// Payroll process completed

// Input 2 :

// 102
// Sneha
// -5000

// Output 2 :

// Salary cannot be negative
// Payroll process completed

// Input 3 :

// 103
// Anita
// 250000

// Output 3 :

// Salary exceeds threshold limit
// Payroll process completed

import java.util.Scanner;

class InvalidSalaryException extends Exception{
    InvalidSalaryException(String s){
        super(s);
    }
}


public class REC_OOPS_using_Java_Week_8_PAH_2 {
    public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        
        try{
            int id=scan.nextInt();
            scan.nextLine();
            String name=scan.nextLine();
            float sal=scan.nextFloat();
            
            if(sal<0){
                throw new InvalidSalaryException("Salary cannot be negative");
            }
            else if(sal>200000)
            throw new InvalidSalaryException("Salary exceeds threshold limit");
            else 
            System.out.print("Salary processed successfully for "+name+":"+sal);
        }
        catch (InvalidSalaryException e){
            System.out.print(e.getMessage());
        }
        finally{
            System.out.print("\nPayroll process completed");
        }
    }
}
