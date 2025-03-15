import java.util.*;

public class primeAdam {
    Scanner in = new Scanner(System.in);
    int m, n, freq;
    static int flag;

    primeAdam() {
        m = 0;
        n = 0;
        flag = 1;
        freq = 0;
    }

    void input() {
        System.out.println("Enter the first number.");
        m = in.nextInt();

        System.out.println("Enter the second number.");
        n = in.nextInt();

        if (m > n) {
            flag = 0;
        }
    }

    int isprime(int x, int z) {
        if (z * z > x)
            return 1;
        if (x % z == 0)
            return 0;
        return isprime(x, z + 1);
    }

    int rev(int x, int sum) {
        if (x > 0) {
            sum = sum * 10 + x % 10;
            return rev(x / 10, sum);
        } else
            return sum;
    }

    int isPrimeAdam(int x) {
        if (isprime(x, 2) == 1 && x * x == rev(x, 0) * rev(x, 0)) {
            return x;
        } else
            return 0;
    }

    void display() {
        System.out.println("THE PRIME-ADAM NUMBERS BETWEEN " + m + " AND " + n + " ARE:");
        for (int i = m; i <= n; i++) {
            if (isPrimeAdam(i) == i) {
                System.out.print(i + " ");
                freq += 1;
            }
        }
        System.out.println();
        System.out.println("THE FREQUENCY OF PRIME-ADAM NUMBERS BETWEEN " + m + " AND " + n + " ARE:" + freq);
    }

    public static void main(String args[]) {
        primeAdam obj = new primeAdam();
        obj.input();
        if (flag == 1) {
            obj.display();
        } else {
            System.out.println("INVALID INPUT!!!");
        }
    }
}
