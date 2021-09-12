package StudyB;

import java.util.Scanner;

public class Swapper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter first number (a): ");
        int zahl1 = sc.nextInt();
        System.out.printf("enter second number (b): ");
        int zahl2 = sc.nextInt();
        sc.close();
        System.out.printf("a=%d, b=%d\n", zahl1, zahl2);
        System.out.printf("swapped: \n");
        System.out.printf("a=%d, b=%d", zahl2, zahl1);

    }
}
