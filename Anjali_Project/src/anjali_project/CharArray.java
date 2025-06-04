package anjali_project;

public class CharArray {
    public static void main(String [] args) {
        String  s ="iot";
        char[] chars = s.toCharArray();
        //Print the output
        System.out.print("char[" + chars.length + "] = {");
    for(int i = 0; i<chars.length;i++){
        System.out.print("" + chars[i]+"");
        if(i< chars.length -1){
            System.out.print(",");}
        }
        System.out.println("}");
    }
    }
    

