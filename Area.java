
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length");
        int length=in.nextInt();
        System.out.println("Enter the breath");
        int breath=in.nextInt();
        int area=length*breath;
        int perimeter=2*(length+breath);
        System.out.printf("area of rectangle :%d\n",area);
        System.out.printf("perimeter of rectangle :%d",perimeter);

    }
    
}
