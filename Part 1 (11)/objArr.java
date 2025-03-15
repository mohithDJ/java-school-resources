import java.util.*;
public class objArr
{
    Scanner in = new Scanner (System.in);
    int arr[]=new int [5];int flag = 1;
    void input ()
    {
        System.out.println("Enter the array elements.");
        for (int i =0;i<5;i++)
        {
            arr[i]=in.nextInt();
        }
    }
    void check(objArr x,objArr y)
    {   
        for (int i=0;i<5;i++)
        {
            if(x.arr[i]!=y.arr[i])
            {
                flag =0;
                break;
            }
        }
    }
    void display()
    {
        if (flag==1)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not a equal");
        }
    }
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        objArr ob = new objArr ();
        objArr ob_0 = new objArr ();
        objArr ob_1 = new objArr ();
        ob_0.input();
        ob_1.input();
        ob.check(ob_0,ob_1);
        ob.display();
    }
    }