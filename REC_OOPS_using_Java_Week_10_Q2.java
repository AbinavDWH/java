
// ﻿John is organizing a fruit festival, and the quantities of various fruits are stored in a HashMap where fruit names are keys and quantities are values. 


// Help him develop a program to find the total quantity of fruits for the festival by summing up the values in the HashMap. 
// Input format :

// The input consists of fruit quantities in the format 'fruitName:quantity', where fruitName is the name of the fruit(a string), and quantity is a double value representing the quantity.

// The input is terminated by entering "done".
// Output format :

// The output prints a double value, representing the sum of values in the HashMap, rounded off to two decimal places.

// If the value is not numeric, print "Invalid input".

// If any special characters other than ':' are entered, print "Invalid format".


// Refer to the sample output for formatting specifications.
// Code constraints :

// 1 ≤ Length of the String ≤ 20

// 1.0 ≤ quantity ≤ 100.0
// Sample test cases :
// Input 1 :

// Banana:15.2
// Orange:56.3
// Mango:47.3
// done

// Output 1 :

// 118.80

// Input 2 :

// Papaya:25.8
// Muskmelon:34.9
// Grapes:98.1
// Cherry:34.7
// done

// Output 2 :

// 193.50

// Input 3 :

// Banana:w
// Strawberry:s
// done

// Output 3 :

// Invalid input

// Input 4 :

// Guava-12.6
// Kiwi-96.2
// Blueberry-85.1
// done

// Output 4 :

// Invalid format

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class REC_OOPS_using_Java_Week_10_Q2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        
        Map<String,Double> map=new HashMap<>();
        
        String s=scan.nextLine();
        double t[]={0};
        try{
            while(!s.equals("done")){
                
                if(Pattern.compile("[^A-Za-z0-9:.]").matcher(s).find()){
                    throw new Exception("Invalid Format");
                }
                String str[]=s.split(":");
                map.put(str[0],Double.parseDouble(str[1]));
                s=scan.nextLine();
                
                
                 
            }
            map.forEach((key,value)-> t[0]+=value   );
             System.out.printf("%.2f",t[0]);
        }
        
        catch (NumberFormatException e){
            System.out.print("Invalid input");
        }
        
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }    
}
