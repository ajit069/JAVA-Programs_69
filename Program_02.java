import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 1, c;
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.print("Fibonacci series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
