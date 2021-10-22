package arrays;
import java.util.Scanner;

public class PartyHandshake {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int pers;
        pers=sc.nextInt();
        String [] names= readNames(pers);
        String [] handshakes=handShakes(names);
        print(handshakes);
        sc.close();
    }

    public static String[] readNames(int n)
    {
        String [] array = new String [n];
        Scanner sc = new Scanner(System.in);
        for(int  i=0; i<n;i++)
        {
            array[i]=sc.next();
        }
        return array;
    }

    public static String [] handShakes(String[] names)
    {
        String [] handShakes = new String [names.length*2];
        int n=0;
            for(int i=0;i<names.length;i++)
        {
            for(int k=i;k<names.length;k++) {
                if (i != k) {
                    handShakes[n] = names[i] + " -> " + names[k];
                n++;
                }
            }
        }
            return handShakes;

    }

    public static void print (String [] stra)
    {
        for(int i=0;i<stra.length;i++)
        {
            System.out.printf("%s\n",stra[i]);
        }
    }
}
