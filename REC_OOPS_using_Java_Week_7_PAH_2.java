// Develop a program for managing employee information that caters to both full-time and part-time employees. The program should be capable of computing the salary for each category of employee and presenting their particulars. To achieve this, create two classes, FullTimeEmployee and PartTimeEmployee, that adhere to the Employee interface.


// The program is expected to accept input data, including the name and monthly salary for full-time employees, as well as the name, hourly rate, and hours worked for part-time employees. Subsequently, it should calculate and exhibit the employee details and their respective salaries.


// For Full-Time employees, the annual salary should be calculated as 12 times the monthly salary.


// For Part-Time employees, the salary calculation should be based on the formula: hourly rate * hours worked.
// Input format :

// The first line of input should be a string representing the name of a full-time employee.

// The second line of input should be an integer representing the monthly salary of the full-time employee.

// The third line of input should be a string representing the name of a part-time employee.

// The fourth line of input should be an integer representing the hourly rate of the part-time employee.

// The fifth line of input should be an integer representing the number of hours worked by the part-time employee.
// Output format :

// The output displays the following details:


// Full-Time Employee Details:

// Name: [Full-Time Employee Name] (string)

// Monthly Salary: $[Monthly Salary] (integer)

// Annual Salary: $[12 times Monthly Salary] (integer)


// Part-Time Employee Details:

// Name: [Part-Time Employee Name] (string)

// Hourly Rate: $[Hourly Rate] (integer)

// Hours Worked: [Hours Worked] hours (integer)

// Monthly Salary: $[Calculated Monthly Salary] (integer)


// Refer to the sample output for the formatting specifications.
// Code constraints :

// In the given scenario, the test cases will fall under the following constraints:

// 1 ≤ The length of the name of a full-time employee ≤ 100 characters.

// 5000 ≤ The monthly salary of the full-time employee ≤ 1,000,00.

// 1 ≤ The length of the name of a part-time employee ≤ 100 characters.

// 50 ≤ The hourly rate of the part-time employee ≤ 1,000.

// 1 ≤ The number of hours worked by the part-time employee ≤ 2,000.
// Sample test cases :
// Input 1 :

// John Smith
// 15000
// Mary Johnson
// 100
// 100

// Output 1 :

// Full-Time Employee Details:
// Name: John Smith
// Monthly Salary: $15000
// Annual Salary: $180000

// Part-Time Employee Details:
// Name: Mary Johnson
// Hourly Rate: $100
// Hours Worked: 100 hours
// Monthly Salary: $10000

// Input 2 :

// Alice Johnson
// 22000
// Bob Smith
// 120
// 50

// Output 2 :

// Full-Time Employee Details:
// Name: Alice Johnson
// Monthly Salary: $22000
// Annual Salary: $264000

// Part-Time Employee Details:
// Name: Bob Smith
// Hourly Rate: $120
// Hours Worked: 50 hours
// Monthly Salary: $6000

// You are using Java

import java.util.Scanner;

interface Employee{
    void displayDetails();
}

class FullTimeEmployee implements Employee{
    String fullName;
    int fullTimeSalary;
    FullTimeEmployee(String fullName,int fullTimeSalary){
        this.fullName=fullName;
        this.fullTimeSalary=fullTimeSalary;
    }
    
    public void displayDetails(){
        System.out.println("Full-Time Employee Details:");
        System.out.println("Name: "+fullName);
        System.out.println("Monthly Salary: $"+fullTimeSalary);
        System.out.println("Annual Salary: $"+fullTimeSalary*12);
    }
    
}

class PartTimeEmployee implements Employee{
    String partTimeName;
    int hourlyRate;
    int hoursWorked;
    PartTimeEmployee(String partTimeName,int hourlyRate,int hoursWorked){
        this.partTimeName=partTimeName;
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }
    
    public void displayDetails(){
        System.out.println("Part-Time Employee Details:");
        System.out.println("Name: "+partTimeName);
        System.out.println("Hourly Rate: $"+hourlyRate);
        System.out.println("Hours Worked: "+hoursWorked+" hours");
        System.out.println("Monthly Salary: $"+hourlyRate*hoursWorked);
    }
}

public class REC_OOPS_using_Java_Week_7_PAH_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();
        int fullTimeSalary = scanner.nextInt();
        scanner.nextLine();
        String partTimeName = scanner.nextLine();
        int hourlyRate = scanner.nextInt();
        int hoursWorked = scanner.nextInt();
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(fullName, fullTimeSalary);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(partTimeName, hourlyRate, hoursWorked);
        fullTimeEmployee.displayDetails();
        System.out.println();
        partTimeEmployee.displayDetails();
        scanner.close();
    }
}
