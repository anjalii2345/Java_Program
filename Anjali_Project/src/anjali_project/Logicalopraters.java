package anjali_project;

public class Logicalopraters {
    public static void main (String [] args){
    int num1 = 20;
    int num2 = 30;
    int num3 = 40;
    boolean result;
    //Logical OR opratoers
    result = (num1 > num2)|| (num3 > num1);
    //result will be true because number 3 greater than num1
    System.out.println(result);
    //Logical And Oprators
    result = (num1> num2) && (num3 >num1);
    //result will be false because  number1 is not greater than number2
    System.out.println(result);
    } 
}
