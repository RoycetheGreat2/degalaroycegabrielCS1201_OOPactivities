import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        

    System.out.print("Enter the size of the multiplication table: ");
    int size = input.nextInt();
    System.out.println("Multiplication Table: ");
    if (size > 0){
        int[][] arr = new int[size][size];

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++){
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        
        input.close(); 
    }
    else {
        System.out.println("The size is invalid.");
    }
}
}
