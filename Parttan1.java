import java.util.Scanner;

class Parttan1 {
         
        private int n;
        public void patt(int num) 
        {
            this.n=num;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.println("*");
                }
            }
              
        }
    
    
}
public class test
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value");
        int x=in.nextInt();
        Parttan1 p=new Parttan1();
        p.patt(x);
    }
}
