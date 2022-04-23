import java.util.Scanner;

public class Name2 {
    public static void main(String[] args) {
           
        System.out.println(args[0]+" "+args[1]+" "+args[2]);
        String rev="";
        char ch;
      for (int i=0; i<args[1].length(); i++)
      {
        ch= args[1].charAt(i);
        rev= ch+rev; 
      }
      System.out.println("Reversed word: "+ rev);
    }
        
    }
    

