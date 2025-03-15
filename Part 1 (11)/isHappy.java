import java.util.Scanner;
public class isHappy
{
double num,temp;Scanner in = new Scanner (System.in);double sum=0,a;
    void input()
    {
        System.out.println("Enter the Number.");
        num=in.nextInt();
        temp=num;
}
    double happy(double x)
    {
        if(x>0)
        {
            a= x%10;
            sum+=(a*a)+ happy(x/10);
        }
        return sum;
}
    void check()
    {
        if(happy(num) == 1)
        {
            System.out.println("Is A Happy Number.");
        }
        else 
        {
            System.out.println("Is Not A Happy Number.");
        }
}
    public static void main (String args [])
    {
        isHappy ob = new isHappy();
        ob.input();
        ob.check();
}
}