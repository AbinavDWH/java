
// Raj is curious about how old he is in the current year. 


// He has asked you to create a simple program that calculates a person's age based on their birth year. You decide to implement this functionality using the AgeCalculator interface and the HumanAgeCalculator class.


// Note: The current year is 2024. Calculate the current age by using the formula: current year - birth year.
// Input format :

// The input consists of an integer representing the birth year.
// Output format :

// The output displays "You are X years old." where X is an integer representing the calculated age based on the entered birth year.


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following specifications:

// 1900 ≤ birth year ≤ 2022


// You are using Java

import java.util.Scanner;

interface AgeCalculator{
   int calculateAge(int birthYear);
}

class HumanAgeCalculator  implements AgeCalculator{
    public int calculateAge(int birthYear){
        return 2024-birthYear;
    }   
}


public class REC_OOPS_using_Java_Week_7_Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        AgeCalculator ageCalculator = new HumanAgeCalculator();
        
        int birthYear = scanner.nextInt();
        int age = ageCalculator.calculateAge(birthYear);
        
        System.out.println("You are " + age + " years old.");
    }
}
