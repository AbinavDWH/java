// Create a JDBC-based School Management System that handles runtime input to manage student records. The system should allow users to:


// Add a new student (student ID, name, grade level, GPA).

// Update a student's GPA, ensuring the GPA value is within the valid range (0.0 - 4.0).

// View a specific student’s record by student ID.

// Display all students in the database.

// Exit the application.


// The system should connect to a MySQL database using the following default credentials:


// DB URL: jdbc:mysql://localhost/ri_db

// USER: test

// PWD: test123


// The students table has already been created with the following structure:


// Table Name: students

// Input format :

// The first line of input consists of an integer choice, representing the operation to be performed:

// (1 for Add Student, 2 for Update GPA, 3 for View Student Record, 4 for Display All Students, 5 for Exit)

// For choice 1 (Add Student):

//     The second line consists of an integer student_id.
//     The third line consists of a string name.
//     The fourth line consists of a string grade_level.
//     The fifth line consists of a double gpa (must be between 0.0 and 4.0).

// For choice 2 (Update GPA):

//     The second line consists of an integer student_id.
//     The third line consists of a double new_gpa (must be between 0.0 and 4.0).

// For choice 3 (View Student Record):

//     The second line consists of an integer student_id.

// For choice 4 (Display All Students):

//     No additional inputs are required.

// For choice 5 (Exit):

//     No additional inputs are required.

// Output format :

// The output displays:

// For choice 1 (Add Student):

//     Print "Student added successfully" if the student was added.
//     Print "Failed to add student." if the insertion failed.

// For choice 2 (Update GPA):

//     Print "GPA updated successfully" if the GPA update was successful.
//     Print "Student not found." if the specified student ID does not exist.
//     Print "GPA must be between 0.0 and 4.0." if the provided GPA is out of the valid range.

// For choice 3 (View Student Record):

//     Display the student details in the format:
//     ID: [student_id] | Name: [name] | Grade Level: [grade_level] | GPA: [gpa]
//     Print "Student not found." if the specified student ID does not exist.

// For choice 4 (Display All Students):

//     Display each student on a new line in the format:
//     ID | Name | Grade Level | GPA
//     If there are no records, print nothing (or handle with an appropriate message if desired).

// For choice 5 (Exit):

//     Print "Exiting School Management System."

// For invalid input:

//     Print "Invalid choice. Please try again."


// Sample test cases :
// Input 1 :

// 1
// 101
// Alice Johnson
// 10
// 3.8
// 5

// Output 1 :

// Student added successfully
// Exiting School Management System.

// Input 2 :

// 1
// 101
// Alice Johnson
// 10
// 3.8
// 4
// 5

// Output 2 :

// Student added successfully
// ID | Name | Grade Level | GPA
// 101 | Alice Johnson | 10 | 3.80
// Exiting School Management System.

// Input 3 :

// 1
// 15
// Johnson
// 10
// 3.8
// 2
// 15
// 4.0
// 4
// 5

// Output 3 :

// Student added successfully
// GPA updated successfully
// ID | Name | Grade Level | GPA
// 15 | Johnson | 10 | 4.00
// Exiting School Management System.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_11_Q2 {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
             Scanner scanner = new Scanner(System.in)) {

            boolean running = true;

            while (running) {
                
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addStudent(conn, scanner);
                        break;
                    case 2:
                        updateGrades(conn, scanner);
                        break;
                    case 3:
                        viewStudentRecord(conn, scanner);
                        break;
                    case 4:
                        displayAllStudents(conn);
                        break;
                    case 5:
                        System.out.println("Exiting School Management System.");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void addStudent(Connection conn, Scanner scanner) {
         // write your code here
         int id=scanner.nextInt();
         scanner.nextLine();
        String name=scanner.nextLine();
        String g_l=scanner.nextLine();
        double gpa=scanner.nextDouble();
        String sql="insert into students values (?,?,?,?)";
         try(PreparedStatement stat=conn.prepareStatement(sql)){
             stat.setInt(1,id);
             stat.setString(2,name);
             stat.setString(3,g_l);
             stat.setDouble(4,gpa);
             
             stat.executeUpdate();
             System.out.println("Student added successfully");
         }
         catch (Exception e){
             System.out.print(e.getMessage());
         }
    }

    public static void updateGrades(Connection conn, Scanner scanner) {
        // write your code here
        int id=scanner.nextInt();
        double gpa=scanner.nextDouble();
        if(gpa<0||gpa>4){
            System.out.println("GPA must be between 0.0 and 4.0.");
            return;
        }
        
        String sql="update students set gpa=? where student_id=?";
        
        try(PreparedStatement stat=conn.prepareStatement(sql)){
             stat.setDouble(1,gpa);
                          stat.setInt(2,id);

             int r=stat.executeUpdate();
             if(r>0)
             System.out.println("GPA updated successfully");
             else{
                 System.out.print("Student not found.");
             }
        }
        catch(Exception e){
            System.out.print("Student not found.");

        }
    }

    public static void viewStudentRecord(Connection conn, Scanner scanner) {
        // write your code here
        String sql="select * from students where student_id=?";
        int id=scanner.nextInt();
        try(PreparedStatement stat=conn.prepareStatement(sql)){
            stat.setInt(1,id);
            ResultSet rs=stat.executeQuery();
            if(rs.next())
                System.out.printf("ID: %d | Name: %s | Grade Level: %s | GPA: %.2f\n",rs.getInt("student_id"),rs.getString("name"),rs.getString("grade_level"),rs.getDouble("gpa"));
            else{
                System.out.println("Student not found.");
            }
        }
        catch(Exception e){
                         System.out.print(e.getMessage());

        }
    }

    public static void displayAllStudents(Connection conn) {
        // write your code here
        System.out.println("ID | Name | Grade Level | GPA");
        String sql="Select * from students";
        
        try(PreparedStatement stat=conn.prepareStatement(sql)){
            ResultSet rs=stat.executeQuery();
            if(rs.next()){
                do{
                    System.out.printf("%d | %s | %s | %.2f\n",rs.getInt("student_id"),rs.getString("name"),rs.getString("grade_level"),rs.getDouble("gpa"));
                }while(rs.next());
            }
        }
        catch(Exception e){
                         System.out.print(e.getMessage());

        }
    }
}
