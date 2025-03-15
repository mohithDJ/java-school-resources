import java.util.*;
public class harshadNum
{
    Scanner in = new Scanner (System.in);
    int num;
    int sum=0;
    int Harshad(int x)
    {
        if (x>9)
        {
            sum+=x%10;
            return Harshad(x/10);
        }
        else
        {
            return sum;
        }
    }
    void somethin()
    {
        System.out.println("Enter the number!");
        num=in.nextInt();
        
        if(num%Harshad(num)==0)
        {
            System.out.println("Entered Number is an Harshad Number!");
        }
        else
        {
            System.out.println("Entered Number is not an Harshad Number!");
        }
    }
    public static void main(String args[])
    {
        harshadNum ob = new harshadNum();
        ob.somethin();
    }
}