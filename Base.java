import java.util.Scanner;
public class Base{
 public static void main(String[] args) {

   Scanner in = new Scanner(System.in);
   System.out.println("enter the value");
   int x =in.nextInt();
    if(x<10)
    {
        System.out.println("less than 10");
    }
    else if(x>10)
    {
        System.out.println("grater than 10");
    }
    else
    {
        System.out.println("equal to 10");
    }
      System.out.println(x);
        
    }
    
}
