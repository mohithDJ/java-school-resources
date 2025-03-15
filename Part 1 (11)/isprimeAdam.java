import java.util.*;
public class isprimeAdam
{
    Scanner in = new Scanner (System.in);
    int n;
    
    void input()
    {
        System.out.println("Enter the number.");
        n=in.nextInt();
    }
    
    void display()
    {
        
        System.out.println(isprime(n,2));
        System.out.println(n*n);
        System.out.println(rev(n*n,0));
    
        if((isprime(n,2) == 0) || (isprime(rev(n,0),2) != 0) || (n*n != rev(n*n,0))) 
        {
            System.out.println("Not a Prime Adam.");
        }
        else
        {
            System.out.println("It is a Prime Adam.");
        }
    }
    
    int rev(int x, int sum) {
    if (x > 0) {
        sum = sum * 10 + x % 10;
        return rev(x / 10, sum);
    } else
        return sum;
    }
    
    int isprime(int x, int z)
    {
        if(x>z)
        {
            if(x%z == 0)
            {
                return 0;
            }
            else
            {
                return isprime(x,z+1);
            }
        }
        else
        return 1;
    }

    public static void main(String [] args){
        isprimeAdam ob = new isprimeAdam();
        ob.input();
        ob.display();
    }
    
}