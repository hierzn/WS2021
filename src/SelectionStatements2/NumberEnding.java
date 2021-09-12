package SelectionStatements2;

import java.util.Scanner;

public class NumberEnding {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String ending;
        int rest = number % 10;
        int result = number / 10 % 10;

        if (result == 1) {
            ending = "th";
        } else if (rest == 1) {
            ending = "st";
        } else if (rest == 2) {
            ending = "nd";
        } else if (rest == 3) {
            ending = "rd";
        } else {
            ending = "th";
        }
        System.out.printf("%d%s", number, ending);
    }
}


