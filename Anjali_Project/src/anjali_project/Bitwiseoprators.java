package anjali_project;
public class Bitwiseoprators {
    public static void main(String[] args) {
        int a = 50; // 0101 in binary
        int b = 20;
        int c = 0;
        c= a & b;// 0011 in binary
        System.out.println("a & b = " + c);
        c = a | b;
        System.out.println("a | b = " +c);
        c = a ^ b; // 0111 in binary
        System.out.println("a ^ b = " + c);
        c = ~a; // 1010 in binary
        System.out.println("~a = " + c);
        c = a << 2; // Left shift
        System.out.println("a << 2 = " + c);

        
    }
}