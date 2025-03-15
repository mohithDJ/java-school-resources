import java.util.Scanner;
public class isAmstrong
{
    int num,temp;String s;Scanner in = new Scanner (System.in);double sum=0.00;double l;
    void input()
    {
        System.out.println("Enter the number.");
        num=in.nextInt();
        temp=num;
        s=Integer.toString(num);
        l=s.length();
    }
    double amstrong(int x)
    {
        if(x>0)
        {
            sum=sum+Math.pow((x%10),l);
            return x/10;
        }
        else 
        return sum;
    }
    void check()
    {
        if( amstrong(num)==temp)
        {
            System.out.println("Is A Amstrong Number.");
        }
        else 
        {
            System.out.println("Is Not A Amstrong Number.");
        }
    }
    public static void main (String args[])
    {
        isAmstrong ob = new isAmstrong();
        ob.input();
        ob.check();
    }
}