import java.util.*;
public class perfectNum
{
    Scanner in = new Scanner (System.in);
    int num,sum;
    String s;
    int Perfect(int x)
    {
        if(num>x)
        {
            if(num%x == 0)
            {
                sum+=x;
                x+=1;
                
                Perfect (x);
            }
            else
            return Perfect(++x);
        }    
        return sum;
    }
    void somethin()
    {
        System.out.println("Enter the number!");
        num=in.nextInt();
       
        
        if(Perfect(1) == num )
        {
            System.out.println("Entered number is an Perfect Number!");
        }
        else
        System.out.println("Entered number is not an Perfect Number!");
    }
    public static void main (String args[])
    {
        perfectNum ob = new perfectNum();
        ob.somethin();
    }
}