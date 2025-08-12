import java.util.Scanner;

class REC_OOPS_using_Java_Week_2_Q2{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n%5==0){
            System.out.print(n+" is a multiple of 5");
        }
        else if(n%7==0){
            System.out.print(n+" is a multiple of 7");
        }
        else{
            System.out.print(n+" is neither multiple of 5 nor 7");
        }
    }
}