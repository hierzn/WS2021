package Iteration;
import java.util.Scanner;

public class MinMaxSumOf4Of5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        int smallest = Integer.MAX_VALUE, biggest = 0;
        System.out.printf(": ");
        for (int i = 1; i <=5; i++) {
            num = sc.nextInt();
            if (num < smallest) {
                smallest = num;
            }
            if (num > biggest) {
                biggest = num;
            }
            sum+=num;
        }
        System.out.printf("minimum sum: %d\n", sum - biggest);
        System.out.printf("maximum sum: %d\n", sum - smallest);
    }
}