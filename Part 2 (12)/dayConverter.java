import java.util.*;

public class dayConverter {
    Scanner in = new Scanner(System.in);
    int num, year, d, m;
    int[] date = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int[] dateleap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    dayConverter() {
        num = 0;
        year = 0;
        d = 0;
        m = 0;
    }

    void find() {
        if (num < 1 || num > 366) {
            d = -1;
            return;
        }

        int[] daysInMonth;
        if (year % 400 == 0) {
            daysInMonth = dateleap;
        } else {
            daysInMonth = date;
        }

        int monthIndex = 0;
        while (num > daysInMonth[monthIndex]) {
            num -= daysInMonth[monthIndex];
            monthIndex++;
            if (monthIndex >= 12) {
                monthIndex = 0;
                year++;
                if (year % 400 == 0) {
                    daysInMonth = dateleap;
                } else {
                    daysInMonth = date;
                }
            }
        }
        m = monthIndex + 1;
        d = num;
    }

    void somethin() {
        System.out.println("Enter a number:");
        num = in.nextInt();
        System.out.println("Enter the year:");
        year = in.nextInt();

        find();
        if (d == -1) {
            System.out.println("Invalid input!");
        } else {
            System.out.println("Date: " + d);
            System.out.println("Month: " + month[m - 1]);
            System.out.println("Year: " + year);
        }
    }

    public static void main(String args[]) {
        dayConverter ob = new dayConverter();
        ob.somethin();
    }
}
