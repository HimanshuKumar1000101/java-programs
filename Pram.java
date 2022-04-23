import java.util.Scanner;
 class Parttan {
   void show(int num)
   { 
    for(int i=1;i<=num;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
  }
 }
 public class Pram
 {
    public static void main(String[] args) {
        int n= Integer.parseInt(args[0]);
        Parttan p=new Parttan();
        p.show(n);
 }
}
     
 

