import java.util.Scanner;
public class Program_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int temp = n, rev = 0;

        while(n > 0){
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        
        if ( temp == rev){
            System.out.printf("The number %d is a Palindrome number.",temp);
        }

        else{
            System.out.printf("The number %d is not a Palindrome number.",temp);
        }

        sc.close();
    }
}