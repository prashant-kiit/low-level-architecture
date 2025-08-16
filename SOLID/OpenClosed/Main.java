package SOLID.OpenClosed;

// Common interface for all shapes
interface Shape {
    double calculateArea();
}

// Circle implements Shape
class Circle implements Shape {
    private double radius;
    Circle(double radius) { this.radius = radius; }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle implements Shape
class Rectangle implements Shape {
    private double length, width;
    Rectangle(double length, double width) {
        this.length = length; this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// AreaCalculator is closed for modification
class AreaCalculator {
    public double getTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape s : shapes) {
            total += s.calculateArea();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(10, 20)
        };

        AreaCalculator calc = new AreaCalculator();
        System.out.println("Total Area = " + calc.getTotalArea(shapes));
    }
}

