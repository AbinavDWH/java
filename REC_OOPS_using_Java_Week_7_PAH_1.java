// Oviya is fascinated by automorphic numbers and wants to create a program to determine whether a given number is an automorphic number or not.


// An automorphic number is a number whose square ends with the same digits as the number itself. For example, 25 = (25)2 = 625 


// Oviya has defined two interfaces: NumberInput for taking user input and AutomorphicChecker for checking if a given number is automorphic. The class AutomorphicNumber implements both interfaces.


// Help her complete the task.
// Input format :

// The input consists of a single integer n.
// Output format :

// If the input number is an automorphic number, print "n is an automorphic number". Otherwise, print "n is not an automorphic number".


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following specifications:

// 1 ≤ n ≤ 500
// Sample test cases :
// Input 1 :

// 25

// Output 1 :

// 25 is an automorphic number

// Input 2 :

// 7

// Output 2 :

// 7 is not an automorphic number

// You are using Java

import java.util.Scanner;

interface NumberInput{
    int getInput();
}

interface AutomorphicChecker{
    boolean checkAutomorphic(int inputNumber);
}

class  AutomorphicNumber implements NumberInput,AutomorphicChecker{
    Scanner scan=new Scanner(System.in);
    public int getInput(){
        return scan.nextInt();
    }
    
    public boolean checkAutomorphic(int inputNumber){
        String str=String.valueOf(inputNumber);
        return inputNumber==(inputNumber*inputNumber)%(int)(float)Math.pow(10,str.length());
    }
    
}





public class REC_OOPS_using_Java_Week_7_PAH_1 {
    public static void main(String[] args) {
        AutomorphicNumber automorphicNumber = new AutomorphicNumber();
        int inputNumber = automorphicNumber.getInput();

        boolean isAutomorphic = automorphicNumber.checkAutomorphic(inputNumber);

        if (isAutomorphic) {
            System.out.println(inputNumber+" is an automorphic number");
        } else {
            System.out.println(inputNumber+" is not an automorphic number");
        }
    }
}
