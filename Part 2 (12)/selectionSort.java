import java.util.*;
public class selectionSort
{
    Scanner in = new Scanner (System.in);
    int a[];int temp,len;
    
    void sort()
    { 
        int n = a.length; 
        for (int i = 0; i < n-1; i++) 
        {int min_idx = i; 
            for (int j = i+1; j < n; j++) 
          {if (a[j] < a[min_idx]) 
                    min_idx = j; 
            int temp = a[min_idx]; 
            a[min_idx] = a[i]; 
            a[i] = temp; 
        } 
    }
    System.out.println("Sorted Array.");
    for(int i=0;i<len;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    void somethin()
    {
        System.out.println("Enter the size of the array.");
        len=in.nextInt();
        a=new int [len];
        System.out.println("Enter the elements.");
        for(int i=0;i<len;i++)
        {
            a[i]=in.nextInt();
        }
    }
    public static void main (String args[])
    {
        selectionSort ob = new selectionSort();
        ob.somethin();
        ob.sort();
    }
}