import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Program_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new InvalidAgeException("You are not eligible (Age must be 18+)");
            }

            System.out.println("You are eligible.");
        }
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid input!");
        }

        System.out.println("Program continues...");
    }
}