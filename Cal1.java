import java.util.Scanner;
import java.lang.Math;
  
class Outer{
    public void fun()
    {
        class Compute
        {   double a,b,c;
            Compute()
            { }
            
             Compute(double a)
            {   
              System.out.println("Squre : "+a*a);
            }
            Compute(double a,double b)
            {
                System.out.println("a^b : "+Math.pow(a, b));
            }
            Compute(double a,double b ,double c)
            {
                System.out.println("(a^b)^c : "+Math.pow(c,(Math.pow(a, b))));
            }
        }
        Compute c=new Compute(2);
        Compute v=new Compute(2,3);
        Compute b=new Compute(2,3,4);
    }
}

public class Cal1 {
    public static void main(String[] args) {
       Outer o=new Outer();
        o.fun();
    }
}
