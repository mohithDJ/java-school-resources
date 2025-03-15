import java.util.*;
public class rearrange
{
    Scanner in = new Scanner (System.in);
    String s,v[],c[];
    int len,vv,cc;
    rearrange()
    {
        len=0;vv=0;cc=0;
    }
    void rearr() {
        v = new String[len];
        c = new String[len];

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                v[vv] = String.valueOf(ch);
                vv++;
            }
            else
            {
                c[cc] = String.valueOf(ch);
                cc++;
            }
        }
    }

    void somethin()
    {
        rearrange ob = new rearrange();
        System.out.println("Enter the word!");
        s=in.next();
        s=s.toLowerCase();
        System.out.println("Rearranged one:-");
        for(int i=0;i<vv;i++)
        {
            System.out.print(v[i]+" ");
        }
        for(int i=0;i<cc;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
    public static void main(String args[])
    {
        rearrange ob = new rearrange();
        ob.somethin();
    }
}