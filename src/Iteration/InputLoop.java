package Iteration;

import java.util.Scanner;


public class InputLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while (loop > 0) {
            loop = sc.nextInt();
            System.out.printf(": ");
        }
        System.out.printf(": End.");


        sc.close();

    }

}
