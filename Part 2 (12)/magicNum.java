import java.util.*;
public class magicNum
{
    Scanner in = new Scanner (System.in);
    int num;
    int sum=0;
    int magic(int x)
    {
        if (x>9)
        {
            sum+=x%10;
            return magic(x/10);
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
        
        if(magic(num) == 1)
        {
            System.out.println("Entered Number is an Magic Number!");
        }
        else
        {
            System.out.println("Entered Number is not an Magic Number!");
        }
    }
    public static void main(String args[])
    {
        magicNum ob = new magicNum();
        ob.somethin();
    }
}