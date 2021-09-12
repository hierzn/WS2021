package StudyB;

import java.util.Scanner;

public class TimeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long time = sc.nextLong();
        long ms = time % 1000;
        long seconds = time / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;


        System.out.printf("Welcome to the TimeCalculator!\n");
        System.out.printf("please enter a duration in milliseconds:%d ms are exactly: \n", time);
        System.out.printf("   days %d\n", days);
        System.out.printf("  hours %d\n", hours % 24);
        System.out.printf("minutes %d\n", minutes % 60);
        System.out.printf("seconds %d\n", seconds % 60);
        System.out.printf("     ms %d\n", ms);

    }
}
