// Preethi is working on a project to automate sales tax calculations for items in a store. She wants to create a program that takes the price of an item and the sales tax rate as input and calculates the final price of the item after applying the sales tax.


// Write a program using the class SalesTaxCalculator, which contains an overloaded method named calculateFinalPrice to handle both integer and double inputs. The program should also include a Main class that takes user input, calls the appropriate method from SalesTaxCalculator, and prints the final price of the item.


// Formula Used: Final price = price + ((price * sales tax rate) / 100)
// Input format :

// The first line of input consists of an integer price (the price of the item for integer inputs).

// The second line of input consists of an integer taxRate (the sales tax rate for integer inputs).

// The third line of input consists of a double price (the price of the item for double inputs).

// The fourth line of input consists of a double taxRate (the sales tax rate for double inputs).
// Output format :

// The first line of output prints an integer, representing the final price of the item after applying the sales tax for integer inputs (a and b).

// The second line prints a double value, representing the final price of the item after applying the sales tax for double-value inputs (m and n), rounded to two decimal places.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 100 ≤ a ≤ 1000

// 1 ≤ b ≤ 20

// 100.0 ≤ m ≤ 1000.0

// 1.0 ≤ n ≤ 20.0
// Sample test cases :
// Input 1 :

// 100
// 10
// 100.0
// 5.0

// Output 1 :

// 110
// 105.00

// Input 2 :

// 200
// 15
// 205.0
// 8.5

// Output 2 :

// 230
// 222.43

import java.util.Scanner;

class SalesTaxCalculator{
   static int calculateFinalPrice(int price,int rate){
        return price+((price*rate)/100);
    }
    
 static   double calculateFinalPrice(double price,double rate){
        return price+((price*rate)/100);
    }
}


public class REC_OOPS_using_Java_Week_6_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intPrice = scanner.nextInt();
        int intTaxRate = scanner.nextInt();
        double doublePrice = scanner.nextDouble();
        double doubleTaxRate = scanner.nextDouble();

        int finalPriceInt = SalesTaxCalculator.calculateFinalPrice(intPrice, intTaxRate);
        double finalPriceDouble = SalesTaxCalculator.calculateFinalPrice(doublePrice, doubleTaxRate);

        System.out.println(finalPriceInt);
        System.out.format("%.2f", finalPriceDouble);
    }
}
