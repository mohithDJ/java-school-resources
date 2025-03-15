import java.util.*;
public class VowSort
{
    Scanner in = new Scanner(System.in);
    String str,st;
    int len,size,vsz,csz,o,l,lsz;
    String sent [];    
    String vow [];
    String cons [];
    String last [];
    
    VowSort(int sentsz,int vowsz,int conssz,int lastsz)
    {
        str="";len=0;size=0;o=0;l=0;lsz=0;vsz=0;csz=0;st="";
        sent=new String [sentsz];
        vow=new String [vowsz];
        cons=new String [conssz];
        last=new String [lastsz];
    }
    
    void accept()
    {
        System.out.println("Enter the sentence.");
        str=in.nextLine();
        len=str.length();
        if( (str.charAt(len-1)!='.') && (str.charAt(len-1)!='!') && (str.charAt(len-1)!='?') )
        {   
            System.out.println("Renter the sentence (terminated by either '.', '?' or '!' only) .");
            st=in.nextLine();
            str=st;
            str=str.toUpperCase();
        }
        else
        {
            str=str.toUpperCase();
        }
    }
    
    void spilt()
    {
        int j=0;
        for(int i=0;i<len;i++)
        {
            if( str.charAt(i)==' ' )
            {
                sent [size++]=str.substring(j,i);
                j=i;
            }
        }
        
        for(int i=0;i<size;i++)
        {
            vowOrcons(sent[i]);
        }
        last=new String [size];
    }
    
    void vowOrcons(String x)
    {
        o=x.length()-1;
        if(x.charAt(0)=='A' || x.charAt(0)=='E' || x.charAt(0)=='I' ||x.charAt(0)=='O'||x.charAt(0)=='U')
        {
            vow [vsz++]=x;
        }
        else if (x.charAt(o)=='A' || x.charAt(o)=='E' || x.charAt(o)=='I' ||x.charAt(o)=='O'||x.charAt(o)=='U')
        {
            vow [vsz++]=x;
        }
        else
        {
            cons [csz++]=x;
        }
    }
    
    void arranage()
    {
        for(int i=0;i<vsz;i++)
        {
            last[i]=vow[i];
        }
        for(int i=0;i<csz;i++)
        {
            last[vsz++]=cons[i];
        }
    }
    
    void display()
    {
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = "+vsz);
        System.out.println("REARRANGED SENTANCE:");
        System.out.println("");
        for(int i=0;i<size;i++)
        {
            System.out.print(last [i]+" ");
        }
    }
    
    public static void main(String args[])
    {
        VowSort obj = new VowSort(100,100,100,100);
        obj.accept();
        obj.spilt();
        obj.arranage();
        obj.display();
    }
    }