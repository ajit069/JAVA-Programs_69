import java.util.Scanner;

public class Program_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        
        double sum = 0.0;
        
        for(int i = 1; i <= n; i++){
            
            if(i==1){
                System.out.printf("1");
            }
            else {
                System.out.printf(" + 1/%d",i);
            }
            sum = sum + (1.0 / i);
        }
        System.out.println();
        System.out.printf("%nThe sum of the series upto %d is %f.",n ,sum);
        
        sc.close();
    }
}
