import java.util.*;
public class binarySearch
{
    Scanner in = new Scanner (System.in);
    int a[];
    int len,num,f,l,m;
    
    int pt(int x, int f, int l) {
        if (f <= l) {
            int m = (f + l) / 2;
            if (a[m] == x) {
                return m;
            } else if (a[m] < x) {
                return pt(x, m + 1, l);
            } else {
                return pt(x, f, m - 1);
            }
        }
        return -1;
    }
    
    void somethin()
    {
        System.out.println("Enter the size of the Array.");
        len=in.nextInt();
        a=new int[len];
        l=len-1;
        f=0;
        
        System.out.println("Enter the array elements one by one!");
        for(int z=0;z<len;z++)
        {
            a[z]=in.nextInt();
        }
        
        System.out.println("Enter the number to be Searched!");
        num=in.nextInt();
        
        System.out.println("Position of "+num+" is "+pt(num,f,l));
    }
    public static void main(String args[])
    {
        binarySearch ob = new binarySearch ();
        ob.somethin();
    }
}