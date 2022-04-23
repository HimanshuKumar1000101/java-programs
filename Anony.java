import java.util.Scanner;

class Outer
{  

    Scanner sc=new Scanner(System.in);
    int x;
  public void Squre()
  {
    System.out.println("Enter the value");
    x=sc.nextInt();
    System.out.println("Squre : "+x*x);
  }
  class AnonymousInner
  {
      public static void main(String[] args) {
        {
            Outer o=new Outer()
            {
            public void Squre()
            {
            System.out.println("Cube : "+x*x*x);
            } 
            };
            o.squre();
            }
            
      }
  }
}
