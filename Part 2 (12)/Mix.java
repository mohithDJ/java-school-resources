import java.util.*;

public class Mix {
    Scanner in = new Scanner(System.in);
    String senti = "", sentii = "";
    String[] sent;
    int leni, lenii, len;

    void somethin() {
        System.out.println("Enter the first word!");
        senti = in.next();
        senti = senti.toUpperCase();
        leni = senti.length();

        System.out.println("Enter the second word!");
        sentii = in.next();
        sentii = sentii.toUpperCase(); 
        lenii = sentii.length();

        len = leni + lenii;

        String[] sent1 = new String[leni]; 
        String[] sent2 = new String[lenii]; 
        sent = new String[len];

        for (int i = 0; i < leni; i++)
        {
            sent1[i] = senti.charAt(i) + "";
        }
        for (int i = 0; i < lenii; i++)
        {
            sent2[i] = sentii.charAt(i) + "";
        }

        int index = 0; 

        for (int i = 0; i < Math.max(leni, lenii); i++) {
            if (i < leni)
            {
                sent[index++] = sent1[i];
            }
            if (i < lenii)
            {
                sent[index++] = sent2[i];
            }
        }

        System.out.println("Mix:");
        for (int i = 0; i < len; i++)
        {
            System.out.print(sent[i]);
        }
    }

    public static void main(String args[]) {
        Mix ob = new Mix();
        ob.somethin();
    }
}