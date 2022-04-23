import java.util.Scanner;

class AA
{ 
    int x,y;
  public void msg1()
 {
     x=10;
 }
public void msg2()
 {
   
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value msg2");
    y=sc.nextInt();
   System.out.println("y :"+y);
   
  
 }
}
class BB extends AA
{ int z;
   
  public void msg1()
 { 
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value msg1");
    x=sc.nextInt();
   System.out.println("x :"+x);
   
  
 }
public void msg3()
 {
   
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the value msg3");
   z=sc.nextInt();
  System.out.println("z :"+z);
  
 }
}

public class Overide {
    public static void main(String[] args) {
        BB b=new BB();
        b.msg1();
        b.msg2();
        b.msg3();
    }
}
