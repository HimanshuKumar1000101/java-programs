
package Mypackage;
import java.util.Scanner;
class add
{
     add()
     {  
        int sum=0,i;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value :");
         int x=sc.nextInt();
         for(i=1;i<=x;i++)
         {
             sum=sum+i;
         }
         System.out.printf("sum of n natural no. :"+sum);
     }
}
public class Addpack {
    public static void main(String[] args) {
        add a=new add();
    }
}
