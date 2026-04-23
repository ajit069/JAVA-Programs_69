import java.util.*;

class Electricity {
    int units;
    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.printf("Enter number of units consumed: ");
        units = sc.nextInt();
    }
}

class Bill extends Electricity {
    double bill;

    void calculateBill() {
        if(units <= 100) {
            bill = units * 1.5;
        }
        else if(units <= 300) {
            bill = (100 * 1.5) + (units - 100) * 2.5;
        }
        else {
            bill = (100 * 1.5) + (200 * 2.5) + (units - 300) * 4.0;
        }
    }

    void display() {
        System.out.printf("Units Consumed: %d\n", units);
        System.out.printf("Total Electricity Bill: %.2f", bill);
    }
}

public class Program_12 {
    public static void main(String[] args) {
        Bill b = new Bill();

        b.getData();       
        b.calculateBill(); 
        b.display();       
    }   
}