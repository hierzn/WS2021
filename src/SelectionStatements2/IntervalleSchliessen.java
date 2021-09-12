package SelectionStatements2;

import java.util.Scanner;

public class IntervalleSchliessen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int interval1begin, interval2begin, interval1end, interval2end, openinter, closeinter;
        System.out.printf("Grenze 1: ");
        int i1g1 = sc.nextInt();
        System.out.printf("Grenze 2: ");
        int i1g2 = sc.nextInt();
        System.out.printf("Grenze 1: ");
        int i2g1 = sc.nextInt();
        System.out.printf("Grenze 2: ");
        int i2g2 = sc.nextInt();
        if (i1g1 < i1g2) {
            interval1begin = i1g1;
            interval1end = i1g2;
        } else {
            interval1begin = i1g2;
            interval1end = i1g1;
        }
        if (i2g1 < i2g2) {
            interval2begin = i2g1;
            interval2end = i2g2;
        } else {
            interval2begin = i2g2;
            interval2end = i2g1;
        }
        if (interval1begin < interval2begin) {
            openinter = interval1begin;
        } else {
            openinter = interval2begin;
        }
        if (interval1end < interval2end) {
            closeinter = interval2end;
        } else {
            closeinter = interval1end;
        }

        System.out.printf("Intervall 1: [%d, %d]\n", interval1begin, interval1end);
        System.out.printf("Intervall 2: [%d, %d]\n", interval2begin, interval2end);
        System.out.printf("geschlossenes Intervall: [%d, %d]\n", openinter, closeinter);
        sc.close();

    }
}
