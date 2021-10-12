package arrays;
import java.util.Scanner;

public class MiniTest4 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int[] sequence;
        System.out.printf(": ");
        int start=sc.nextInt();
        System.out.printf(": ");
        int inkrement=sc.nextInt();
        System.out.printf(": ");
        int len=sc.nextInt();

        sequence = new int[len];
        for(int i =0;i<sequence.length;i++)
        {

            sequence[i]=start;
            start+=inkrement;
        }
        for(int i =0;i<sequence.length;i++)
        {
            System.out.printf("%d, ",sequence[i]);
        }
    }
}
