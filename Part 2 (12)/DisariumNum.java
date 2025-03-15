import java.util.*;
public class DisariumNum
{
    Scanner in = new Scanner (System.in);
    int num,len,sum;
    String s;
    int Disarium(int x)
    {
        if(x>0)
        {
            sum+=Math.pow((x%10),len);len-=1;
            Disarium (x/10);
        }
        return sum;
    }
    void somethin()
    {
        System.out.println("Enter the number!");
        num=in.nextInt();
        s=Integer.toString(num);
        len=s.length();
        
        if( Disarium(num) == num )
        {
            System.out.println("Entered number is an Disarium Number!");
        }
        else
        System.out.println("Entered number is not an Disarium Number!");
    }
    public static void main (String args[])
    {
        DisariumNum ob = new DisariumNum();
        ob.somethin();
    }
}