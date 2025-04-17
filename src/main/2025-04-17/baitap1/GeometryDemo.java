// 2121050451_Nguyễn Quang Đạo
import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class Square extends Rectangle {
    public Square(String color, double side) {
        super(color, side, side);
    }
}

public class GeometryDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Red", 5.0));
        shapes.add(new Rectangle("Blue", 4.0, 6.0));
        shapes.add(new Square("Green", 3.0));

        for (Shape shape : shapes) {
            shape.displayInfo();
        }
    }
}