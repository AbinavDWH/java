
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

public class lower {
    public static void main(String[] args) {
        int s=1000007;
        int s1=4;

        List <Integer> arr=new LinkedList<>();

        while(s>0){
            arr.add(s%2);
            s/=2;
        }

        double total=0;
        for(int i=0;i<s1;i++){
            int temp=arr.get(i);
            if(temp==1)
                total+=Math.pow(2, i);
        }
        System.out.println(total);
        
    }
}
