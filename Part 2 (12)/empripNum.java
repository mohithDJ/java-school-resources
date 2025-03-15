import java.util.*;
public class empripNum
{
    Scanner in = new Scanner(System.in);
    int num;
    
    int rev(int x,int sum)
    {
        if(x>0)
        {
            sum*=10+(x%10);
            rev( (x/10) , sum);
        }
        return sum;
    }
    
    int isprime(int x,int z)
    {
        if(x>z)
        {
            if(x%z == 0)
            {
                return 0;
            }
            else
            {
                z+=1;
                return isprime(x,z);
            }
        }
        else
        {
            return 1;
        }
    }
    void somethin()
    {
        System.out.println("Enter the number!");
        num=in.nextInt();
        
        if( isprime(num,2) == 1 && isprime( rev(num,0) ,2) ==1)
        {
            System.out.println("Entered Number is an Emprip Number!");
        }
        else
        {
            System.out.println("Entered Number is not an Emprip Number!");
        }
    }
    public static void main (String args [])
    {
         empripNum ob = new empripNum();
         ob.somethin();
    }
}