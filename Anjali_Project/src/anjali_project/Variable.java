package anjali_project;

public class Variable {
   // public void StudentAge(){
        //local Variableint age=0;
        //int age=0;
       // age=age+30;
       class student {
        //static Variable
        public static double fees;
        public static String name="Anjali";
       }
       public static class Variable1{
        public static double fees=45;
        public static String name="Anjali";
       }
       public static void main(String args[]) {
        //creating object of class
        Variable temp = new Variable();
        Variable1 temp1=new Variable1();
        temp1.fees=50;
        temp1.name="Anjali";
        //calling methods
        //v.StudentAge();
        System.out.println("Student name is: " + temp1.name);
        System.out.println("Student fees is: " + Variable1.fees);
        System.out.println("Student name is: " + Variable1.name);
        System.out.println("Student fees is: " + Variable1.fees);


       }
       }