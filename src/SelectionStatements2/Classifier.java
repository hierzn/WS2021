package SelectionStatements2;

import java.util.Scanner;

public class Classifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter price: ");
        int price = sc.nextInt();
        System.out.print("enter quality: ");
        int quality = sc.nextInt();
        if (price < 50 && quality < 50) {
            System.out.printf("low price\nlow quality\njunk");
        }
        if (price >= 50 && quality < 50) {
            System.out.printf("high price\nlow quality\nrip off");
        }
        if (price < 50 && quality >= 50) {
            System.out.printf("low price\nhigh quality\nbargain");
        }
        if (price >= 50 && quality >= 50) {
            System.out.printf("high price\nhigh quality\nluxury");
        }

    }
}
