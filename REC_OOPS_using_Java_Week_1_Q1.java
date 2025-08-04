import java.util.Scanner;

class  REC_OOPS_using_Java_Week_1_Q1{
    public static void main(String arg[]){
        int a,b;
        Scanner scan= new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        int n1,n2;
        n1=Math.abs(100-a);
        n2=Math.abs(100-b);
        if(n1<=n2){
            System.out.println("The integer closer to 100 is "+a+" with a difference of "+n1);
        }
        else 
         System.out.println("The integer closer to 100 is "+b+" with a difference of "+n2);
    }
}
