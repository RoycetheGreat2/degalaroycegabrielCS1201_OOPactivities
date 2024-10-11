public class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size) {
        this.color = color;
        setPrice(price); 
        setSize(size);   
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Invalid price: " + price);
        }
    }

    public void setSize(char size) {
        char newSize = Character.toUpperCase(size);
        if (newSize == 'S' || newSize == 'M' || newSize == 'L') {
            this.size = newSize;
        } else {
            throw new IllegalArgumentException("Invalid Size: " + size);
        }
    }

    public String toString() {
        String formattedPrice = String.format("%.2f", price);
        return "Car (" + color + ") - P " + formattedPrice + " - " + size;
    }

    public static void main(String[] args) {
        try {
            Car myCar = new Car("Blue", 15000.50, 'm');
            System.out.println(myCar.toString());

            Car car1 = new Car("red", 19999.85, 'M');
            System.out.println(car1.toString());

            Car car2 = new Car("blue", 50000.00, 'L');
            System.out.println(car2.toString());

            Car car4 = new Car("green", -5.5, 'S');
            System.out.println(car4.toString()); 

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

