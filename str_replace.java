
import java.util.Scanner;

public class str_replace {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String str=scan.nextLine().replace(" ", "_");
        System.out.println(str.replace("[^a-zA-Z0-9 ]+","_")+".java");
    }
    
}
