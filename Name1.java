import java.util.Scanner;

public class Name1 {
    public static void main(String[] args) {
           
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your First Name :");
        String fn=sc.nextLine();
        System.out.println("Enter your Middle Name :");
        String mn=sc.nextLine();
        System.out.println("Enter your last Name :");
        String ln=sc.nextLine();
        System.out.printf("Full name : "+fn+" "+mn+" "+ln); 
        System.out.println("");
        String rev="";
        char ch;
      for (int i=0; i<mn.length(); i++)
      {
        ch= mn.charAt(i);
        rev= ch+rev; 
      }
      System.out.println("Reversed word: "+ rev);
    }
        
    }
    

