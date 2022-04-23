import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value ");
        x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
           // int y=x*i;
           if(i%2!=0)
           {
            System.out.printf("%d",i*i);
            System.out.println(" ");
           }
        }
    }
    
}
