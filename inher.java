public class Human{
  String name;
  String contact;
  String address;
  public void set_data(String n,String c,String a)
  {
      name=n;
      contact=c;
      address=a;

  }
  public void show$data()
  {
    System.out.println("the person name\n"+name+"contact no. \n"+contact+"address"+address);
  }
}
public class Teacher extends Human
{
    int T_id;
    int experience;

    public void setT_id(int t_id , int exp) {
        T_id = t_id; experience=exp;
        System.out.println("this is "+t_id+" and i have "+exp+ "years experience");
    }
}
public class Inher{
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.set_data("himanshu","7607900683","smq p442");
        t.show$data();
        t.setT_id(1234,4);
    }
}
