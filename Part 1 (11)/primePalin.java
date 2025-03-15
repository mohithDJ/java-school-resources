import java.util.*;
public class primePalin
{
    Scanner in = new Scanner (System.in);
    int num,temp;
    int z=2;
    int sum=1;
    void inputCheck()
    {
        System.out.println("Enter the number.");
        num=in.nextInt();
        if(rever(num) == num)
        {
            if(isPrime(num) == 1)
            {
                System.out.println("Entered number is a Prime&Palin_no number.");
            }
            else
            {
                System.out.println("Entered number is not a Prime&Palin_no number.");
            }
        }
        else
        {
            System.out.println("Entered number is not a Prime&Palin_no number.");
        }
    }
    int isPrime(int x)
    {
        if (z<x)
        {
            if (x%z == 0)
            {
                return 0;   
            }
            else
            {
                z++;return isPrime(x);
            }
        }
        else 
        {
        return 1;
        }
    }
    int rever(int x)
    {
        if (x>0)
        {
            sum=sum*10+x%10;
            return rever(x/10);
        }
        else 
            return sum;
    }
    public static void main (String args [] )
{
    primePalin ob = new primePalin();
    ob.inputCheck();
}
}