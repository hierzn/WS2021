package StringsRegex;
import java.util.Scanner;

public class KFZKennzeichen {

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String kfzPattern="[A-Z]{1,2}-[0-9]{1,5}[A-Z]{1}";
        String kennzeichen=sc.next();
        System.out.printf("%s",kennzeichen.matches(kfzPattern)?"valid!":"invalid!");
    }
}
