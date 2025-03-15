import java.util.*;
public class special
{
    int n,temp;
    int flag,f=1;
    int sum =0;
    Scanner in = new Scanner (System.in);
    
    void input()
    {
        System.out.println("Enter the number.");
        n=in.nextInt();
        temp = n;
    }
    int fact(int a)
    {
        for(int i = a ; i > 0 ; i--)
        {
           f*=i; 
        }
        return f;
    }
    void cal()
    {
        while(n!=0)
        {
           sum+=fact(n%10);
           n/=10;
        }
        
        if (sum == temp)
        flag =1;
        else
        flag =0;
        
    }
    void display()
    {
        if(flag == 1)
        System.out.println("Entered number is a special number.");
        else
        System.out.println("Entered number is not a special number.");
    }
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        
        special obj= new special();
        
        obj.input();
        obj.cal();
        obj.display();
    }
}