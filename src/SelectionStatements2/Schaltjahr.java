package SelectionStatements2;

import java.util.Scanner;

public class Schaltjahr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Bitte Jahr eingeben: ");
        int jahr = sc.nextInt();
        if (jahr % 4 == 0) {

            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                    System.out.printf("Das Jahr %d ist ein Schaltjahr.", jahr);
                } else {
                    System.out.printf("Das Jahr %d ist kein Schaltjahr.", jahr);
                }
            } else {
                System.out.printf("Das Jahr %d ist ein Schaltjahr.", jahr);
            }

        } else {
            System.out.printf("Das Jahr %d ist kein Schaltjahr.", jahr);
        }
    }
}
