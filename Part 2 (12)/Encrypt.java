import java.util.Scanner;

public class Encrypt {
    Scanner in = new Scanner(System.in);
    String sent;
    int len;
    char[] w;

    void somethin() {
        System.out.println("Enter the word.");
        sent = in.next();
        sent = sent.toUpperCase();
        len = sent.length();
        w = new char[len];

        for (int i = 0; i < len; i++) {
            char s = sent.charAt(i);

            if (s == 'A') {
                w[i] = 'E';
            } else if (s == 'E') {
                w[i] = 'I';
            } else if (s == 'I') {
                w[i] = 'O';
            } else if (s == 'O') {
                w[i] = 'U';
            } else if (s == 'U') {
                w[i] = 'A';
            } else {
                w[i] = s; 
            }
        }

        System.out.print("Encrypted word: ");
        for (int i = 0; i < len; i++) {
            System.out.print(w[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Encrypt encrypt = new Encrypt();
        encrypt.somethin();
    }
}
