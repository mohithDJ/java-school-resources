import java.util.*;
public class Capital
{
    Scanner in = new Scanner (System.in);
    String sentence="",s="";
    String uncap[],cap[];
    int len=0,k=0,c=0,uc=0;
    void somethin()
    {
        Capital ob = new Capital();
        
        System.out.println("Enter the Sentence!");
        sentence=in.next();
        len=sentence.length();
        
        cap=new String [len];
        uncap=new String [len];
        
        for(int i=0;i<len;i++)
        {
            if(sentence.charAt(i)==' ')
            {
                s=sentence.substring(k,i);
                check(s);
            }
            k=i+1;
        }
        
        System.out.println("Capital:"+c);
        for(int i=0;i<c;i++)
        {
            System.out.println(cap[i]);
        }
        
        System.out.println("Uncapital:"+c);
        for(int i=0;i<uc;i++)
        {
            System.out.println(uncap[i]);
        }
    }
    void check(String s)
    {
        if(((int)s.charAt(0) >= 65) || ((int)s.charAt(0) <= 90))
        {
            cap[c]=s;
            c+=1;
        }
        else
        {
            uncap[uc]=s;
            uc+=1;
        }
    }
    public static void main (String args[])
    {
        Capital ob = new Capital();
        ob.somethin();
    }
}
