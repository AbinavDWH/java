import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_Q4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt(),b=scan.nextInt();
        if((a+b)%(a*b)==0){
            System.out.print("Sum is Multiple of Product");
        }
        else
        System.out.print("Sum is Not  Multiple of Product");
    }
    
}
