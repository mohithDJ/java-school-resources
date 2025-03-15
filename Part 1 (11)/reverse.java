import java.util.*;
public class reverse
{
    int rev(int x, int sum) {
    if (x > 0) {
        sum = sum * 10 + x % 10;
        return rev(x / 10, sum);
    } else
        return sum;
}

    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number.");
        int n=in.nextInt();
        reverse ob = new reverse();
        int a=ob.rev(n,0);
        System.out.println(a);
    }
}