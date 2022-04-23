class Father
{vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
    public void father_pro1()
    {
       System.out.println("father property : \n1. home");
    }
    public void father_pro2()
    {
       System.out.println("father property : \n1. car");
    }
}
class Son extends Father
{
    public void father_pro2()
    {
       System.out.println("Son property : \n1. own car");
    }
}
  public class Legsey {
     public static void main(String[] args) {
         Son s=new Son();
         s.father_pro2();
     }
}
