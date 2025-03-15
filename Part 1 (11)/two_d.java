import java.util.Scanner;
public class two_d {
    int r, c;
    int[][] arr;
    Scanner in = new Scanner(System.in);

    
    void input() {
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

    void display() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print( arr[i][j] );
            }
            System.out.println(" ");
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        two_d obj = new two_d();

        obj.input();
        obj.display();
    }
}