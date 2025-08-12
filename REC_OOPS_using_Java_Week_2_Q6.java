import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_Q6 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }System.out.println("");
        }
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }System.out.println("");
        }
    }
}
