package Variables;

import java.util.Scanner;

public class validGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade < 6 && grade > 0)
            if (grade == 5) {
                System.out.printf("you didn't pass!");
            } else {
                System.out.printf("you passed with a %d!", grade);
            }
        else {
            System.out.printf("input is invalid!");
        }
        //enter code here

    }

}
