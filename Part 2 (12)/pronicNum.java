import java.util.*;
public class pronicNum
{
    Scanner in = new Scanner (System.in);
    int num;int x=1;int y=2;int flag=0;
    int Pronic(int x,int y)
    {
        if(x<=num/2)
        {
        if(x*(x+1) != num)
        {
            return Pronic(x+1,x+2);
        }
        else
            flag=x;
    }
    return flag;
}
    void somethin()
    {
        System.out.println("Enter the number!");
        num=in.nextInt();
        if(num==1 || num==0)
        {
            System.out.println("Entered Number is not an Pronic Number!");
        }
        else
        {
        if(flag == 0)
        {
            System.out.println("Entered Number is not an Pronic Number!");
        }
        else
        {
            System.out.println("Entered Number is an Pronic Number!"+"("+flag+","+(flag+1)+")");
        }
    }
}
    public static void main (String args[])
    {
        pronicNum ob = new pronicNum();
        ob.somethin();
    }
}