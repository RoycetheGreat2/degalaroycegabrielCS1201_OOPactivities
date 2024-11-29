// Class to hold a collection of shapes and compute their properties
public class ShapeCollection {
    private Shape[] shapes; // Array to store shapes

    // Constructor to initialize the shapes array
    public ShapeCollection(Shape[] shapes) {
        this.shapes = shapes;
    }

    // Method to compute and print the area and perimeter of each shape
    public void getPropertyValues() {
        for (Shape shape : shapes) {
            shape.printShapeType(); // Print the type of the shape
            System.out.printf("Area: %.2f\n", shape.getArea()); // Print the area
            System.out.printf("Perimeter: %.2f\n", shape.getPerimeter()); // Print the perimeter
            System.out.println("-------------------"); // Separator for readability
        }
    }
}
