class AA
{
    int x=15;
    int y=18;
   public void msg1()
    {
        System.out.println("X is"+x+"y is"+y);
    }
     public void msg2()
    {

        System.out.println("Subtraction"+(x-y));
    }
}
    class BB extends AA
    {
         int y=70;
         int z=97;
       public void msg2()
        {
            System.out.println("Addition"+(x+y));
        }
       public void msg3()
        {
            System.out.println("Multiplication"+(x*y));
        }

    }
    public class Inhe
    {
        public static void main(String[] args)
        {
            BB b=new BB();
            b.msg1();
            b.msg2();
            b.msg3();
        } 
    }

