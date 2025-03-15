import java.util.*;
public class binTodec
{
    Scanner in = new Scanner (System.in);
    int num,len,bin,dec;
    String s;
    
    int decimal(String s)
    {
        if(len>=0)
        {
            dec+=Math.pow(Integer.parseInt(""+s.charAt(len)), (double)len);
            len-=1;
            return decimal(s);
        }
        else
        return dec;
    }
    
    void somethin()
    {
        System.out.println("Enter the Binary Number!");
        num=in.nextInt();
        
        s=Integer.toString(num);
        len=s.length();
        len-=1;
        
        System.out.println("Decimal Number:"+decimal(s));
    }
    
    public static void main(String args[])
    {
        binTodec ob = new binTodec ();
        ob.somethin();
    }
}