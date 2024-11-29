Geometry Shapes Lab 🖋️🎨

Overview 📚
Welcome to the Geometry Shapes Lab! This Java program demonstrates the concepts of interfaces, class inheritance, and polymorphism by modeling geometric shapes. Each shape comes with its own methods to calculate the area, perimeter, and a feature to print its type. All shapes are managed through a collection class to make it easy to work with multiple shapes at once!

Checklist ✅
Here's a breakdown of what we covered in this lab:
✅Create a Shape Interface
 -Includes methods getArea(), getPerimeter(), and printShapeType().

✅Implement Square Class
Calculates:
 -Area: 𝐴 = side^2
 -Perimeter: 𝑃 = 4 × side
 -Prints: "Square"

✅Implement Rectangle Class
Calculates:
 -Area: A = length × width
 -Perimeter: P = 2 × (length + width)
 -Prints: "Rectangle"

✅Implement Triangle Class
Calculates:
 -Area using Heron's Formula: A= sqrt(s⋅(s−a)⋅(s−b)⋅(s−c))
 -Where: s = (a + b + c)/2
 -Perimeter: P = a + b + c
 -Prints: "Triangle"

✅Create ShapeCollection Class
 -Stores multiple shapes in an array.
 -Computes and prints the area and perimeter of each shape with two decimal precision.
 -Outputs the type of each shape.

✅Develop the Main Class
Demonstrates the program in action by:
 -Creating objects for Square, Rectangle, and Triangle.
 -Grouping them in a ShapeCollection.
 -Printing their properties in a neatly formatted output.