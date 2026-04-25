import java.util.Scanner;

public class Program_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter another number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;   

            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }

        System.out.println("Program executed successfully.");
    }
}