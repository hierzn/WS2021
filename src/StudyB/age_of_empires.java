package StudyB;

import java.util.Scanner;


public class age_of_empires {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alter = sc.nextInt();

        System.out.printf("Your age: %%d: ~%d~\n", alter);
        System.out.printf("%%+d: ~%+d~\n", alter);
        System.out.printf("%% d: ~% d~\n", alter);
        System.out.printf("%%5d: ~%5d~\n", alter);
        System.out.printf("%%05d: ~%05d~\n", alter);
        System.out.printf("%%-5d: ~%-5d~\n", alter);
        System.out.printf("%%#x: ~%#x~\n", alter);
    }
}
