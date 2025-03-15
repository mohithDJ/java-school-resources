import java.util.*;
public class isMagic
{
    Scanner in = new Scanner (System.in);
    int num=0;int sum =0;int a=0;int b=0;
    void inputCheck()
    {
    System.out.println("Enter the number.");
    num=in.nextInt();
    b=magic(num);
    while(b>10)
    {
        b=magic(b);
    }
    if(b==1)
    {
        System.out.println("Entered number is a magic number.");
    }
    else
    {
        System.out.println("Entered number is not a magic number.");
    }
}
int magic(int x)
{
    if(x>0)
    {
        a= x%10;
        sum+=a + magic(x/10);
    }
    return sum;
}
public static void main (String args [] )
{
    isMagic ob = new isMagic();
    ob.inputCheck();
}
}