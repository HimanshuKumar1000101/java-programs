interface I1
{
    public double area(int dimension);
}
class Circ implements I1
{
   public double area(int dim)
   {
       double ar=3.14*dim*dim;
       return ar;
   }
}
public class Intrfac {
    public static void main(String[] args) {
        Circ c=new Circ();
        System.out.println(c.area(10));
    }
}
