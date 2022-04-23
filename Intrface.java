import java.util.Scanner;

interface ar
{
    public double area(int dimension);
}
interface perm
{
    public double perimeter(int dimension);
}
class Dimension 
{
   public void set_data()
   { 
    System.out.println("shape : squre");
   }
}
class Cals extends Dimension implements ar,perm
{
    public double area(int dim)
    {
       return dim*dim;
    }
    public double perimeter(int dim)
    {
        return 4*dim;
        
    }
}
public class Intrface {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Cals c=new Cals();
        System.out.println("Entre the side");
        int d=in.nextInt();
        c.set_data();
        c.area(d);
        c.perimeter(d);
    }
}
