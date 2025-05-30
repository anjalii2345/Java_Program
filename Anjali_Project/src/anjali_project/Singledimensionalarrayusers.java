package anjali_project;
import java.util.Scanner;
public class Singledimensionalarrayusers {
    public static void main(String[] args){
 Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to find the Array:");
        int size = scanner.nextInt();
        String[] aaray = new String[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            aaray[i] = scanner.next();
        }
        System.out.println("your aaray:" + java.util.Arrays.toString(aaray));        
        }


    }
    

