import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_Q7 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=2*n-1;i+=2){
            StringBuilder str= new StringBuilder("");
            for(int j=1;j<=(2*i-1)/2+1;j++)
            str.append(j);
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");
            System.out.printf("%s\n",str);
        }
        
        
    }
}
