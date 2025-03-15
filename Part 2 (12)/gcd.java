import java.util.*;
public class gcd
{
    Scanner in = new Scanner (System.in);
    int num1,num2;
    int a=1;
    int Gcd(int x,int z)
    {
            if(x%z==0)
            {
                return z;
            }
            else
            {
                return Gcd(x,z++);
            }
    }
    void somethin()
    {
        System.out.println("Enter the first!");
        num1=in.nextInt();
        System.out.println("Enter the second!");
        num2=in.nextInt();
        
        if( Gcd(num1,2) == Gcd(num2,2)  )
        {
            System.out.println("Greatest Common Divisor of "+num1+" & "+num2+" is "+Gcd(num1,2));
        }
        else
        {
            System.out.println("No Greatest Common Divisor!!!");
        }
    }
    public static void main (String args[])
    {
        gcd ob = new gcd();
        ob.somethin();
    }
}