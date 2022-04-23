import java.util.Scanner;
class Outer
{  
     public void Squre(int x)
    {
    System.out.println("Squre : "+x*x);
    }
}
  class Anonymous 
  {
      public static void main(String[] args) 
        {  
            
            Outer O=new Outer()        
            {  
                public void Squre(int x)
              {
                  System.out.println("Cube : "+x*x*x);
              } 
            };
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value");
            int x=sc.nextInt();
            Outer oot=new Outer();
                oot.Squre(x);
                O.Squre(x);
         }
   }

