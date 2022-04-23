package Numeric;
public class OddClass
{  
    int i;
    public void even(int arr[])
    {
       for(i=1;i<=arr.length;i++)
       {
           if(arr[i]%2!=0)
           {
               System.out.println(arr[i]);
           }
       }
   }
}
