import java.util.*;
public class bubbleSort
{
    Scanner in = new Scanner (System.in);
    int a[];int temp,len;
    
    void sort()
    {
        for(int i=0;i<len;i++)
        {
            for(int j=i;j<len-i-1;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
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
        bubbleSort ob = new bubbleSort();
        ob.somethin();
        ob.sort();
    }
}