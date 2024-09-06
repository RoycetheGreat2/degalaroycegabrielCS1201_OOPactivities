
import java.util.Scanner;
public class GettingGreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Getting the Greater Value");

        System.out.print("Enter the first character: ");
        char ch1 = input.next().charAt(0);
        int num1 = (int) ch1;

        System.out.print("Enter the second character: ");
        char ch2 = input.next().charAt(0);
        int num2 = (int) ch2;

        int biggerNum = Math.max(num1, num2);
        char biggerChar= (char) biggerNum;

        System.out.println("-----------------------------------------------------------");
        System.out.println("The character with greater value is: " + biggerChar);
        System.out.println("-----------------------------------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println(ch1 + " : " + num1);
        System.out.println(ch2 + " : " + num2);

        input.close();
    }
}
