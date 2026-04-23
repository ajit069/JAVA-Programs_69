class Student {
    int id;
    String name;

    Student() {
        id = 0;
        name = "Unknown";
        System.out.printf("Default Constructor Called\n");
    }

    Student(int i, String n) {
        id = i;
        name = n;
        System.out.printf("Parameterized Constructor Called\n");
    }

    void display() {
        System.out.printf("ID: %d\n", id);
        System.out.printf("Name: %s\n", name);
    }
}

public class Program_11 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.display();

        System.out.printf("\n");

        Student s2 = new Student(101, "Alex");
        s2.display();
    }
} 