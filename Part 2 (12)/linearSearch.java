import java.util.*;
public class linearSearch
{
    Scanner in = new Scanner (System.in);
    int a[];
    int num;
    int len;
    int i=0;
    int pt(int x)
    {
        if(i<len)
        {
        if(a[i]==x)
        {
            return i;
        }
        else
        {
            i+=1;
            return pt(x);
        }
    }
    else
    {
        return -1;
    }
    }
    
    void somethin()
    {
        System.out.println("Enter the size of the Array.");
        len=in.nextInt();
        a=new int[len];
        
        System.out.println("Enter the array elements one by one!");
        for(int z=0;z<len;z++)
        {
            a[z]=in.nextInt();
        }
        
        System.out.println("Enter the number to be Searched!");
        num=in.nextInt();
        
        if(pt(num)==-1)
        {
            System.out.println("Number Not Found!!!");
        }
        else
        {
            System.out.println("Position of "+num+" is "+pt(num));
        }
    }
    public static void main(String args[])
    {
        linearSearch ob = new linearSearch ();
        ob.somethin();
    }
}