// Rishi is working as an HR analyst in a software company. He wants to filter a list of employees based on their salary using modern Java techniques. He has a list of employee names and salaries and wants to use lambda expressions to filter those who earn more than a specific threshold.


// Implement a program using lambda expressions and functional interfaces to print the names of employees whose salary is greater than or equal to 50,000.
// Input format :

// The first line of input consists of an integer n, representing the number of employees.

// The next n lines. Each line contains a String (employee name) and an int (salary).
// Output format :

// The output prints the names of employees whose salary is greater than or equal to 50000, each on a new line.

// If no employee found with salary greater than 50000, print: No employee found with salary >= 50000


// Refer to the sample output for formatting specifications.
// Code constraints :

// In this scenario, the test cases fall under the following constraints:

// 1 ≤ n ≤ 100

// 1 ≤ salary ≤ 1000000
// Sample test cases :
// Input 1 :

// 4
// Amit 45000
// Sneha 50000
// Ravi 60000
// Priya 30000

// Output 1 :

// Sneha
// Ravi

// Input 2 :

// 3
// Karan 30000
// Isha 42000
// Manoj 49999

// Output 2 :

// No employee found with salary >= 50000

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

@FunctionalInterface
interface charan{
    boolean sundar(int a);
}

public class REC_OOPS_using_Java_Week_12_PAH_2 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        
        Map<Integer,String> map=new LinkedHashMap<>();
        
        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            String str[]=scan.nextLine().split(" ");
            map.put(Integer.valueOf(str[1]),str[0]);
        }
        
        charan eee=(a)->a>=50000?true:false;
        int c[]={0};
        map.forEach((key,value)->{
            if(eee.sundar(key)){
            System.out.println(value);
            c[0]++;    
            }
        });
        if(c[0]==0)
        System.out.print("No employee found with salary >= 50000");
        
    }
}
