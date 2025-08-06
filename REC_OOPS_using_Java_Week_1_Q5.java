import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_Q5 {
     public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        double r=scan.nextDouble();
        double pi=3.14159;
        System.out.printf("Circumference: %.2f meters\nArea: %.2f square meters",2*pi*r,pi*r*r);
    }
}
