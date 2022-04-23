import java.util.Scanner;

class Name
{

   public void name(String firstname)
   {
       System.out.println("First name :"+firstname);
   }
   public void name(String firstname,String middlename)
   {   
       System.out.println("First name :"+" "+firstname+" "+"middle name :"+middlename);
   }
   public void name(String firstname,String middlename,String lastname)
   {
       System.out.println("First name :"+" "+firstname+" "+"middle name :"+middlename+" "+"last name :"+lastname);
   }
}


public class Method {
    public static void main(String[] args) {
        Name n=new Name();
        n.name("himanshu");
        n.name("himanshu","kumar");
        n.name("himanshu","kumar","narayan");
    }
}
