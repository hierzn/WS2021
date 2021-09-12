package StudyB;

import java.util.Scanner;

public class CalculationsII {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int surface = length * length * 6;
        int volume = length * length * length;
        System.out.printf("Length of a side: Surface area: %d \nVolume: %d\n", surface, volume);
        sc.close();

        Scanner sc1 = new Scanner(System.in);
        int octal = sc1.nextInt();
        int firstnum = octal / 100;
        int secondnum = (octal / 10) % 10;
        int thirdnum = octal % 10;
        int dezimal = firstnum * 8 * 8 + secondnum * 8 + thirdnum;
        int dezimalsum = dezimal / 100 + (dezimal / 10) % 10 + dezimal % 10;
        System.out.printf("Oktalzahl eingeben: dezimal: %d\nZiffernsumme: %d", dezimal, dezimalsum);
        sc1.close();

    }
}


