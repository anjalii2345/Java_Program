public class Concatenate{
    public static void main (String []args){
       // String str1="Anjali";
        //String str2="Singh";
        //String str3="Is";
        //String str4=str1.concat(str3).concat(str2);
        //System.out.println("concat"+ str4);//
        String str1= "Hello";
        String str2= "World";

        //Method 1:using the + oprator with a space literal
        String result1=  str1 +" "+ str2;
        System.out.println("Result 1: "+result1);
        //method 2:using the concat() method with space literal
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Result 2: "+result2);
        //Method 3: using StringBuilder with append() method
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ").append(str2);
        String result3 = sb.toString();
        System.out.println("Result 3: "+result3);

    }
}