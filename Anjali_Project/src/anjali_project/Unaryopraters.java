package anjali_project;
public class Unaryopraters {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Unary operators
        System.out.println("Original value of a: " + a);
        System.out.println("Incremented value of a: " + (++a)); // Pre-increment
        System.out.println("Decremented value of a: " + (--a)); // Pre-decrement

        System.out.println("Original value of b: " + b);
        System.out.println("Post-increment value of b: " + (b++)); // Post-increment
        System.out.println("Value of b after post-increment: " + b);
        System.out.println("Post-decrement value of b: " + (b--)); // Post-decrement
        System.out.println("Value of b after post-decrement: " + b);
    }
}