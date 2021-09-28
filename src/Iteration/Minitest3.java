package Iteration;
import java.util.Locale;
import java.util.Scanner;

public class Minitest3 {

    public static void main (String [] args)
    {
        Locale.setDefault(new Locale("US","en"));
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int meglich=0;
        System.out.printf(": ");
        int j=1;
        while(j<=count)
        {
            System.out.printf("%d\n",j);
            j++;
        }
        if(count>=0) {
            for (int i = 1; i <= count; i++) {
                for(j=1;j<=count; j++) {
                    for(int k=1;k<=count;k++)
                    {
                        System.out.printf("i: %d j: %d k: %d\n", i,j,k);
                        meglich++;

                    }


                }

            }
            System.out.printf("Es gibt %d Möglichkeiten",meglich);
        }

        System.out.printf("done!");




    }
}
