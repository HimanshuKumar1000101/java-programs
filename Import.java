import java.lang.Exception;
class Import{
public static void main(String[] args) {
     
    int x=10;
    int y=0;
   int result=0;
   try {
      result=x/y;
   } 
   catch (Exception e) {
       System.out.println("the result :"+e);
   }
   System.out.println("the result:"+result);
}
}