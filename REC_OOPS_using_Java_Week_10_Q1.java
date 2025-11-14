
// A city traffic management system needs to track vehicles entering a toll booth. Each vehicle is uniquely identified by its registration number. The system should allow adding vehicles to a record, ensuring that no duplicate registration numbers exist. The vehicles should be stored in a HashSet, which does not guarantee any specific order.


// Your task is to implement a program using a HashSet that allows adding vehicle details and displaying the records.
// Input format :

// The first line of input contains an integer N - the number of vehicles.

// The next N lines contain details of each vehicle in the format: "RegNumber OwnerName VehicleType"

//     RegNumber (String) - A unique registration number (Alphanumeric).
//     OwnerName (String) - The name of the vehicle owner.
//     VehicleType (String, Car, Bike, or Truck) - The type of vehicle.

// If a vehicle with the same registration number is already present, ignore the duplicate entry.
// Output format :

// The output prints the unique vehicle records in any order (since HashSet does not maintain order).

// Output format: "RegNumber OwnerName VehicleType"


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given test cases fall under the following constraints:

// 1 ≤ N ≤ 10

// 1 ≤ ID ≤ 10000

// 6 ≤ RegNumber length ≤ 10

// 1 ≤ OwnerName length ≤ 100

// RegNumber consists of alphanumeric characters and is unique.

// VehicleType is always either Car, Bike, or Truck.

// Duplicate registration numbers should be ignored.
// Sample test cases :
// Input 1 :

// 5
// KA01AB1234 John Car
// MH02CD5678 Alice Bike
// DL03EF9012 Bob Truck
// TN04GH3456 Mike Car
// KA01AB1234 John Car

// Output 1 :

// TN04GH3456 Mike Car
// KA01AB1234 John Car
// MH02CD5678 Alice Bike
// DL03EF9012 Bob Truck

// Input 2 :

// 4
// WB05XY6789 Raj Bike
// RJ06MN4567 Amit Car
// KL07PQ1234 Seema Truck
// RJ06MN4567 Amit Car

// Output 2 :

// WB05XY6789 Raj Bike
// KL07PQ1234 Seema Truck
// RJ06MN4567 Amit Car

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class REC_OOPS_using_Java_Week_10_Q1 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        
        Set<String> set= new HashSet<>();
        
        Map<String ,String[] >map=new HashMap<>();
        
        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            String str[]=scan.nextLine().split(" ");
            if(!set.contains(str[0])){
                set.add(str[0]);
                map.put(str[0],new String []{str[1],str[2]});
            }
        }
        
        for(String s:set){
            String map_str[]=map.get(s);
            System.out.println(s+" "+map_str[0]+" "+map_str[1]);
        }
    }    
}
