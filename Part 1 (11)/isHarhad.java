import java.util.*;
public class isHarhad
{
    Scanner in = new Scanner (System.in);
    int num=0;int l =0;String s=" ";
    void inputCheck()
    {
    System.out.println("Enter the number.");
    num=in.nextInt();
    s=Integer.toString(num);
    l=s.length();
    if(num%l == 0)
    {
        System.out.println("Entered number is t a Harhad number.");
    }
    else
    {
        System.out.println("Entered number is not a Harhad number.");
    }
}
public static void main (String args [] )
{
    isHarhad ob = new isHarhad();
    ob.inputCheck();
}
}