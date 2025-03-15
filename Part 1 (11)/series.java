import java.util.*;
public class series
{
    int x,num;
    int f,sum=1;
    Scanner in = new Scanner (System.in);
    void input()
    {
        System.out.println("Enter the 'x' and then the the no.of times to repeat.");
        x=in.nextInt();
        num=in.nextInt();
    }
    int fact(int a)
    {
        for(int i = a ; i > 0 ; i--)
        {
           f*=i; 
        }
        return f;
    }
    void cal()
    {
        for(int n = 1; n <= num; n++)
        {
            sum+=n*((Math.pow(x,(n*2)))/fact(n));
        }
        System.out.println("The final answer is "+sum);
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        
        series obj = new series();
        
        obj.input();
        obj.cal();
    }
}