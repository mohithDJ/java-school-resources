import java.util.*;
public class amstrongNum
{
    Scanner in = new Scanner (System.in);
    int num,len,sum;
    String s;
    int amstrong(int x)
    {
        if(x>0)
        {
            sum+=Math.pow((x%10),len);
            amstrong (x/10);
        }
        return sum;
    }
    void somethin()
    {
        System.out.println("Enter the number!");
        num=in.nextInt();
        s=Integer.toString(num);
        len=s.length();
        
        if( amstrong(num) == num )
        {
            System.out.println("Entered number is an Amstrong Number!");
        }
        else
        System.out.println("Entered number is not an Amstrong Number!");
    }
    public static void main (String args[])
    {
        amstrongNum ob = new amstrongNum();
        ob.somethin();
    }
}