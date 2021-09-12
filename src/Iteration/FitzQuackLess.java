package Iteration;

import java.util.Scanner;

public class FitzQuackLess {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.printf("%d ", i);
            if (i % 10 == 0) {
                System.out.printf("\n");
            }

        }

    }
}
