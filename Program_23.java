import java.util.Scanner;

public class Program_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;  // may cause ArithmeticException

            int arr[] = new int[3];
            arr[5] = 10;         // may cause ArrayIndexOutOfBoundsException

            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }
        catch (Exception e) {
            System.out.println("General Exception occurred!");
        }

        System.out.println("Program continues...");
    }
}