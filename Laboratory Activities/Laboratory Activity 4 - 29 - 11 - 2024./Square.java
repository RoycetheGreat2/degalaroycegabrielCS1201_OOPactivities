// Class representing a Square, implements the Shape interface
public class Square implements Shape {
    private double side;

    // Constructor to initialize the side length
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate the area of the square (A = side^2)
    @Override
    public double getArea() {
        return side * side;
    }

    // Method to calculate the perimeter of the square (P = 4 × side)
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    // Method to print the type of the shape
    @Override
    public void printShapeType() {
        System.out.println("Square");
    }
}