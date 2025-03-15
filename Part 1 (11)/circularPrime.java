import java.util.*;
public class circularPrime
{
    Scanner in = new Scanner (System.in);
    int n,z,len,i,fre,l;
    String str;

    circularPrime()
    {
        n=0;str="";z=0;len=0;i=0;fre=0;l=0;
    }

    void input()
    {
        System.out.println("Enter the number.");
        n=in.nextInt();
        str=Integer.toString(n);
        len=str.length();
        l=len;
    }

    void display()
    {
        for(i=0;i<len;i++)
        {
            n=n%10*(int)Math.pow(10,len-1)+n/10;
            System.out.println(n);
            if(Prime(n,2)==1)
            {
                fre+=1;
            }
        }

        if(fre == l)
        {
            System.out.println("It is an Circular Prime number.");
        }
        else
        {
            System.out.println("It is not an Circular Prime number.");
        }
    }

    int Prime(int x,int z)
    {
        if(x>z)
        {
            if( x%z == 0 )
            {
                return 0;
            }
            else
            {
                z++;
                return Prime(x,z);
            }
        }
        else
            return 1;
    }

    public static void main (String args [] )
    {
        circularPrime obj = new circularPrime();
        obj.input();
        obj.display();
    }

}