import java.util.*;
public class isDisariam
{
    Scanner in = new Scanner (System.in);
    int num,l,sum;
    String s;
    isDisariam()
    {
        num=0;l=0;sum=0;
        s=" ";
    }
    void input()
    {
        System.out.println("Enter the number.");
        num=in.nextInt();
        s=Integer.toString(num);
        l=s.length();
    }
    int disariam(int x)
    {
        if(x>0)
        {
            sum+=Math.pow(x%10,l--)+disariam(x/10);
        }
        else 
        {}
        return sum;
    }
    void check()
    {
        if(disariam(num) == num)
        {
                System.out.println("Entered Number Is A Disariam Number.");
        }
        else 
            System.out.println("Entered Number Is Not A Disariam Number.");
    }
    public static void main (String args [] )
    {
        isDisariam ob = new isDisariam();
        ob.input();
        ob.check();
    }
}