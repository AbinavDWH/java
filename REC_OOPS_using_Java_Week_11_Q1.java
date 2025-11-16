
// In Café Central, the menu is cataloged and stored in a database.


// To efficiently manage the restaurant's menu using Java and JDBC, you must build a Restaurant Management System that supports:

// Adding new menu items

// Updating menu item prices

// Viewing details of a menu item

// Displaying all menu items in sorted order

// You are given two files:

// File 1: MenuItem.java (POJO Class)


// This class represents the MenuItem entity.

// A MenuItem contains the following details:


// Field	Description

// itemId	Unique Menu Item ID (Integer)

// name	Item Name (String)

// category	Item Category (String)

// price	Item Price (Double)


// Students must write code in the marked area:

// class MenuItem {

//     private int itemId;

//     private String name;

//     private String category;

//     private double price;


//     public MenuItem() {}


//     public MenuItem(int itemId, String name, String category, double price) {

//         // write your code here

//     }


//     // Include getters and setters

// }



// Expected in this part:

// Assign parameter values to instance variables inside the constructor.

// Add getters and setters for all attributes.


// File 2: MenuItemDAO.java (Data Access Layer)

// This class handles all database operations using JDBC.

// Students must complete the missing JDBC logic in the following methods:


// class MenuItemDAO {


//     public void addMenuItem(Connection conn, MenuItem menuItem) throws SQLException {

//         // write your code here

//     }


//     public void updateItemPrice(Connection conn, int itemId, double newPrice) throws SQLException {

//         // write your code here

//     }


//     public void deleteMenuItem(Connection conn, int itemId) throws SQLException {

//         // write your code here

//     }


//     public MenuItem viewItemDetails(Connection conn, int itemId) throws SQLException {

//         // write your code here

//     }


//     public List<MenuItem> displayAllMenuItems(Connection conn) throws SQLException {

//         // write your code here

//     }


//     private MenuItem mapToMenuItem(ResultSet rs) throws SQLException {

//         return new MenuItem(

//             // write your code here

//         );

//     }

// }



// Expected in this part:


// Write SQL queries for INSERT, UPDATE, DELETE, SELECT.

// Execute queries using PreparedStatement or Statement.

// Map ResultSet rows to MenuItem objects using mapToMenuItem().

// Return a List<MenuItem> where required.

// The system should connect to a MySQL database using the following default credentials:


// DB URL: jdbc:mysql://localhost/ri_db

// USER: test

// PWD: test123


// The menu table has already been created with the following structure:

// Table Name:  menu

// Input format :

// The first line of input consists of an integer choice, representing the operation to be performed (1 for Add Item, 2 for Restock item, 3 for reduce item, 4 for Display, 5 for Exit).

// For choice 1 (Add Menu Item):

//     The second line consists of an integer item_id.
//     The third line consists of a string name.
//     The fourth line consists of a string category.
//     The fifth line consists of a double price.

// For choice 2 (Update Item Price):

//     The second line consists of an integer item_id.
//     The third line consists of a double new_price.

// For choice 3 (View Item Details):

//     The second line consists of an integer item_id.

// For choice 4 (Display All Menu Items):

//     No additional inputs are required.

// For choice 5 (Exit):

//     No additional inputs are required.


// Output format :

// For choice 1 (Add Menu Item):

//     Print "Menu item added successfully" if the item was added.
//     Print "Failed to add item." if the insertion failed.

// For choice 2 (Update Item Price):

//     Print "Item price updated successfully" if the price update was successful.
//     Print "Item not found." if the specified item ID does not exist.

// For choice 3 (View Item Details):

//     Display the item details in the format:
//     ID: [item_id] | Name: [name] | Category: [category] | Price: [price]
//     Print "Item not found." if the specified item ID does not exist.

// For choice 4 (Display All Menu Items):

//     Display each item on a new line in the format:
//     ID | Name | Category | Price
//     If no items are available, print nothing (or handle with an appropriate message if desired).

// For choice 5 (Exit):

//     Print "Exiting Restaurant Management System."

// For invalid input:

//     Print "Invalid choice. Please try again."


// Sample test cases :
// Input 1 :

// 1
// 11
// Margherita Pizza
// Main Course
// 12.99
// 4
// 5

// Output 1 :

// Menu item added successfully
// ID | Name | Category       | Price
// 11 | Margherita Pizza | Main Course | 12.99
// Exiting Restaurant Management System.

// Input 2 :

