import java.util.*;

public class Program_07 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome in Matrix Calculations");
        System.out.println("Press 1 for Matrix Addition");
        System.out.println("Press 2 for Matrix Subtraction");
        System.out.println("Press 0 to Exit");

        int x = sc.nextInt();

        switch (x) {
            case 1:
            case 2:
                System.out.print("Enter the number of rows of 1st Matrix: ");
                int r1 = sc.nextInt();
                System.out.print("Enter the number of columns of 1st Matrix: ");
                int c1 = sc.nextInt();
                System.out.print("Enter the number of rows of 2nd Matrix: ");
                int r2 = sc.nextInt();
                System.out.print("Enter the number of columns of 2nd Matrix: ");
                int c2 = sc.nextInt();
                if (r1 == r2 && c1 == c2) {
                    
                    int[][] A = new int[r1][c1];
                    int[][] B = new int[r2][c2];
                    int[][] C = new int[r1][c1];
                    
                    System.out.printf("Enter elements of 1st Matrix (%d x %d):%n", r1, c1);
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c1; j++) {
                            A[i][j] = sc.nextInt();
                        }
                    }
                    
                    System.out.printf("Enter elements of 2nd Matrix (%d x %d):%n", r2, c2);
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c1; j++) {
                            B[i][j] = sc.nextInt();
                        }
                    }
                    
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c1; j++) {
                            if (x == 1)
                                C[i][j] = A[i][j] + B[i][j];
                            else
                                C[i][j] = A[i][j] - B[i][j];
                        }
                    }
                    
                    if (x == 1)
                        System.out.println("Addition of two matrices:");
                    else
                        System.out.println("Subtraction of two matrices:");
                    
                    for (int i = 0; i < r1; i++) {
                        for (int j = 0; j < c1; j++) {
                            System.out.printf("%5d", C[i][j]);
                        }
                        System.out.println();
                    }
                    
                } else {
                    System.out.println("The order of the matrix is not matched.");
                }   break;
            case 0:
                System.out.println("You are out of the menu.");
                System.exit(0);
            default:
                System.out.println("ERROR!! Invalid choice.");
                break;
        }
        sc.close();
    }
}
