package Iteration;

import java.util.Scanner;


public class InputLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minindex = 0;
        int min= Integer.MAX_VALUE;
        int i=0;
        System.out.printf(": ");
        int loop = sc.nextInt();
        while (loop > 0) {

            System.out.printf(": ");
            i++;

            if(min>=loop) {
                min=loop;
                minindex=i;
                          }


            loop = sc.nextInt();

        }
        if(minindex==1)
        {
            System.out.printf("first\n");
        }
        if(minindex==i)
        {
            System.out.printf("last\n");
        }
        if(minindex>0) {
            System.out.printf("minIdx: %d\n", minindex);
        }
        System.out.printf("End.");

        sc.close();

    }

}
