import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();
        if (size > 0){
        int[] arr = new int[size];
        int result = 0;  


        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
            int x = input.nextInt();
            arr[i] = x;
            result += x;
        }
        
        float mean = ((float) result / size);
        System.out.printf("Mean of array is: %.2f\n", mean);
        
        input.close(); 
    }
    else {
        System.out.println("The size is invalid.");
    }
    }
}