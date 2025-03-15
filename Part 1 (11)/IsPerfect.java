import java.util.*;
public class IsPerfect {
    Scanner in = new Scanner(System.in);
    int num, sum;
    IsPerfect() {
        num = 0;
        sum = 0;
    }
    void inputCheck() {
        System.out.println("Enter the number.");
        num = in.nextInt();
        if (perfect() == num) {
            System.out.println("Entered Number Is A Perfect Number.");
        } else {
            System.out.println("Entered Number Is Not A Perfect Number.");
        }
    }
    int perfect() {
        sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        IsPerfect ob = new IsPerfect();
        ob.inputCheck();
    }
}
