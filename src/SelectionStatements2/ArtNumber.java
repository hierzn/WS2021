package SelectionStatements2;

import java.util.Scanner;

public class ArtNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o1 = sc.nextInt();
        String artikel = "Falsche Eingabe";
        String blank = ": ";

        int ag = sc.nextInt();
        if (ag <= 0 || ag >= 4) {
            System.out.printf("%s%s", blank, artikel);
            System.exit(0);
        }
        blank += ": ";
        int ug = sc.nextInt();
        if ((ag == 1 && ug >= 4) || (ag == 2 && (ug >= 3 && !(ug == 9))) || (ag == 3 && (ug >= 2))) {
            System.out.printf("Falsche Eingabe");
            System.exit(0);
        }
        System.out.printf(": ");
        int article = sc.nextInt();
        if ((ag == 1 && article > 4) || (ag == 2 && article > 2) || (ag == 3 && article > 1)) {
            System.out.printf("Falsche Eingabe");
            System.exit(0);
        }

        if ((ag >= 1 && ag <= 3) || ((ug >= 1 && ug <= 3) || ug == 9) || (article >= 1 && article <= 4)) {
            if (ag == 1) {
                if (ug == 1) {
                    if (article == 1) {
                        System.out.printf("Bier (hell, 0,5)");
                    } else if (article == 2) {
                        System.out.printf("Bier (hell, 0,33)");
                    } else if (article == 3) {
                        System.out.printf("Zwickel (0,5)");
                    } else if (article == 4) {
                        System.out.printf("Zwickel (0,33)");
                    } else {
                        System.out.printf("Falsche Artikel");
                    }
                } else if (ug == 2) {
                    if (article == 1) {
                        System.out.printf("Cola");
                    } else if (article == 2) {
                        System.out.printf("Fanta");
                    } else {
                        System.out.printf("Falsche Artikel");
                    }
                } else {
                    if (article == 1) {
                        System.out.printf("Rotwein");
                    } else if (article == 2) {
                        System.out.printf("Weisser Spritzer");
                    } else {
                        System.out.printf("Falsche Artikel");
                    }
                }
            } else if (ag == 2) {
                if (ug == 1) {
                    if (article == 1) {
                        System.out.printf("Schnitzel");
                    } else if (article == 2) {
                        System.out.printf("Schweinsbraten");
                    } else {
                        System.out.printf("Falscher Artikel");
                    }
                } else if (ug == 2) {
                    System.out.printf("Frankfurter");
                } else if (ug == 9) {
                    System.out.printf("Ketchup");
                } else {
                    System.out.printf("Falsche Artikel");
                }
            } else if (ag == 3) {
                if (ug == 1) {
                    System.out.printf("Zigaretten");
                } else {
                    System.out.printf("Falsche Artikel");
                }
            } else {
                System.out.printf("Falsche Untergruppe");
            }
        } else {
            System.out.printf("Falsche Eingabe");
        }

        sc.close();


        System.out.printf("%s%s", blank, artikel);
    }
}


