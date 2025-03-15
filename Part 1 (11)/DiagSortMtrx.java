import java.util.*;
public class DiagSortMtrx
{
    Scanner in = new Scanner(System.in);
    int m,n;
    int mat[] [];
    int mat1[] [];
    int diagSum;
    
    DiagSortMtrx()
    {
        m=0;
        n=0;
        diagSum=0;
    }
    void accept()
    {
        System.out.println("Enter the size of the matrix.");
        m=in.nextInt();
        if( (m>3) && (m<10) )
        {
            n=m;
        }
        else
        {
            System.out.println("INVALUED INPUT!!! \t REENTER THE VALUE!!!");
            n=in.nextInt();
            m=n;
        }
        mat=new int [m][n];
        mat1=new int [m][n];
        System.out.println("Enter the elements.");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }
    }
    void diag()
    {
        int k=0;
        int y= m-1;
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                k=(i+j);
                if(i==j)
                {
                    mat1[i][j]=mat[i][j];
                    diagSum+=mat[i][j]; 
                }
                else if(k==y)
                {
                    mat1[i][j]=mat[i][j];
                    diagSum+=mat[i][j]; 
                }
            }
        }
    }
    void display()
    {
        DiagSortMtrx obj = new DiagSortMtrx();
        System.out.println("ORIGINAL MATRIX");
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("REARRANGED MATRIX");
        Arrays.sort(mat1);
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<m;j++)
            {
                System.out.print(mat1[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("DIAGONAL ELEMENTS");
        obj.diag();
        
        System.out.println("SUM OF THE DIAGONAL ELEMENTS = "+diagSum);
    }
    public static void main(String args[])
    {
        DiagSortMtrx ob = new DiagSortMtrx();
        ob.accept();
        ob.display();
    }
    }