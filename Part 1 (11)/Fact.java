import java.util.*;
public class Fact
{
    int num,r,sum;
    
    int fact(int n)
    {
        if(n>0)
        {
            return n*fact(n-1);
        }
        else 
            return 1;
    }
    public static void main (String args [])
    {
        int num,r,sum;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number.");
        num=in.nextInt();
        Fact ob = new Fact();
        System.out.println(ob.fact(num));
    }
    }