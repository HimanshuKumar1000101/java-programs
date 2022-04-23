import java.util.Scanner;
class pra
{
    public void set_data(int a)
    {
        int i,f=0,flag=0;
       
        f=a/2;
        for(i=2;i<=f;i++)
        {
            if(a%i==0)
            {
                System.out.println("Number is not prime :");
                flag=1;
                int x=a*a*a;
                System.out.printf("cube of number :%d",x);
                break;  
            }
        }
        if(flag==0)
        {
            System.out.println("Number is prime number: ");
        }
    }
}
public class Prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number :");
        int z=in.nextInt();
        pra p=new pra();
        p.set_data(z);
    }
    
}
