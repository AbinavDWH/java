    // Samantha is a diligent math student who is exploring the world of programming. She is learning Java and has recently studied conditional statements. One day, her teacher gives her an interesting problem to solve, which takes a number as input and checks whether it is a multiple of 5 or 7. 


    // Help her complete the task.
    // Input format :

    // The input consists of a single integer N, representing the number to be checked.
    // Output format :

    // If the number is a multiple of 5 but not 7, the output prints "N is a multiple of 5".

    // If the number is a multiple of 7, the output prints "N is a multiple of 7".

    // Otherwise the output prints "N is neither multiple of 5 nor 7" where N is an entered integer.


    // Refer to the sample output for formatting specifications.
    // Code constraints :

    // In this scenario, the test cases fall under the following constraints:

    // 1 ≤ N ≤ 120
    // Sample test cases :
    // Input 1 :

    // 10

    // Output 1 :

    // 10 is a multiple of 5

    // Input 2 :

    // 21

    // Output 2 :

    // 21 is a multiple of 7

    // Input 3 :

    // 37

    // Output 3 :

    // 37 is neither multiple of 5 nor 7

    import java.util.Scanner;

    public class REC_OOPS_using_Java_Week_2_CY_1 {
        public static void main(String[] args){
            Scanner S = new Scanner(System.in);
            int a = S.nextInt();
            if(a%5==0 && a%7!=0)
            System.out.printf("%d is a multiple of 5",a);
            else if(a%7==0){
                System.out.printf("%d is a multiple of 7",a);
            }
            else
            System.out.printf("%d is neither multiple of 5 nor 7",a);
        }
    }
