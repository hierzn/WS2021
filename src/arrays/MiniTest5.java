package arrays;

import java.util.Scanner;

public class MiniTest5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 55, -4, 0, 3, 22};

        int scale = sc.nextInt();

        scaleArray(arr, scale);

        print(arr);

        sc.close();
    }

    private static void print(int[] arr) {
        for (int e : arr)
            System.out.printf("%d ", e);
    }

    //insert scaleArray function here
    public static void scaleArray(int[] array, int scale) {
        for (int i=0; i<array.length;i++) {
            array[i] *= scale;
        }
    }

}


