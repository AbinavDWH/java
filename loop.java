    import java.util.*;

class loop{

    static  void print(int a,int b,int n){int sum=a;
        for(int i=0;i<n;i++){
            int temp=a;
            for(int j=0;j<=i;j++){
                temp+=(int) (Math.pow(2, j))*b;
            }
            System.out.print(temp+" ");
        }
        System.out.println();
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            print(a, b, n);
        }
        in.close();
    }
}