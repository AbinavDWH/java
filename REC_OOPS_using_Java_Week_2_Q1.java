import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_Q1 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt(),n2=scan.nextInt(),n3=scan.nextInt(),n4=scan.nextInt(),n5=scan.nextInt();
        int avg=(int)(n1+n2+n3+n4+n5)/5;
        System.out.println("Average score: "+avg);
        String str="";
        if(avg>=50) str="passed";
        else str="failed";
        System.out.print("The student has "+str);
        
    }
}
