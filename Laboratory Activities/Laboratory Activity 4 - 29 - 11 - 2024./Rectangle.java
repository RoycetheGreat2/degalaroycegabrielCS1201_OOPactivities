// Class representing a Rectangle, implements the Shape interface
public class Rectangle implements Shape {
    private double length; // Length of the rectangle
    private double width;  // Width of the rectangle

    // Constructor to initialize the length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle (A = length × width)
    @Override
    public double getArea() {
        return length * width;
    }

    // Method to calculate the perimeter of the rectangle (P = 2 × (length + width))
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Method to print the type of the shape
    @Override
    public void printShapeType() {
        System.out.println("Rectangle");
    }
}
