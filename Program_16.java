// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract double area();
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class Program_16 {
    public static void main(String[] args) {
        Shape t = new Triangle(10, 5);
        Shape r = new Rectangle(4, 6);
        Shape c = new Circle(3);

        System.out.println("Area of Triangle: " + t.area());
        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Area of Circle: " + c.area());
    }
}