import java.util.Scanner;

class REC_OOPS_using_Java_Week_1_Q2{
     public static void main(String arg[]){
        Scanner scan =new Scanner(System.in);
        int n1=scan.nextInt(),n2=scan.nextInt();
        if((n1>0 && n2%3!=0)||(n1%3!=0&&n2>0)){
            System.out.print("One of the integers is positive while the other is not divisible by 3.");
        }
        else{
            System.out.print("Neither of the integers meets the condition.");
        }
    }
}