package StudyB;

import java.util.Scanner;

public class zahlendreher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int pos1 = number / 100;
        int pos2 = (number % 100) / 10;
        int pos3 = number % 10;

        System.out.printf("Zahl: Ausgabe: %d%d%d", pos3, pos2, pos1);


    }

}
