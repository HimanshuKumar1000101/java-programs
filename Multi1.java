import java.util.Scanner;

class Person
{    Scanner sc=new Scanner(System.in);
    String name;
    String phone;
      public void set_data()
      {
        System.out.println("Person information");
          System.out.println("Enter your name :");
           name=sc.nextLine();
          System.out.println("Enter your phone no. :");
           phone=sc.nextLine();
          System.out.println("Enter your city :");
          String city=sc.nextLine();
          System.out.println("Enter your State :");
          String state=sc.nextLine();

      }
  }
  class Student extends Person
  {
      public void set_value()
      {    System.out.println("Student information");
           String sname=name;
           String sphone=phone;
           System.out.println(sname);
           System.out.println(sphone);
           System.out.println("Enter your reg. no.:");
           String sreg=sc.nextLine();
           System.out.println("Enter your Roll no.:");
           String sroll=sc.nextLine();
           System.out.println("Enter your course:");
           String scourse=sc.nextLine();
      }
  }
class Teacher extends Person
{
  public void get_data()
  {
    System.out.println("Teacher information");
    System.out.println("Enter your name:");
    String tname=sc.nextLine();
    System.out.println("Enter your exprience:");
    int texp=sc.nextInt();
    System.out.println("Enter your course:");
    String coresubject=sc.nextLine();
  }
}


public class Multi1 {
    public static void main(String[] args) {
        Student s=new Student();
        s.set_data();
        s.set_value();
        Teacher t=new Teacher();
        t.get_data();
        
    }
}
