import java.util.Scanner;

public class REC_OOPS_using_Java_Week_2_Q4 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        double p=scan.nextDouble(),perc=scan.nextDouble();
        for (int i=0;i<perc;i++){
            p=p-p*0.15;
         }
        // p=Math.round(p*100)/100.0;
        System.out.printf("Current Value: %.2f\n",p);
        System.out.print("Category: ");
        if(p>10000)
        System.out.print("High");
        else if(p<=10000 && p>=5000)
        System.out.print("Medium");
        else if(p<5000)
        System.out.print("Low");
    }
}
