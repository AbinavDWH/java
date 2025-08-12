import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_Q5 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        String n=scan.nextLine();
        char []a=n.toCharArray();
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=(a[i]-'0');
        }
        if(sum==a.length)
        System.out.print("The number of digits in "+n+" matches the sum of its digits.");
        else
        System.out.print("The number of digits in "+n+"does not match the sum of its digits.");
    }
}
