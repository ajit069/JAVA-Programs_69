import java.util.*;

public class Program_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.printf("Enter a decimal number: ");
        num = sc.nextInt();

        String binary = Integer.toBinaryString(num);

        System.out.printf("Binary equivalent is: %s", binary);
        sc.close();
    }
} 