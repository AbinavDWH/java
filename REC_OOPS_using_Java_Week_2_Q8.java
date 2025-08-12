import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_Q8 {
    static int num=99;
    static void pf(){
        int n1,n2,n3;
        int temp=num;
        
        n1=temp%10;
        n2=(temp/=10)%10;
        n3=(temp/=10)%10;
        
        if(n1==n2 || n1==n3 || n2==n3){
        num+=3;
        pf();
        }
        else{
        System.out.println(num);
        num+=3;
        }
    }
    
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            pf();
        }
    }
}
