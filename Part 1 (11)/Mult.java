import java.util.*;

class Mult {
    int r, c;

    int a_0[][];
    int a_1[][];
    int a_2[][];

    Scanner in = new Scanner(System.in);

    void input() {
        System.out.println("Enter the number of rows and columns.");
        r = in.nextInt();
        c = in.nextInt();

        a_1 = new int[r][c];
        a_2 = new int[r][c];

        System.out.println("Enter the first array elements.");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a_1[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter the second array elements.");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a_2[i][j] = in.nextInt();
            }
        }
    }

    void cal() {
        a_0 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < c; k++) {
                    a_0[i][j] += a_1[i][k] * a_2[k][j];
                }
            }
        }
    }

    void display() {
        System.out.println("Result:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a_0[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Mult obj = new Mult();
        obj.input();
        obj.cal();
        obj.display();
    }
}