import java.util.*;
public class specialNum
{
    Scanner in = new Scanner (System.in);
    int sum,num,len,sumeee;String s;
    void somethin()
    {
        System.out.println("Enter the number.");
        num=in.nextInt();
        s=Integer.toString(num);
        len=s.length();
        
        for(int i=0;i<len;i++)
        {
            sum=1;
            sumeee+=fact(num%10);
            num/=10;
        }
        System.out.println("Spiecal Number ="+sumeee);
    }
    int fact(int x)
    {
        if(x>0)
        {
            sum=x*fact(x-1);
        }
        return sum;
    }
    public static void main (String args[])
    {
        specialNum ob = new specialNum();
        ob.somethin();
        
    }
}