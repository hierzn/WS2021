package SelectionStatements2;

import java.util.Scanner;

public class Milch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shaltbar = "";
        System.out.printf("Fettgehalt: ");
        int fett = sc.nextInt();
        System.out.printf("Haltbar: ");
        int haltbar = sc.nextInt();
        if (fett < 0 || (haltbar != 0 && haltbar != 1)) {
            System.out.println("Ungültig!");
        } else {
            String sHaltbar = "frisch";
            if (haltbar == 1) {
                sHaltbar = "haltbar";
            }

            if (fett < 3) {
                System.out.printf("Leichtmilch (%s)", sHaltbar);
            } else if (fett > 7) {
                System.out.printf("Extravollmilch (%s)", sHaltbar);
            } else {
                System.out.printf("Normalmilch (%s)", sHaltbar);
            }
        }

        sc.close();
    }
}
