package Operationpack;
import java.util.Scanner;
public class Operationclass 
{  int sum=0,y,m=0,flag,i,number;
    public void even_odd( int x)
    {
       if(x%2==0)
       {
           System.out.println("Numbar is Even : "+x);
       }
       else
       {
          System.out.println("Numbar is Odd : "+x);
       }
    }
    public void prime(int x)
    {
       
         m=x/2;      
        if(x==0||x==1)
        {  
         System.out.println(x+" is not prime number");      
        }
        else
        {  
         for(i=2;i<=m;i++)
         {      
          
            if(x%i==0)
            {      
           System.out.println(x+" is not prime number");      
           flag=1;      
           break;      
            }      
         }      
         if(flag==0)  
         {
              System.out.println(x+" is prime number"); 
         }
        }
       
    }
     public void armstrong(int x)
    {
        number=x;
        while(number!=0)
        {
            y=number%10;
            sum=sum+(y*y*y);
            number=number/10;
        }
        System.out.println(sum);
        if(sum==x)
        {
            System.out.print("Armstrong number");
        }
        else
        {
            System.out.println("NOT Armstrong number");
        }
    }
   
}
