package Iteration;
import java.util.Scanner;

public class Diagonale {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia = 0;

        int max;
        while (dia % 2 == 0 || dia < 1) {
            dia = sc.nextInt();
            System.out.printf(": \n");
        }
        max = dia;
        for (int i = 0; i < dia; i++) {
            int min = 0;
            for (int k = 0; k<dia; k++) {
                if(min==max) {
                     max--;
                    System.out.printf("-");
                    continue;
                }
                if (i == min) {
                    System.out.printf("*");
                    min++;
                    continue;
                } else {
                    min++;
                }
                if (k == max-1) {
                    System.out.printf("*");
                    max--;
                    continue;
                }
                System.out.printf("-");
            }
            System.out.printf("\n");

        }
    }

}