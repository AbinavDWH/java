// "Write a program that helps identify the type of a triangle based on the lengths of its three sides. The program prompts the user to input the lengths of sides 'a,' 'b,' and 'c,' and then it classifies the triangle as 'Equilateral' if all sides are equal, 'Isosceles' if two sides are equal, or 'Scalene' if all sides are different. Can you provide the Java code for this task?"
// Input format :

// The first line of the input is an integer 'a' representing the length of side 'a.'

// The second line of the input is an integer 'b' representing the length of side 'b.'

// The third line of the input is an integer 'c' representing the length of side 'c.'
// Output format :

// The program outputs a single line that specifies the type of the triangle: "Equilateral," "Isosceles," or "Scalene."
// Code constraints :

// 1<=a<=100

// 1<=b<=100

// 1<=c<=100


// Note: Refer to the sample output for the specification.
// Sample test cases :
// Input 1 :

// 3
// 4
// 5

// Output 1 :

// The triangle is Scalene

// Input 2 :

// 6
// 6
// 8

// Output 2 :

// The triangle is Isosceles

// Input 3 :

// 5
// 12
// 13

// Output 3 :

// The triangle is Scalene

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_CY_3 {
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt();
        String s;
        if(a==b && a==c && b==c){
            s="Equilateral";
        }
        else if(a==b||b==c||a==c)
        s="Isosceles";
        else
        s="Scalene";
        System.out.print("The triangle is "+s);
    }
}
