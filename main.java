abstract class principle{
abstract void show_count();
}
class Maths extends principle {
int mtatnds;
public void mark_attendance(int atnds)
{
mtatnds=atnds;
}
public void show_count(){
System.out.println("Maths class attendance is "+mtatnds);
}
}

class Science extends principle{
int scatnds;
public void mark_attendance(int atnds)
{
scatnds=atnds;
}
void show_count(){
System.out.println("Science class attendance is "+scatnds);
}
}

public class attendance {
public static void main(String s[]) {
Maths mt=new Maths();
mt.mark_attendance(20);
mt.show_count();
Science sc=new Science();
sc.mark_attendance(40);
sc.show_count();
System.out.println("The Total strength is: "+(mt.mtatnds+sc.scatnds));
}
}

11:56 PM
Sunday
Aishika Dutta : 12007922
emoji-icon
three-dots-icon
thumbnail
abstract class Principal{
abstract void show_count();
}
class Mathematics extends Principal{
int atndm;
public void mark_attendance(int atnd1)
{
atndm=atnd1;
}
public void show_count(){
System.out.println("Attendance in maths class: "+atndm);
}
}

class Science extends Principal{
int atnds;
public void mark_attendance(int atnd2)
{
atnds=atnd2;
}
void show_count(){
System.out.println("Attendance in Science class is "+atnds);
}
}

public class abstr {
public static void main(String args[]) {
Mathematics ma=new Mathematics();
ma.mark_attendance(30);
ma.show_count();
Science scie=new Science();
scie.mark_attendance(35);
scie.show_count();
}
}

