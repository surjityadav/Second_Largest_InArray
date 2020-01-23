
import java.util.Scanner;


public class Second_Largest_Element 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int first,second;
        System.out.println("Enter Array Elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        first=second=-9999;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first)
            {
               second=arr[i];         
            }
        }
        System.out.println("Largest :-"+first);
         System.out.println("Second :-"+second);
    }
}
