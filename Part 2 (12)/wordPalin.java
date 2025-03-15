import java.util.*;
public class wordPalin
{
    Scanner in = new Scanner (System.in);
    static int len,flag=1,l;
    static String w;
    
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        wordPalin ob = new wordPalin();
        
        System.out.println("Enter the Word!");
        w=in.next();
        len=w.length();
        l=len;
        
        if(len%2==0)
        {
            ob.even();
        }
        else
        {
            ob.odd();
        }
    }
    
    void even()
    {
        for(int i=0;i<len/2;i++)
        {
            if(w.charAt(i)!=w.charAt(l-i-1))
            {
                flag=0;
                break;
            }
            else{
                l-=1;
            }
        }
        if(flag ==1)
        {
            System.out.println("Is Palindrome!");
        }
        else
        {
            System.out.println("Not An Palindrome!");
        }
    }
    void odd()
    {
        for(int i=0;i<len/2;i++)
        {
            if(w.charAt(i)!=w.charAt(l-i-1))
            {
                flag=0;
                break;
            }
            else{
                l-=1;
            }
        }
        if(flag ==1)
        {
            System.out.println("Is Palindrome!");
        }
        else
        {
            System.out.println("Not An Palindrome!");
        }
    }
}
