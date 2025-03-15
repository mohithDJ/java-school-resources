import java.util.*;

public class shift {
    Scanner in = new Scanner(System.in);
    static int[][] mat0, mat;
    static int m = 0, n = 0;

    void somethin() {
        System.out.println("Enter the size of the array (row then col):");
        m = in.nextInt();
        n = in.nextInt();
        mat = new int[m][n];
        mat0 = new int[m][n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                mat0[i][j] = in.nextInt();
            }
        }
    }

    void shiftDis() {
        int a = 0;
        for (int i = m - 1; i > 0; i--) 
        { 
            for (int j = 0; j < n; j++) 
            {
                mat[a][j] = mat0[i][j];
            }
            a++;
        }

        System.out.println("Shifted Matrix:");
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        shift ob = new shift();
        ob.somethin();
        if (m > 5 || n > 5)
        {
            System.out.println("INVALID INPUT!");
        } else 
        {
            ob.shiftDis();
        }
    }
}