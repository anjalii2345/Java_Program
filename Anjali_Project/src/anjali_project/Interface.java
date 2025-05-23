package anjali_project;
import java.io.*;
//interface declared
interface testinterface {
    //public static and final
    final int  a=10;
    int b=20;
   static int c=30;
    //public and abstract
    void display();
    void Method1();
    void Method2();
}
//class implenting inetrface
class Testclass implements testinterface {
    //IMPLEMENTING RHE  CAPABILITIES OF INTERFACE
    public void display() {
        System.out.println("GREEK");
    }
    public void Method1() {
        System.out.println("Method1");
    }
    public void Method2() {
        System.out.println("Method2");
        class Interface{
            public static void main(String args[]) {
            //creating object of class
            Testclass t= new Testclass();
            //calling methods
            t.display();
            t.Method1();
            t.Method2();
            System.out.println(t.a);
            System.out.println(t.b);
            System.out.println(t.c);
        }
        }
        
    }
}