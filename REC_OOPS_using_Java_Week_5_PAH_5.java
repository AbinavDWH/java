// // Anjali is working as a developer for CityFitness Gym, which wants to build a system to calculate monthly membership fees for gym members based on the type of membership and the number of personal training sessions booked.


// Each member’s record has:


//     Member ID (integer)
//     Member Name (string)
//     Membership Type (string: "Basic", "Premium", "Elite")
//     Number of Personal Training Sessions (integer)


// The monthly fees are:


//     Basic – 1000 units
//     Premium – 1500 units
//     Elite – 2000 units


// The cost of personal training sessions is 500 units per session.


// The calculation rules:


//     Total Amount = Membership Fee + (Number of Personal Training Sessions × 500)
//     If the number of sessions is more than 5, a 10% discount is applied on the total amount.
//     If the member has Elite membership and the total amount exceeds 4000, an additional 5% service tax is added after discount.


// Anjali has been asked to implement this system using:


//     A class with attributes for member details.
//     A constructor to initialize member details.
//     Getter and Setter methods to retrieve and update member details if required.
//     A method to calculate the final monthly fee.
//     Objects of the class to represent members.


// Finally, display each member’s details and the final monthly fee.
// Input format :

// The first line contains an integer N, representing the number of members.

// For each member:

//     Next line contains Member ID (integer)
//     Next line contains Member Name (string)
//     Next line contains Membership Type ("Basic", "Premium", "Elite")
//     Next line contains Number of Personal Training Sessions (integer)

// Output format :

// For each member, print:

//     Member ID: <member_id>
//     Member Name: <member_name>
//     Final Monthly Fee: <final_fee> (The final fee must be rounded to one decimal place)


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 100

// 1000 ≤ Member ID ≤ 9999

// Member Name should not be empty

// Number of Personal Training Sessions ≥ 0

// Membership Type must be one of the given types
// Sample test cases :
// Input 1 :

// 1
// 1001
// Ravi Kumar
// Basic
// 3

// Output 1 :

// Member ID: 1001
// Member Name: Ravi Kumar
// Final Monthly Fee: 2500.0

// Input 2 :

// 2
// 1010
// Amit Verma
// Premium
// 4
// 1011
// Sakshi Gupta
// Elite
// 6

// Output 2 :

// Member ID: 1010
// Member Name: Amit Verma
// Final Monthly Fee: 3500.0
// Member ID: 1011
// Member Name: Sakshi Gupta
// Final Monthly Fee: 4725.0

import java.util.Scanner;

class mem_ship{
    int m_id,no_s;
    String name,m_t;
        
    mem_ship(int m_id,int no_s,String name,String m_t){
        this.m_id=m_id;
        this.no_s=no_s;
        this.name=name;
        this.m_t=m_t;
    }
    
    void fee(){
        int n=0;
        int m_fee[]={1000,1500,2000};
        for(int i=0;i<3;i++){
            if(m_t.equals(REC_OOPS_using_Java_Week_5_PAH_5.str[i]))
            {
                n=i;
                break;
            }
        }
        double total_fee=m_fee[n]+no_s*500;
        if(no_s>5){
            total_fee*=0.9;
        }
        if(n==2&&total_fee>4000){
            total_fee*=1.05;
        }
        System.out.println("Member ID: "+m_id);
        System.out.println("Member Name: "+name);
        System.out.printf("Final Monthly Fee: %.1f\n",total_fee);
    }
}



public class REC_OOPS_using_Java_Week_5_PAH_5 {
    static String str[]={"Basic","Premium","Elite"};
    
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int id=scan.nextInt();
            scan.nextLine();
            String name=scan.nextLine();
            String std=scan.nextLine();;
            int no_s=scan.nextInt();
            var obj=new mem_ship(id,no_s,name,std);
            obj.fee();
        }
    }    
}
