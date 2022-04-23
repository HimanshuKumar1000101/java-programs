import java.util.Scanner;

class Person
{   
    private string id,name,deptt;
    private int experience;
    
    public void set_data(string ID,string nam,string dep,int exp)
    {
       this.id=ID;   this.name=nam;
       this.deptt=dep;   this.exprience=exp;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter the ID");
       string ID=in.nextLine();
       System.out.println("Enter the NAME");
       string nam=in.nextLine();
       System.out.println("Enter the DEPARTMANT");
       string dep=in.nextLine();
       System.out.println("Enter the EXPERIENCE");
       int exp=in.nextInt();
    }
    public void get_data(string ID,string nam,string dep,int exp)
    {
        System.out.println("Enter the ID : %s",ID);
        System.out.println("Enter the NAME :%s",nam);
        System.out.println("Enter the DEPARTMANT",dep);
        System.out.println("Enter the EXPERIENCE :%d",exp);
    }
}
public class Personinfo {
    public static void main(String[] args) {
       
        Person p=new person();
        p.set_data();
        p.get_data();

    }
}
