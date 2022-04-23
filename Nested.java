import java.util.Scanner;

class Outer
{   int sum=0;
    int[] array = new int[100];
    int x;
    public void odd()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values");
     x=sc.nextInt();
     
    
    for(int i=0; i<x; i++)  
   { 
    
   {
     array[i]=sc.nextInt();  
   }   
}
for(int i=0; i<x; i++)  
{ 
 if(i%2==0)
{ 
    
    sum=sum+array[i];
}   
}
System.out.println(" sum of odd :"+sum); 
}
 class Inner 
 {   int sum=0;
    public void even()
    {
        for(int i=0; i<x; i++)  
        { 
         if(i%2!=0)
        { 
           sum=sum+array[i];
        }   
        }   
        System.out.println(" sum of even :"+sum); 
    } 
 }
}


public class Nested 
{
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner obj = out.new Inner();
        out.odd();
        obj.even();
        

    }
}
