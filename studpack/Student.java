package studpack;

public class Student {
    protected String name;
    protected int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void displayStudent() {
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
    }
}