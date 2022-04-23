import java.util.Scanner;

abstract class Arithmetic{
   int x,y;
   Scanner in = new Scanner(System.in); 
   void takeData()
   {
      System.out.print("Enter First Number:");
      x = in.nextInt();
      System.out.print("Enter Second Number:");
      y = in.nextInt();
   }

    abstract void add();
    abstract void substract();
    void multiply(){
        System.out.print("\nProduct is: " + (x*y));
    }
    void divide(){
        System.out.print("\nDivision is: " + (x/y));
    }
 }

class Cal extends Arithmetic{
     
    void add(){
        System.out.print("Addition is: " + (x+y)); 
    }
    void substract(){
        System.out.print("\nDifference is: " + (x-y));
    }
 }

 public class AbstractCal{
     public static void main(String[] args) {
         Cal c = new Cal();
         c.takeData();
         c.add();
         c.substract();
         c.multiply();
         c.divide();
     }
 }
