import java.util.Scanner;
class TempConvert{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Celsius to Fahrenheit");
        System.out.print("Enter a celsius value: ");
        float temp = input.nextFloat();
        float newtemp = (temp*9/5)+32;
        System.out.println(temp + " Celsius is " + newtemp + " Fahrenheit");
        input.close();
    }
}
