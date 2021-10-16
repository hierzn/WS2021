package arrays;
import java.util.Scanner;

public class InversionCount {

    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int [] array1, array2, array3;

        int i;

        i=sc.nextInt();
        array1= new int [i];
        array2 = new int [i];

        int inversion=0;

        for(int k=0;k<i;k++)
        {
            array1[k]=sc.nextInt();
        }

        for(int j=0;j<i-1;j++)
        {
            int sumup=0;
            for(int k=j+1;k<i;k++)
            {
                if(array1[j]>array1[k])
                {
                    sumup++;
                }

            }
            array2[j]=sumup;
        }
        for(int k=0;k<i;k++)
        {inversion+=array2[k];
        }
        System.out.printf("%2d inversions.\n",inversion);
        for(int k=0;k<i;k++) {
            System.out.printf("%2d ", array1[k]);
        }
        System.out.println();
        for(int k=0;k<i;k++) {
            System.out.printf("%2d ", array2[k]);
        }

    }
}
