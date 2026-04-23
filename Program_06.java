import java.util.*;
public class Program_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        
        System.out.println("Enter the number of rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        
        if(c1 != r2){
            System.out.print("Invalid for Multiplication:");
        }
        
        else{
            
            int[][] A = new int [r1][c1];
            int[][] B = new int [r2][c2];
            int[][] C = new int [r1][c2];
            
            System.out.printf("Enter elements of 1st Matrix (%d x %d):%n", r1, c1);
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        A[i][j] = sc.nextInt();
                    }
                }
                System.out.printf("Enter elements of 2nd Matrix (%d x %d):%n", r2, c2);
                for (int i = 0; i < r2; i++) {
                    for (int j = 0; j < c2; j++) {
                        B[i][j] = sc.nextInt();
                    }
                }
                
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        for (int k = 0; k < c1; k++) {
                            C[i][j] += A[i][k] * B[k][j];
                         }
                    }
                }
                
            System.out.println("The multiplication of the given matrices is: ");    
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                        System.out.printf("%5d", C[i][j]);
                    }
                    System.out.println();
            }   
        }
    }
}