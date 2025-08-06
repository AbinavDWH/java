import java.util.Scanner;

public class REC_OOPS_using_Java_Week_1_Q6 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt(),x=scan.nextInt();
        if(x==0) System.out.print("Result: "+0);
        
        else{
        char arr[]=Integer.toBinaryString(n).toCharArray();
        int l=arr.length;
        if(l<x){
            System.out.print("Result: "+n);
            return;
        }
        char b[]=new char[x];
        int j=0;
        for(int i=l-x;i<l;i++){
            b[j++]=arr[i];
        }
        String adi=new String(b);
        int d=Integer.parseInt(adi,2);
        System.out.print("Result: "+d);
    }}
}
