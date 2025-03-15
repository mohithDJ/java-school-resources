import java.util.*;
public class isEmirp
{
    int num,temp;int sum=1;int z=2;
    Scanner in = new Scanner (System.in);
    void input()
    {
        System.out.println("Enter the number.");
        num=in.nextInt();
        temp=num;
    }
    int rev(int x)
    {
        if(x>0)
        {
            sum=sum*10+x%10;
            return rev(x/10);
        }
        else 
        {
            return sum;
        }
    }
    int prim(int x)
    {
        if(z<x)
        {
            if(x%z==0)
            {
                return 0;
            }
            else 
            {
                z++;
                return(x);
            }
        }
        else 
        {
            return 1;
        }
    }
    void check()
    {
        if( (prim(num)) == (prim(rev(num))) )
        {
            System.out.println("It Is A Emirp Number.");
        }
        else
        {
            System.out.println("It Is Not A Emirp Number.");
        }
    }
    public static void main (String args [] )
    {
        isEmirp ob = new isEmirp ();
        ob.input();
        ob.check();
    }
}