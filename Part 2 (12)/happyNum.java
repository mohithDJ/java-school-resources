import java.util.*;
public class happyNum
{
    Scanner in = new Scanner (System.in);
    int num;
    int sum=0;
    int happy(int x)
    {
        if(x>0)
        {
            sum=(int) Math.pow(x%10,2)+ happy(x/10);
        }
        return sum;
    }
    void somethin()
    {
        System.out.println("Enter the number.");
        num=in.nextInt();
        
        if(happy(num)==1)
        {
            System.out.println("Entered number is an happy number!");
        }
        else
        System.out.println("Entered number is not an happy number!");
    }
    public static void main(String args[])
    {
        happyNum ob = new happyNum();
        ob.somethin();
    }
}