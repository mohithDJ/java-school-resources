import java.util.*;
public class revPrimFact
{
    Scanner in = new Scanner (System.in);
    static int n,sum,z;
    
    revPrimFact()
    {
        n=0;z=2;sum=0;
    }
    
    int rev(int x)
    {
        if(x>0)
        {
            sum=sum*10+(x%10);
            rev(x/10);
        }
        return sum;
    }
    
    int fact(int x)
    {
        if(x>0)
        {
            sum=x*fact(x-1);
        }
        return sum;
    }
    
    int prim(int x)
    {
        if(x>z)
        {
            if(x%z == 0)
            {
                return 0;
            }
            else
            {
                z+=1;
                return prim(x);
            }
        }
        else {
        return 1;
    }
    }
    
    void display()
    {
        System.out.println("Enter the number.");
        n=in.nextInt();
    
        System.out.println("Reverse of "+n+" is "+rev(n));
        sum=0;
        System.out.println("Factorial of "+n+" is "+fact(n));
        
        if(prim(n)==1)
        {
            System.out.println(n+" is an prime number!");
        }
        else
        System.out.println(n+" is not an prime number!");
    }
    
    public static void main (String args[])
    {
        revPrimFact ob = new revPrimFact ();
        
        ob.display();
    }
}