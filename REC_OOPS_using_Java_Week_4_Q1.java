import java.util.Scanner;

public class REC_OOPS_using_Java_Week_4_Q1 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            String s=scan.nextLine();
            char a[]= s.toCharArray();
            int n1=0,n2=0,n3=0;
            for(int j=0;j<a.length;j++){
                if(a[j]==','){
                    n1++;
                }
                else if(a[j]=='.')
                n2++;
                else if(a[j]=='?'){
                    n3++;
                }
            }
            System.out.println(n1+" "+n2+" "+n3);
        }
    }
}
