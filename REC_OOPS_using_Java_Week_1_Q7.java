
// Miles is working on a program that involves analyzing two integers. He wants to check if either one of the integers is both:

//     Less than or equal to zero, and
//     Odd.

// Can you help him create a program that identifies whether either of the integers meets these conditions?
// Input format :

// The input consists of two integers on separate lines, denoted as 'input1' and 'input2'.
// Output format :

// A single line with a boolean result (either 'true' or 'false') indicating whether either 'input1' or 'input2' is both less than or equal to zero and odd.


// Refer to the sample output for format specifications
// Code constraints :

// -10000 <= input1, input2 <= 10000
// Sample test cases :
// Input 1 :

// -45
// 10

// Output 1 :

// Miles is working on a program that involves analyzing two integers. He wants to check if either one of the integers is both:

//     Less than or equal to zero, and
//     Odd.

// Can you help him create a program that identifies whether either of the integers meets these conditions?
// Input format :

// The input consists of two integers on separate lines, denoted as 'input1' and 'input2'.
// Output format :

// A single line with a boolean result (either 'true' or 'false') indicating whether either 'input1' or 'input2' is both less than or equal to zero and odd.


// Refer to the sample output for format specifications
// Code constraints :

// -10000 <= input1, input2 <= 10000
// Sample test cases :
// Input 1 :

// -45
// 10

// Output 1 :

// true

// Input 2 :

// 15
// 345

// Output 2 :

// false

// Input 3 :

// -236
// -568

// Output 3 :

// false

// true

// Input 2 :

// 15
// 345

// Output 2 :

// false

// Input 3 :

// -236
// -568

// Output 3 :

// false

import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_Q7 {
    static boolean che(int n) {
        return n<=0&&n%2!=0;
    }
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt(),n2=scan.nextInt();
        System.out.print(che(n1)||che(n2));
    }
}
