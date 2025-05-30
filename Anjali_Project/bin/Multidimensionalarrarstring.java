package Anjali_Project.bin;

public class Multidimensionalarrarstring {
    public static void main(String[] args) {
String[][] Jay = {
    {"Anjali", "is", "a", "good"},
    {"student", "and", "she", "is", "very", "intelligent"}
};
String clonearray[][]= Jay.clone();
System.out.println(Jay[0] == clonearray[0]);
System.out.println(Jay[1] == clonearray[1]);
System.out.println("Array element: " + Jay[0][0] + " " + Jay[0][1] + " " + Jay[0][2] + " " + Jay[0][3]);
System.out.println("Array element: " + Jay[1][0] + " " + Jay[1][1] + " " + Jay[1][2] + " " + Jay[1][3] + " " + Jay[1][4]);
}
}
    