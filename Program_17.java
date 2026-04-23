import java.util.Scanner;

interface Result {
    void getMarks();
    void calculate();
    void display();
}

class Student implements Result {
    int roll;
    String name;
    int m1, m2, m3;
    int total;
    double percentage;
    String division;

    Scanner sc = new Scanner(System.in);

    public void getMarks() {
        System.out.print("Enter Roll No: ");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.println("Enter marks of 3 subjects:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    public void calculate() {
        total = m1 + m2 + m3;
        percentage = total / 3.0;

        if (percentage >= 60)
            division = "First Division";
        else if (percentage >= 50)
            division = "Second Division";
        else if (percentage >= 40)
            division = "Third Division";
        else
            division = "Fail";
    }

    public void display() {
        System.out.println("\n--- Result Sheet ---");
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Division: " + division);
    }
}

public class Program_17 {
    public static void main(String[] args) {
        Student s = new Student();
        s.getMarks();
        s.calculate();
        s.display();
    }
}