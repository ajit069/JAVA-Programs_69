package exampack;

import studpack.Student;

public class Result extends Student {
    int m1, m2, m3;

    public Result(String name, int roll, int m1, int m2, int m3) {
        super(name, roll);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void displayResult() {
        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        displayStudent();
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if (avg >= 40)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }
}