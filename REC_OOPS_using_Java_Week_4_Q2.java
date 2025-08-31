import java.util.Arrays;
import java.util.Scanner;

public class REC_OOPS_using_Java_Week_4_Q2 {
    public static void main(String arg[]){
        Scanner scan  =new Scanner(System.in);
        int n=scan.nextInt();
        
        scan.nextLine();
        String s=scan.nextLine();
        String arr[]=s.split(" ");
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
