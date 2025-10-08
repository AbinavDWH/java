// Maria, a software developer, is working on an inventory management system project using Java that utilizes an inventory interface to manage a store's products. 


// The interface should define two methods: addProduct, which adds a product by accepting its name, price, and quantity, and calculateTotalValue, which computes the total value of all products in the inventory. Implement the interface in a class called SimpleInventory, which internally manages a list of Product objects. 


// Each Product object should encapsulate the product's name, price, and quantity and include a method to calculate its value as price × quantity. The system should allow users to dynamically add products to the inventory and calculate the total value of all products stored. 


// Help Maria achieve the task.
// Input format :

// The first line of input consists of an integer to choose one of the following options:

// 1 - to add a product to the inventory.

// 2 - to calculate and view the total inventory value.

// 3 - to exit the program.

// For Choice 1 (Add Product):

// The next input line is the string representing the product name as a string (single or multi-word, without quotes).

// The next line is a double value representing the price as a decimal value

// The next line is an integer value representing the quantity as an integer

// For Choices 2 and 3, no additional input is required
// Output format :

// The output displays the results of the commands as follows:

//     For the addProduct command, the program should display "Product added to inventory."
//     For choice 2, the program should display "Total inventory value [totalvalue]. "The total value should be displayed with one decimal place. If there is no product in the inventory, print the total as 0.0.
//     For choice 3, the program should exit

// If the choice is not 1, 2, or 3, then print "Invalid choice. Please select a valid option (1/2/3).".


// Refer to the sample output for the formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// The length of the product name will be at most 20 characters.

// The product name can contain lowercase or uppercase letters.
// Sample test cases :
// Input 1 :

// 1
// Laptop
// 800.0
// 3
// 2
// 5
// 3

// Output 1 :

// Product added to inventory.
// Total inventory value: $2400.0
// Invalid choice. Please select a valid option (1/2/3).

// Input 2 :

// 2
// 1
// Laptop
// 800.0
// 5
// 1
// Smartphone
// 400.0
// 10
// 2
// 3

// Output 2 :

// Total inventory value: $0.0
// Product added to inventory.
// Product added to inventory.
// Total inventory value: $8000.0


// You are using Java

import java.util.Scanner;

interface   Inventory {
    void addProduct(String productName,double price,int quantity);
    double calculateTotalValue();
}
//  static double to=0;
class SimpleInventory  implements Inventory{
    int n;
    SimpleInventory(int n){
        this.n=n;
    }
    static double to=0;
    
    String productName;
    double price;
    int quantity;
    
    public void addProduct(String productName,double price,int quantity){
        this.productName=productName;
        this.price=price;
        this.quantity= quantity;
        System.out.println("Product added to inventory.");
        to+=price*quantity;
    }
    
    public double calculateTotalValue(){
       
       return to;
    }
}


public class REC_OOPS_using_Java_Week_7_Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new SimpleInventory(10); 
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                scanner.nextLine(); 
                String productName = scanner.nextLine();
                double price = scanner.nextDouble();
                int quantity = scanner.nextInt();
                inventory.addProduct(productName, price, quantity);
            } else if (choice == 2) {
                double totalValue = inventory.calculateTotalValue();
                System.out.println("Total inventory value: $" + totalValue);
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option (1/2/3).");
            }
        }
        scanner.close();
    }
}