// 1
// 11
// Margherita Pizza
// Main Course
// 12.99
// 2
// 11
// 14.99
// 4
// 5

// Output 2 :

// Menu item added successfully
// Item price updated successfully
// ID | Name | Category       | Price
// 11 | Margherita Pizza | Main Course | 14.99
// Exiting Restaurant Management System.

// Input 3 :

// 1
// 11
// Margherita Pizza
// Main Course
// 12.99
// 1
// 12
// BURGER
// chat
// 50
// 2
// 11
// 14.99
// 3
// 11
// 4
// 5

// Output 3 :

// Menu item added successfully
// Menu item added successfully
// Item price updated successfully
// ID: 11 | Name: Margherita Pizza | Category: Main Course | Price: 14.99
// ID | Name | Category       | Price
// 11 | Margherita Pizza | Main Course | 14.99
// 12 | BURGER | chat | 50.00
// Exiting Restaurant Management System.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_11_Q1 {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db", "test", "test123");
             Scanner scanner = new Scanner(System.in)) {

            boolean running = true;

            while (running) {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addMenuItem(conn, scanner);
                        break;
                    case 2:
                        updateItemPrice(conn, scanner);
                        break;
                    case 3:
                        viewItemDetails(conn, scanner);
                        break;
                    case 4:
                        displayAllMenuItems(conn);
                        break;
                    case 5:
                        System.out.println("Exiting Restaurant Management System.");
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
    public static void addMenuItem(Connection conn, Scanner scanner) {
     //Write your code here   
        int item_id=scanner.nextInt();
        scanner.nextLine();
        String name =scanner.nextLine();
        String cat=scanner.nextLine();
        double price=scanner.nextDouble();
        
        String sql="INSERT into menu (item_id,name,category,price) values (?,?,?,?)";
        try(PreparedStatement stat=conn.prepareStatement(sql)){
            stat.setInt(1,item_id);
            stat.setString(2,name);
            stat.setString(3,cat);
            stat.setDouble(4,price);
            
            stat.executeUpdate();
            
            System.out.println("Menu item added successfully");
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        
    }

    public static void updateItemPrice(Connection conn, Scanner scanner) {
        //Write your code here
        
        int id=scanner.nextInt();
        double price=scanner.nextDouble();
        String sql="update menu set price=? where item_id=?";
        try(PreparedStatement stat=conn.prepareStatement(sql)){
            stat.setDouble(1,price);
            stat.setInt(2,id);
            
            int rowa=stat.executeUpdate();
            if(rowa>0){
                System.out.println("Item price updated successfully");
            }
            else
            System.out.println("Item not found");
        }
         catch(Exception e){
            System.out.print(e.getMessage());
        }
    }

    public static void viewItemDetails(Connection conn, Scanner scanner) {
        // Write your code here
        int n=scanner.nextInt();
        String sql="Select * from menu";
        
        try(PreparedStatement stat=conn.prepareStatement(sql)){
        
            ResultSet rs=stat.executeQuery();
            // System.out.println("ID | Name | Category    | Price");
            if(rs.next()){
            
                    int id=rs.getInt("item_id");
                    String name=rs.getString("name");
                    String cat=rs.getString("category");
                    double price=rs.getDouble("price");
                    System.out.printf("ID: %d | Name: %s | Category: %s | Price: %.2f\n",id,name,cat,price);
                
            }
        }
         catch(Exception e){
            System.out.print(e.getMessage());
        }
       
    }

    public static void displayAllMenuItems(Connection conn) {
        //Write your code here
         String sql="Select * from menu";
            
            try(PreparedStatement stat=conn.prepareStatement(sql)){
            
                ResultSet rs=stat.executeQuery();
                System.out.println("ID | Name | Category | Price");
                if(rs.next()){
                    do{
                        int id=rs.getInt("item_id");
                        String name=rs.getString("name");
                        String cat=rs.getString("category");
                        double price=rs.getDouble("price");
                        System.out.printf("%d | %s | %s | %.2f\n",id,name,cat,price);
                    }while(rs.next());
                }
            }
             catch(Exception e){
                System.out.print(e.getMessage());
            }
     
   }
}

class MenuItem {
    private int itemId;
    private String name;
    private String category;
    private double price;

    // Constructor
    public MenuItem(int itemId, String name, String category, double price) {
        this.itemId = itemId;
        this.name = name;
        this.category = category;
        this.price = price;
    }

  //Include getters and setters
}
