
// Ravi is working as a developer for SecureLogin Systems, which wants to build a system to evaluate the strength of user passwords.


// Each user record has:


//     User ID (integer)
//     User Name (string)
//     Password (string)


// The system must calculate whether a password is strong or weak.


// A password is considered strong if it meets all of the following conditions:


//     At least 8 characters long.
//     Contains at least one uppercase letter.
//     Contains at least one lowercase letter.
//     Contains at least one digit.
//     Contains at least one special character (from !@#$%^&*).


// Ravi has been asked to implement this system using:


//     A class with attributes for user details.
//     A constructor to initialize user details.
//     Getter and setter methods to retrieve or update user details.
//     A method to check whether the password is strong.
//     Objects of the class to represent users.


// Finally, display each user’s details and indicate whether their password is Strong or Weak.
// Input format :

// The first line contains an integer N, representing the number of users.

// For each user:

// The next line contains the User ID (integer).

// The next line contains the User Name (string).

// The next line contains the Password (string).
// Output format :

// For each user, print the details in the following format:

// User ID: <user_id>

// User Name: <user_name>

// Password: <password>

// Password Strength: <Strong/Weak>


// Refer to the sample output for formatting specifications.
// Code constraints :

// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 100

// 1000 ≤ User ID ≤ 9999

// User Name should not be empty

// Password should not be empty
// Sample test cases :
// Input 1 :

// 1
// 1001
// Ravi Kumar
// Abc@1234

// Output 1 :

// User ID: 1001
// User Name: Ravi Kumar
// Password: Abc@1234
// Password Strength: Strong

// Input 2 :

// 1
// 1002
// Sita Sharma
// password

// Output 2 :

// User ID: 1002
// User Name: Sita Sharma
// Password: password
// Password Strength: Weak

import java.util.Scanner;
import java.util.regex.*;


class login{
    private int userid;
    String uname,pass;
    
    login(int userid,String uname,String pass){
        this.userid=userid;
        this.uname=uname;
        this.pass=pass;
    }
    
    Pattern l=Pattern.compile("[a-z]");
    Pattern u=Pattern.compile("[A-Z]");
    Pattern d=Pattern.compile("[0-9]");
    Pattern s=Pattern.compile("[!@#$%&*^]");
    
    void checkpass(){
        String str="Weak";
        boolean L=l.matcher(pass).find();
        boolean U=u.matcher(pass).find();
        boolean S=s.matcher(pass).find();
        boolean D=d.matcher(pass).find();
        if(L&&U&&S&&D&&pass.length()>=8){
            str="Strong";
        }
        System.out.println("User ID: "+userid);
        System.out.println("User Name: "+uname);
        System.out.println("Password: "+pass);
        System.out.println("Password Strength: "+str);
    }
    
}



public class REC_OOPS_using_Java_Week_5_PAH_1 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int id=scan.nextInt();
            scan.nextLine();
            String name=scan.nextLine();
            String pass=scan.nextLine();
            var obj=new login(id,name,pass);
            obj.checkpass();
        }
    }    
}
