package StringsRegex;
import java.util.Locale;
import java.util.Scanner;

public class BeSprache {

    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String eingabe=sc.nextLine().toLowerCase();
        System.out.println(eingabe);
        System.out.printf("%s\n",eingabe.replaceAll("([aeiouäö])", "$1b$1"));
        sc.close();

    }
}
