import java.util.*;

public class adhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read first matrix
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] mat1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        // Read second matrix
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] mat2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        // Transform first matrix: each row becomes sum of that row
        int[][] transformedMat1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            int sum = 0;
            for (int j = 0; j < c1; j++) {
                sum += mat1[i][j];
            }
            for (int j = 0; j < c1; j++) {
                transformedMat1[i][j] = sum;
            }
        }

        // Print transformed matrix
        System.out.println("Transformed matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(transformedMat1[i][j]);
                if (j < c1 - 1) System.out.print(" ");
            }
            System.out.println();
        }

        // Merge logic
        System.out.println("Final merged matrix:");

        if (r1 == r2) {
            // Horizontal merge
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(transformedMat1[i][j]);
                    if (j < c1 - 1) System.out.print(" ");
                }
                for (int j = 0; j < c2; j++) {
                    System.out.print(mat2[i][j]);
                    if (j < c2 - 1) System.out.print(" ");
                }
                System.out.println();
            }
        } else {
            // Vertical merge
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(transformedMat1[i][j]);
                    if (j < c1 - 1) System.out.print(" ");
                }
                System.out.println();
            }
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(mat2[i][j]);
                    if (j < c2 - 1) System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}