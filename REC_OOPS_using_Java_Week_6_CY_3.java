// Arun wants to calculate the age gap between the grandfather and the son and determine the father's age after 5 years. 


// Your task is to assist him in developing a program using three classes: GrandFather, Father, and Son, where the GrandFather stores the grandfather's age, the Father extends GrandFather to include the father's age and calculates his age after 5 years, and Son extends Father to include the son's age and calculate the age difference between the grandfather and the son.
// Input format :

// The input consists of three integers representing the ages of the grandfather, father, and son, one per line.
// Output format :

// The first line of output prints "Grandfather and son's age gap:" followed by an integer representing the age gap between the grandfather and the son, ending with "years".

// The second line prints "Father's Age:" followed by an integer representing the father's age after 5 years, ending with "years".


// Refer to the sample output for formatting specifications.
// Code constraints :

// 50 ≤ Grandfather's age ≤ 120

// 30 ≤ Father's age ≤ 90

// 1 ≤ Son's age ≤ 60
// Sample test cases :
// Input 1 :

// 50
// 30
// 3

// Output 1 :

// Grandfather and son's age gap: 47 years
// Father's Age: 35 years

// Input 2 :

// 80
// 45
// 25

// Output 2 :

// Grandfather and son's age gap: 55 years
// Father's Age: 50 years

// Input 3 :

// 120
// 90
// 60

// Output 3 :

// Grandfather and son's age gap: 60 years
// Father's Age: 95 years

import java.util.Scanner;

class GrandFather{
    int grandfatherAge;
    
    
    void setGrandfatherAge(int grandfatherAge){
        this.grandfatherAge=grandfatherAge;
    }
}

class Father extends GrandFather{
    int fatherAge;
    
    
    void setFatherAge(int fatherAge){
        this.fatherAge=fatherAge;
    }
    
    int calculateFatherAgeAfter5Years(){
        return fatherAge+5;
    }
} 

class Son extends Father{
    int sonAge;
    
    void setSonAge(int sonAge){
        this.sonAge=sonAge;
    }
    
    int calculateGrandfatherSonAgeDifference(){
        return grandfatherAge-sonAge;
    }
}

public class REC_OOPS_using_Java_Week_6_CY_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Son son = new Son();

        int grandfatherAge = scanner.nextInt();
        son.setGrandfatherAge(grandfatherAge);

        int fatherAge = scanner.nextInt();
        son.setFatherAge(fatherAge);

        int sonAge = scanner.nextInt();
        son.setSonAge(sonAge);

        System.out.println("Grandfather and son's age gap: "+ son.calculateGrandfatherSonAgeDifference() + " years");

        int fatherAgeAfter5Years = son.calculateFatherAgeAfter5Years();
        System.out.println("Father's Age: " + fatherAgeAfter5Years + " years");
    }   
}
