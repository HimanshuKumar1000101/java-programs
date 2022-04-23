import javax.sound.sampled.SourceDataLine;

class Human2 {
    String name;
  String contact;
  String address;
  public void set_data(String n,String c,String a)
  {
      name=n;
      contact=c;
      address=a;

  }
  public void show_data()
  {
    System.out.println("the person name\n"+name+"contact no. \n"+contact+"address"+address);
  }
}
class Engineer extends Human2{
    public void set_value(int e,String c)
    {
        int experience=e;
        String core_language=c;  
    }
    public void show_value()
    {
        System.out.println("Experience : \n"+experience+"core_language"+language);
    }
}
class Doctor extends Human2{
    public set_E(string s,int experience e)
    {
        String specliest=s;
        int experience=e;
        System.out.println("specliest "+specliest+"experience"+experience);
    }
    
}
public class Inher2{
    Doctor d=new Doctor();
    D.set_data("himanshu","7607900683","smq p442");
    D.show_data();
}

