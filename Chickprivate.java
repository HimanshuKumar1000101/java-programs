import java.util.Scanner;

class Outer
{   
    Scanner sc=new Scanner(System.in);
    String x,y;
    private void msg1()
    {   
        System.out.println("Enter your name :");
        x=sc.nextLine();
        System.out.println("Name :"+x);

    }
    class Inner
    {
        private void msg2()
        {   
            System.out.println("Enter your city :");
            y=sc.nextLine();
            System.out.println("Name :"+x);
    
        } 

    }
}


public class Chickprivate {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner i=o.new Inner();
        i.msg1();
        o.msg2();
    }
}
