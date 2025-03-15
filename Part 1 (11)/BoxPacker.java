import java.util.*;

public class BoxPacker {
    Scanner in = new Scanner(System.in);
    int n, cartons, foreig, twfo, tewll, six, lesix;

    BoxPacker() {
        n = 0;
        cartons = 0;
        foreig = 0;
        twfo = 0;
        tewll = 0;
        six = 0;
        lesix = 0;
    }

    void accept() {
        System.out.println("Enter the number of boxes: ");
        n = in.nextInt();
        if (n > 1000) {
            System.out.println("Number of boxes exceeds limit. Setting to 1000.");
            n = 1000;
        }
    }

    void packing() {
        while (n >= 48) {
            foreig += 1;
            n -= 48;
            cartons += 1;
        }
        while (n >= 24) {
            twfo += 1;
            n -= 24;
            cartons += 1;
        }
        while (n >= 12) {
            tewll += 1;
            n -= 12;
            cartons += 1;
        }
        while (n >= 6) {
            six += 1;
            n -= 6;
            cartons += 1;
        }
        if (n > 0) {
            lesix = n;
            cartons += 1;
        }
    }

    void display() {
        System.out.println("48 * " + foreig + " = " + 48 * foreig);
        System.out.println("24 * " + twfo + " = " + 24 * twfo);
        System.out.println("12 * " + tewll + " = " + 12 * tewll);
        System.out.println("6 * " + six + " = " + 6 * six);
        System.out.println("Remaining boxes = " + lesix);
        System.out.println("Total number of boxes = " + (48 * foreig + 24 * twfo + 12 * tewll + 6 * six + lesix));
        System.out.println("Total number of cartons = " + cartons);
    }

    public static void main(String args[]) {
        BoxPacker obj = new BoxPacker();
        obj.accept();
        obj.packing();
        obj.display();
    }
}
