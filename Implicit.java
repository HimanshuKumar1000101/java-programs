import java.util.Scanner;

class Implicit
{
    int x,y;
    Implicit(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    void show()
    {
        System.out.println("The First Number Is - "+x);
        System.out.println("The Second Number Is - "+y);
    }
}

public class Implicit_copyConstructorEX {
    public static void main(String[] args) {
        int x=10;
        int y= 20;
        Implicit i = new Implicit(x,y);
        Implicit im = new Implicit(i);   //error 

    }
}