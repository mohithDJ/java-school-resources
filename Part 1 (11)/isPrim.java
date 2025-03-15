import java.util.*;
public class isPrim
{
    Scanner in = new Scanner (System.in);
    int z=2;
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int num;
        System.out.println("Enter the number.");
        num=in.nextInt();
        isPrim ob = new isPrim();
        int a=0;
        a=ob.prim(num);
        if (a==1)
        {
            System.out.println("It is prime number.");
        }
        else 
            System.out.println("It is not prime number.");
    }
    int prim(int x)
    {
        if (z<x)
        {
            if (x%z == 0)
            {
                return 0;   
            }
            else
            {
                z++;return prim(x);
            }
        }
        else 
        {
        return 1;
        }
    }
}