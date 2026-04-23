import java.util.*;

public class Program_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, num;
        int largest = 0, smallest = 0;

        System.out.printf("Enter number of elements: ");
        n = sc.nextInt();

        System.out.printf("Enter numbers: ");
        for(int i = 1; i <= n; i++) {
            num = sc.nextInt();

            if(i == 1) {  // initialize only for first number
                largest = num;
                smallest = num;
            } 
            else {
                if(num > largest) {
                    largest = num;
                }
                if(num < smallest) {
                    smallest = num;
                }
            }
        }

        System.out.printf("Largest number: %d\n", largest);
        System.out.printf("Smallest number: %d", smallest);

        sc.close();
    }
}