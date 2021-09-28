package Iteration;
import java.util.Scanner;

public class NeatMultTable {

    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter rows: ");
        int rows = sc.nextInt();
        System.out.printf("enter columns: ");
        int columns=sc.nextInt();
        sc.close();


        System.out.printf("\n     ");
        for(int i=1;i<=columns;i++){
            System.out.printf("%2d ",i);
            }
        System.out.printf("\n----");
        for(int k=0;k<columns;k++) {
            System.out.printf("---");
        }
        System.out.println();

        for(int i=1;i<=rows;i++)
        {
            System.out.printf("%2d | ",i);
            for(int k=1;k<=columns;k++)
            {
                System.out.printf("%2d ",i*k);
            }
            System.out.println();
        }
    }
}
