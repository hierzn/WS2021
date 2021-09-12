package Iteration;

import java.util.Scanner;

public class CountDown {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        int counter = sc.nextInt();
        if (counter >= 0) {
            for (int i = counter; i > 0; i--) {
                System.out.printf("%d\n", i);
            }
            System.out.printf("Boom!");

        } else {
            System.out.printf("Ungültige Eingabe");
        }
    }


}
