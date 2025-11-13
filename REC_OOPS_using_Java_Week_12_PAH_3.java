
// Sneha is developing a feature for an e-commerce application that helps display product details after applying a seasonal discount.


// She decides to use lambda expressions with the Consumer functional interface to print each product’s name, original price, and discounted price neatly.


// The program should:

//     Accept a list of product names and their prices.
//     Apply a 15% discount on all products.
//     Use a Consumer lambda expression to display the details in a formatted manner.


// Input format :

// The first line of input consists of an integer n, representing the number of products.

// The next n lines each contain a String (product name) and a double (price) separated by a space.
// Output format :

// For each product, print the details in the format:

// Product: <name>, Original Price: <price>, Discounted Price: <discounted price>

// If there are no products, print:

// No products available


// Code constraints :

// 1 ≤ n ≤ 50

// 10.0 ≤ price ≤ 100000.0
// Sample test cases :
// Input 1 :

// 1
// Phone 60000

// Output 1 :

// Product: Phone, Original Price: 60000.0, Discounted Price: 51000.0

// Input 2 :

// 4
// Laptop 85000
// Headphones 2500
// Keyboard 1200
// Mouse 800

// Output 2 :

// Product: Laptop, Original Price: 85000.0, Discounted Price: 72250.0
// Product: Headphones, Original Price: 2500.0, Discounted Price: 2125.0
// Product: Keyboard, Original Price: 1200.0, Discounted Price: 1020.0
// Product: Mouse, Original Price: 800.0, Discounted Price: 680.0
// // 

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class REC_OOPS_using_Java_Week_12_PAH_3 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        List <String> name=new ArrayList<>();
        List<Double> price =new ArrayList<>();
        Consumer<Integer> printer=s->{
            System.out.printf("Product: %s, Original Price: %.1f, Discounted Price: %.1f\n",name.get(s),price.get(s),price.get(s)*0.85);
        };
        
        int n=scan.nextInt();
        
        if(n==0){
            System.out.print("No products available");
        }
        else{
            scan.nextLine();
        for(int i=0;i<n;i++){
            String str[]=scan.nextLine().split(" ");
            name.add(str[0]);
            price.add(Double.parseDouble(str[1]));
            printer.accept(i);
        }
        }
    }
}
