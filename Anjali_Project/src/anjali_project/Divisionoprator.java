package anjali_project;

public class Divisionoprator {
    public static void main(String[] args) {
        // Declare and initialize two variables
        int a = 10;
        int b = 20;

        // Perform addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Perform subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Perform multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Perform division
        if (b != 0) {
            double quotient = (double) a / b;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Perform modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);
    }
    
}
