package SelectionStatements2;

import java.util.Scanner;

public class TimeFormatConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        String prefix;
        int hour = time / 100;
        int minute = time % 100;


        if (time < 2400 && time >= 0 && minute < 60) {

            prefix = (time >= 0 && time < 1200) ? "AM" : "PM";
            /*ist das selbe wie
            if (time >= 0 && time < 1200) {
                prefix = "AM";

            } else {
                prefix = "PM";
            }*/
            if (time < 100) {
                hour = 12;
            }
            if (hour > 12) {
                hour = hour - 12;
            }

            System.out.printf("Zeit: %02d:%02d %s\n", hour, minute, prefix);

        } else {
            System.out.printf("Zeit: Ungueltige Eingabe!\n");
        }
    }
}
