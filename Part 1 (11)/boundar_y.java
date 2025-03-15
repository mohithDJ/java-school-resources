import java.util.*;
class boundar_y 
{
    int r, c;
    int[][] arr;
    Scanner in = new Scanner(System.in);
    
    void input()
    {
        System.out.println("Enter the number of rows.");
        r = in.nextInt();

        System.out.println("Enter the number of columns.");
        c = in.nextInt();
        arr = new int[r][c];

        System.out.println("Enter the elements.");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }
    void calulate()
    {
        System.out.println("Boundary Matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0||j==0||i==r-1||j==c-1)
                {
                    System.out.print(arr [i][j]);
                }
                else
                {
                    System.out.print(" ");
                }
                }
            System.out.println(" ");
            }
        
        System.out.println("Non-Boundary Matrix");  
        
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(i==0||j==0||i==r-1||j==c-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(arr [i][j]);
                }
                }
            System.out.println(" ");
            }
        }
    public static void main(String args [])
    {
        Scanner in = new Scanner (System.in);
        
        boundar_y obj = new boundar_y();
        
        obj.input();
        obj.calulate();
    }
    }