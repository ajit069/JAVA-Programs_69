class Student {
    int id;
    String name;

    static String college = "ABC College"; 

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + this.id + ", Name: " + this.name + ", College: " + college);
    }

    static void changeCollege() {
        college = "XYZ University";
    }
}

public class Program_15 {
    public static void main(String[] args) {
        Student.changeCollege(); 

        Student s1 = new Student(1, "Peter");
        Student s2 = new Student(2, "Tony");

        s1.display();
        s2.display();
    }
}