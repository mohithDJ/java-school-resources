import java.util.*;
public class decTobin
{
    Scanner in = new Scanner (System.in);
    int num,decimal,len;
    String s;
    
    String binary(int dec)
    {
        if(dec>1)
        {
            if(dec%2 == 0)
            {
                s+=0;
                return binary(dec/2);
            }
            else
            {
                s+=1;
                return binary(dec/2);
            }
        }
        
        if(dec == 1)
        {
            s+=1;
            return s;
        }
        
        else
        {
            return s;
        }
    }
    
    void somethin()
    {
        System.out.println("Enter the Decimal Number!");
        num=in.nextInt();
        
        System.out.println("Binary Number:"+binary(num));
    }
}
