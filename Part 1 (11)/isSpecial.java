import java.util.*;
public class isSpecial
{
    Scanner in = new Scanner (System.in);
    int num,x,z;
    int flag =0;
    int temp;
    int sum_=0;
    int Fact(int z)
    {
        if (z>0)
        {
            return z*Fact(z-1);
        }
        else 
        return 1;
    }
    int check (int x)
    {
        if (x>0)
        {
        sum_=sum_+Fact(x%10);
        return check(x/10);
    }
    else 
    return sum_;
    }
    public static void main(String args [] )
    {
    Scanner in = new Scanner (System.in);int num,x,z;int flag =0;int temp;int sum=1;
    System.out.println("Enter the number.");
    num = in.nextInt();
    temp = num;
    isSpecial ob = new isSpecial();
    if (ob.check (num) == temp)
    {
        System.out.println("It is a Special number.");
    }
    else 
    System.out.println("It is not a Special number.");
    }
    
}