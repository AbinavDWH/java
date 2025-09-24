// Tim was tasked with developing a grocery shopping app. You have a class hierarchy that includes Item, Produce, and OrganicProduce. Your goal is to calculate the total cost of a shopping list, which may contain a mix of regular produce and organic produce items. Additionally, you need to apply discounts to organic items. Apply a 10% discount on organic produce items


// Class Hierarchy:

// Item: Base class for all items.

// Produce: Subclass of Item for regular produce items.

// OrganicProduce: Subclass of Produce for organic produce items.


// Input format :

// The first line of input consists of an integer, 'n'.

// For each 'n' item, the user will provide:

//     A string 'type' representing the item type ('Regular' or 'Organic').
//     A string 'name' represents the item name.
//     A double 'price' represents the item price.

// Output format :

// The output will display the total cost of the shopping list, including discounts on organic items.


// Refer to the sample output for format specifications.
// Code constraints :

// 1 <= n <= 100 (number of items)

// 0.01 <= price <= 100.0 (item price)
// Sample test cases :
// Input 1 :

// 1
// Regular Banana 1.99

// Output 1 :

// 1.99

// Input 2 :

// 3
// Regular Carrot 0.99
// Organic Kale 2.75
// Organic Orange 1.89

// Output 2 :

// 5.17

import java.util.Scanner;

class OrganicProduce extends Produce{
    OrganicProduce(String name,double price){
        super(name,price);
    }
    
    double calculateCost(){
        return price*0.9;
    }
}

class Produce extends Item{
    Produce(String name,double price){
       super(name,price);
    }
    
    double calculateCost(){
        return price;
    }
    
}

class Item {
    String name;
    double price;
    
    Item(String name,double price){
        this.name=name;
        this.price=price;
    }
    
    double calculateCost(){
        return price;
    }
}


public class REC_OOPS_using_Java_Week_6_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        double totalCost = 0.0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double price = sc.nextDouble();

            if (type.equals("Regular")) {
                Item item = new Produce(name, price);
                totalCost += item.calculateCost();
            } else if (type.equals("Organic")) {
                Item item = new OrganicProduce(name, price);
                totalCost += item.calculateCost();
            }
        }

        System.out.printf("%.2f%n", totalCost);
    }   
}
