
public class Main {

    public static void main(String[] args) {

        Square square = new Square(20); 

        Rectangle rectangle = new Rectangle(5, 4); 

        Triangle triangle = new Triangle(6, 8, 10);

        //collection of shapes
        Shape[] shapes = { square, rectangle, triangle };
        //for computing and printing the perimeter and area
        ShapeCollection shapeCollection = new ShapeCollection(shapes);


        shapeCollection.getPropertyValues();
}
}

