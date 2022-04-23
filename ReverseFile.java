import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
public class ReverseFile {
    public static void main(String[] args) {
        try
        {
            File f = new File("First.txt");  
            Scanner read = new Scanner(f);  
            String file = "";
            while (read.hasNext()) 
            {
               file += read.next() + " ";            }
            read.close();
            FileWriter fww = new FileWriter("Second.txt");
            for(int i=file.length()-1;i>=0;i--)
            {
                fww.write(file.charAt(i));
            }
            fww.close();
        }   
        catch (Exception e) 
        {  
            System.out.println("There is Error");
            System.out.println(e);   
        }  
    }   
}