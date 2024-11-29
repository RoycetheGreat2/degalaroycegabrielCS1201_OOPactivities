// Class representing a Triangle, implements the Shape interface
public class Triangle implements Shape {
    private double a, b, c; // Sides of the triangle

    // Constructor to initialize the three sides of the triangle
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Method to calculate the area of the triangle using Heron's formula
    @Override
    public double getArea() {
        double s = getPerimeter() / 2; // Semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Method to calculate the perimeter of the triangle (P = a + b + c)
    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    // Method to print the type of the shape
    @Override
    public void printShapeType() {
        System.out.println("Triangle");
    }
}
