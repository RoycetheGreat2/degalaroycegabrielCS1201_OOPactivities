import java.util.Scanner;
class welcome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to CS 211: Object-oriented Programming");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.println(name + ", This course will be fun.");
        input.close();
    }
}