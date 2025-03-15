import java.util.*;
public class isPronic
{
    Scanner in = new Scanner (System.in);
    int num,n1,n2,a;
    isPronic()
    {
        num=0;n1=0;n2=0;a=0;
}
    void inputCheck()
    {
    System.out.println("Enter the number.");
    num=in.nextInt();
    if(pronic (1,2,num) == 1)
    {
        System.out.println("Entered number is a pronic number.");
    }
    else
    {
        System.out.println("Entered number is not a pronic number.");
    }
}
int pronic(int n1,int n2, int num)
{
    if( (n1*n2) == num)
    {
        a=1;
    }
    else if( (n1*n2) > num)
    {
        a=0;
    }
    else
    {
        pronic (n2+1,n1+1,num);
    }
    return a;
}
public static void main (String args [] )
{
    isPronic ob = new isPronic();
    ob.inputCheck();
}
}