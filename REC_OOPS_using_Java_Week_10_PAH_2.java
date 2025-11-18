// A university maintains a list of student records and wants to store them in a sorted manner based on their GPA. If two students have the same GPA, they should be further sorted by their name in lexicographical order. Implement a program that uses a TreeSet to store student records and ensures unique student IDs.
// Input format :

// The first line contains an integer N - the number of students.

// The next N lines contain details of each student in the format: "StudentID Name GPA"

//     StudentID (Integer) - A unique identifier.
//     Name (String) - The student's name (can contain spaces).
//     GPA (Double) - The Grade Point Average.

// Output format :

// The output prints the list of students in ascending order of GPA.

// If two students have the same GPA, sort them by name.

// Print details in the format: "StudentID Name GPA" in the output, GPA is rounded to two decimal places.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ N ≤ 1000

// 1 ≤ ID ≤ 10⁶

// 1 ≤ length ≤ 100

// 0.0 ≤ GPA ≤ 10.0

// Student IDs are unique.

// GPA values can have up to two decimal places.

// Names contain only letters and spaces.
// Sample test cases :
// Input 1 :

// 5
// 101 John 8.5
// 102 Alice 9.1
// 103 Bob 8.5
// 104 Zoe 7.3
// 105 Charlie 9.1

// Output 1 :

// 104 Zoe 7.30
// 103 Bob 8.50
// 101 John 8.50
// 102 Alice 9.10
// 105 Charlie 9.10

// Input 2 :

// 4
// 201 Mike 7.5
// 202 Sarah 8.9
// 203 David 7.5
// 204 Ethan 9.0

// Output 2 :

// 203 David 7.50
// 201 Mike 7.50
// 202 Sarah 8.90
// 204 Ethan 9.00

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    int id;
    String name;
    double gpa;

    Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        int gpaCompare = Double.compare(this.gpa, other.gpa);
        if (gpaCompare != 0) {
            return gpaCompare;
        }
        
        int nameCompare = this.name.compareTo(other.name);
        if (nameCompare != 0) {
            return nameCompare;
        }
        
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", gpa);
    }
}


public class REC_OOPS_using_Java_Week_10_PAH_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Student> students = new TreeSet<>(); 

        int n = scan.nextInt();
        scan.nextLine(); 

        for (int i = 0; i < n; i++) {
            String line = scan.nextLine().trim();
            
            int lastSpace = line.lastIndexOf(' ');
            int firstSpace = line.indexOf(' ');

            int id = Integer.parseInt(line.substring(0, firstSpace));
            String name = line.substring(firstSpace + 1, lastSpace);
            double gpa = Double.parseDouble(line.substring(lastSpace + 1));

            students.add(new Student(id, name, gpa));
        }

        students.forEach(System.out::println);
    }    
}
