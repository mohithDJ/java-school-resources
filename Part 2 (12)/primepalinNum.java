import java.util.*;
public class primepalinNum
{
    Scanner in = new Scanner (System.in);
    int num;
    
    int rev(int x,int sum)
    {
        if(x>0)
        {
            sum*=10+x%10;
            return rev(x/10,sum);
        }
        else
        {
            return sum;
        }
    }
    int prime(int x,int z)
    {
        if(x>z)
        {
            if(x%z==0)
            {
                return 0;
            }
            else
            {
                z+=1;
                return prime(x,z);
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
        
        if( prime(num,2)==1)
        {
            if(rev(num,0)==num)
            {
                System.out.println("Entered number is an Prime Palindrome Number!");
            }else
            {
                System.out.println("Entered number is not an Prime Palindrome Number!");
            }
        }
        else
        {
            System.out.println("Entered number is not an Prime Palindrome Number!");
        }
    }
    public static void main(String args[])
    {
    primepalinNum ob = new  primepalinNum();
    ob.somethin();
    }
}