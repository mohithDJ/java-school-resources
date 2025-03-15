import java.util.*;
public class adder
{
    Scanner in = new Scanner (System.in);
    int a [] = new int [2];
    int x,y,sumin,sumhr;
    
    void readtime()
    {
        System.out.println("Enter hour.");
        x=in.nextInt();
        System.out.println("Enter minute.");
        y=in.nextInt();
        
        a[0]=x;a[1]=y;
    }
    void addtime(adder x,adder y)
    {
        sumhr=x.a[0]+y.a[0];
        sumin=x.a[1]+y.a[1];
        
        if (sumin >= 60)
        {
            sumhr++;
            sumin-=60;
        }
    }
    void display()
    {
        System.out.println("Total time ="+sumhr+":"+sumin);
    }
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        
        adder obj = new adder();
        adder obj_0 = new adder();
        adder obj_1 = new adder();
        
        obj_0.readtime();
        obj_1.readtime();
        obj.addtime(obj_0,obj_1);
        obj.display();
    }
}