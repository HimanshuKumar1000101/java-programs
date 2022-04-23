import java.util.Scanner;
class Outer
{    Scanner sc=new Scanner(System.in);
     String x,y,z;
    class Inner
   {
        public void getdata()
      {
         System.out.println("Enter your First name :");
         x=sc.nextLine();
         System.out.println("Enter your Last name :");
         y=sc.nextLine();
      }
      public void concat()
      {
        
          System.out.printf("Full Name :"+z);
      }
   }
   public void replacevowel()
   {
      z=x+y;
     if((z=="a")||(z=="e")||(z=="i")||(z=="o")||(z=="u"))
     {   
        
        System.out.println("*");
     }
   }
}
public class Nestedvovle {
    public static void main(String[] args) {
       Outer out=new Outer();
       Outer.Inner in=out.new Inner();
       in.getdata();
       out.replacevowel();
       in.concat();
    }
}
