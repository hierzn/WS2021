package Iteration;
import java.util.Scanner;

public class Zwischentest1 {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nLaufenintervall eingeben: "); //eingabe des Laufintervalls
        int laufen = sc.nextInt();
        while(laufen<=0) //wiederholte eingabe des Laufintervalls wenn 0 oder negative zahl
        {
            System.out.printf("\nLaufenintervall eingeben: ");
            laufen=sc.nextInt();

        }
        System.out.printf("\nGehenintervall eingeben: ");//wiederholte eingabe des gehenintervalls wenn 0 oder negative zahl
        int gehen = sc.nextInt();
        while(gehen<=0)
        {
            System.out.printf("\nGehenintervall eingeben: ");
            gehen = sc.nextInt();
        }
        System.out.printf("\nMinuten eingeben: ");
        int minuten=sc.nextInt();


        while(minuten>0)
        {
            int trainingsphase=minuten%(gehen+laufen+1); //Berechnungs der trainingsphase
            if (trainingsphase<=laufen) //wenn die trainingsphase <= des laufenintervalls dann laufen wir
            {
              System.out.printf("laufen\n");
            }
            else if (trainingsphase>laufen) //wenn die trainingsphase > laufen ist gehen
            {
                System.out.printf("gehen\n");
            }
            minuten=sc.nextInt();

        }
        System.out.printf("ende.");

    }
}
