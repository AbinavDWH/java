// You are tasked to create a program that defines a custom exception GradeException. The program should include a Student class with fields for the student's name, age, and grade. Implement a method in the Student class that checks the grade, and if the grade is below 40, it should throw a GradeException. Otherwise, it should display the student's details.
// Input format :

// The input consists of three parameters in separate lines:

//     A string representing the student's name.
//     An integer representing the student's age.
//     An integer representing the student's grade.

// Output format :

// The output will display the student's details if the grade is valid.

// If the grade is below 40, the program will display an error message "Grade is below 40".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ age ≤ 100

// 0 ≤ grade ≤ 100

// The name is a non-empty string.
// Sample test cases :
// Input 1 :

// Alice
// 20
// 85

// Output 1 :

// Name: Alice
// Age: 20
// Grade: 85

// Input 2 :

// Bob
// 18
// 35

// Output 2 :

// Grade is below 40

import java.util.Scanner;

class GradeException extends Exception{
    GradeException(){
        super("Grade is below 40");
    }
}

public class REC_OOPS_using_Java_Week_8_PAH_4 {
     public static void main(String arg[]) throws Exception{
        Scanner scan=new Scanner(System.in);
        try{
            String name=scan.nextLine();
            int age=scan.nextInt();
            int mark =scan.nextInt();
            
            if(mark<40)
            throw new GradeException();
            
            System.out.print("Name: "+name+"\nAge: "+age+"\nGrade: "+mark);
        }
        catch (Exception e){
            System.out.print(e.getMessage());
        }
    } 
}
