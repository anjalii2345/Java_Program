package anjali_project;
import java.util.Scanner;
public class Modulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to find the modulus:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Perform modulus operation
        if (num2 != 0) {
            int remainder = num1 % num2;
            System.out.println("The modulus of " + num1 + " and " + num2 + " is: " + remainder);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        
        scanner.close();
    }
    
}
