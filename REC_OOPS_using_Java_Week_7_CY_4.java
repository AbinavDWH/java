// Maria, an online store owner, is looking to implement a pricing system that calculates the final price of products after applying discounts. She needs a program that takes the original price of a product and the discount percentage as input and computes the final discounted price. The discount is applied as a percentage of the original price. Maria wants to ensure that the final price is formatted to display exactly two decimal places.


// Implement this functionality using the PriceCalculator interface and the DiscountCalculator class.
// Input format :

// The first line of input consists of the original price (a double value).

// The second line of input consists of a discount percentage (a double value).
// Output format :

// The output displays the final price after the discount, adhering to the following format: "Final Price after discount: $[final_price]".

// Here, [final_price] should be replaced with the calculated final price, formatted as a currency value with two decimal places.


// Refer to the sample output for the formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// The original price will be a double value.

// The discount percentage will be a double value.

// The original price will be between 1.00 and 10,000.00, inclusive.

// The discount percentage will be between 0% and 90%, inclusive.
// Sample test cases :
// Input 1 :

// 100.0
// 10.0

// Output 1 :

// Final Price after discount: $90.00

// Input 2 :

// 150.5
// 15.5

// Output 2 :

// Final Price after discount: $127.17

// You are using Java

import java.util.Scanner;

interface PriceCalculator{
    double calculatePrice(double originalPrice,double discount);
}

class DiscountCalculator implements  PriceCalculator{
    public double calculatePrice(double originalPrice,double discount){
        if( originalPrice<10000 &&  originalPrice>1 && discount>0 && discount<90){
            return originalPrice*(1-discount/100);
        }
        return originalPrice;
    }
}


public class REC_OOPS_using_Java_Week_7_CY_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double originalPrice = scanner.nextDouble();
        double discount = scanner.nextDouble();
        PriceCalculator calculator = new DiscountCalculator();
        double finalPrice = calculator.calculatePrice(originalPrice, discount);
        System.out.printf("Final Price after discount: $%.2f%n", finalPrice); // Formats output to 2 decimal places
    }
}
