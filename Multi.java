class C
{
    public void set_data()
    {   System.out.println("C features");
       System.out.println("1 = Procedural Language\n 2 = Fast and Efficient\n 3 = Modularity\n 4 = Statically Type\n 5 = General-Purpose Language\n 6 = Rich set of built-in Operators\n  7 = Libraries with rich Functions\n 8 = Middle-Level Language");
      System.out.println();
    }

}
 

class Cpp extends C
{
    public void set_value()
    {  System.out.println("C++ features");
       System.out.println("1 = Data abstraction\n 2 = Data encapsulation\n 3 = Inheritance\n 4 = Data hiding\n 5 =Polymorphism ");
       System.out.println();
    }
}
class Java extends Cpp
{
    public void set_datas()
    {  System.out.println("Java features");
       System.out.println("1 = Platform Independent\n 2 = Architectural Neutral\n 3 = Multi-threaded and Interactive\n 4 = Dynamic and Extensible");
       System.out.println();
    }
}
public class Multi 
{
    public static void main(String[] args) {
        Java j=new Java();
        j.set_data();
        j.set_value();
        j.set_datas();
    }
}