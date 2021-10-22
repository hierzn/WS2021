package arrays;
import java.util.Scanner;

public class HundredDoors {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int doors;

        System.out.printf(": ");
        doors=sc.nextInt();
        boolean [] array = new boolean[doors+1];


        for(int i=1;i<=array.length;i++)
        { for(int j=i;j<array.length;j+=i)
            {
                array[j]=!array[j];
            }
        }
        for(int i=0;i<array.length;i++)
        {
            if(array[i])
            {
                System.out.printf("%d ",i);
            }
        }


    }

}
