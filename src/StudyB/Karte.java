package StudyB;

import java.util.Scanner;

public class Karte {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();

        System.out.printf("Eingabe: ---------------\n");
        System.out.printf("| %-3d     %3d |\n", zahl, zahl);
        System.out.printf("| \\         / |\n");
        System.out.printf("|  \\       /  |\n");
        System.out.printf("|   \\     /   |\n");
        System.out.printf("|    \\   /    |\n");
        System.out.printf("|     \\ /     |\n");
        System.out.printf("|      X      |\n");
        System.out.printf("|     / \\     |\n");
        System.out.printf("|    /   \\    |\n");
        System.out.printf("|   /     \\   |\n");
        System.out.printf("|  /       \\  |\n");
        System.out.printf("| /         \\ |\n");
        System.out.printf("| %+-4d   %+4d |\n", zahl, zahl);
        System.out.printf("---------------");

        sc.close();

    }
}
