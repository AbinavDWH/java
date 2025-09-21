// Ram is working as a developer for BrightEdu Coaching Center, which wants to build a student fee management system.


// Each student’s enrollment has:


//     An Enrollment ID (integer)
//     A Student Name (string)
//     The Number of Subjects (integer)


// The fee calculation rules are:


//     Registration Fee = 1000 units (flat for every student).
//     Per Subject Fee = 800 units.
//     If the student enrolls in more than 5 subjects, a 20% scholarship (discount) is applied on the total fee.


// Ram has been asked to implement this system using:


//     A class with attributes for student details.
//     A constructor to initialize student details.
//     Setter methods to update details if needed.
//     Getter methods to retrieve details.
//     Objects of the class to represent student enrollments.


// Finally, display each student’s details and final fee.
// Input format :

// The first line of input contains an integer N, representing the number of students.

// For each student:

//     The next line contains the Enrollment ID (integer).
//     The following line contains the student’s name (string).
//     The next line contains the Number of subjects (integer).

// Output format :

// For each student, print the details in the following format:

//     Enrollment ID: <enrollment_id>
//     Student Name: <student_name>
//     Final Fee: <final_fee> (rounded to one decimal place)


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 100

// 1000 ≤ Enrollment ID ≤ 9999

// Student Name should not be empty

// Number of subjects ≥ 1
// Sample test cases :
// Input 1 :

// 1
// 1234
// Ravi Kumar
// 3

// Output 1 :

// Enrollment ID: 1234
// Student Name: Ravi Kumar
// Final Fee: 3400.0

import java.util.Scanner;

class enroll{
    
    private int id;
    private int NoS;
    private String Name;
    enroll(int id,String Name,int NoS){
        this.id=id;
        this.Name=Name;
        this.NoS=NoS;
    }
    
    private double fees=1000;
    
    
    
    void display(){
        
        fees+=NoS*800;
    
    
    if(NoS>5){
        fees*=0.8;
    }
        System.out.println("Enrollment ID: "+id);
        System.out.println("Student Name: "+Name);
        System.out.printf("Final Fee: "+fees);
    }
    
}


public class REC_OOPS_using_Java_Week_5_Q5 {
    public static void main(String arg[]){
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=0;i<n;i++){
            int id =scan.nextInt();
            scan.nextLine();
            String name=scan.nextLine();
            int nos=scan.nextInt();
            var obj=new enroll(id,name,nos);
            obj.display();
            
        }
    }
}
