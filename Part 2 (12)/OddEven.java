import java.util.*;

public class OddEven {
    Scanner in = new Scanner(System.in);
    int[] a, arr;
    int l, len;

    void input() {
        System.out.println("Enter the Size:");
        l = in.nextInt();
        a = new int[l];

        System.out.println("Enter the elements:");
        for (int i = 0; i < l; i++) {
            a[i] = in.nextInt();
        }
    }

    void merge(OddEven x, OddEven y) {
        len = x.l + y.l;
        arr = new int[len];

        int idx = 0;

        for (int i = 0; i < x.l; i++) {
            if (x.a[i] % 2 != 0) {
                arr[idx++] = x.a[i];
            }
        }

        for (int i = 0; i < y.l; i++) {
            if (y.a[i] % 2 != 0) {
                arr[idx++] = y.a[i];
            }
        }

        for (int i = 0; i < x.l; i++) {
            if (x.a[i] % 2 == 0) {
                arr[idx++] = x.a[i];
            }
        }

        for (int i = 0; i < y.l; i++) {
            if (y.a[i] % 2 == 0) {
                arr[idx++] = y.a[i];
            }
        }

        System.out.println("Merged array:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        OddEven ob1 = new OddEven();
        OddEven ob2 = new OddEven();
        OddEven ob = new OddEven();

        System.out.println("Enter elements for first array:");
        ob1.input();

        System.out.println("Enter elements for second array:");
        ob2.input();

        ob.merge(ob1, ob2);
    }
}
