import java.util.*;

public class Replace {
    int r, c;
    int arr[][];

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

    void cal() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = '#';
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || j == 0 || i == r - 1 || j == c - 1) {
                    arr[i][j] = '@';
                }
                if ((i == 0 && j == 0) || (i == r - 1 && j == c - 1) || (i == 0 && j == c - 1) || (i == r - 1 && j == 0)) {
                    arr[i][j] = '%';
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((char) arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Replace obj = new Replace();
        obj.input();
        obj.cal();
    }
}
