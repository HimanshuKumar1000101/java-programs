import java.util.Scanner;

class Base
{ 
    String f_name;
    Base()
    {    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name :");
        f_name=sc.nextLine();
    }
}
class Inter_base extends Base
{ 
    String m_name;
    Inter_base()
    {    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your middle name :");
        m_name=sc.nextLine();
    }
}
class Derived extends Inter_base
{ 
    String l_name;
    Derived()
    {    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your last name :");
        l_name=sc.nextLine();   
    }
    public void concat()
    {
        System.out.println(f_name+" "+m_name+" "+l_name);
    
    }
}

public class Name {
    public static void main(String[] args) {
        Derived l=new Derived();
        l.concat();
    }
}
