import java.util.*;
public class fibonacciNum
{
    Scanner in = new Scanner (System.in);
    int num1,num2;
    String sum="";
    String Fibonacci(int x,int y)
    {
        if(x<=y)
        {
            sum=(x+(x+1)) +" " ;
            return Fibonacci(x+1,y);
        }
        else
        {
            return sum;
        }
    }
    void somethin()
    {
        System.out.println("Enter the First Number!");
        num1=in.nextInt();
        System.out.println("Enter the Scecond Number!");
        num2=in.nextInt();
        
        System.out.println("Fibonacci Series:"+Fibonacci(num1,num2));
    }
    public static void main(String args[])
    {
        fibonacciNum ob = new fibonacciNum();
        ob.somethin();
    }
}