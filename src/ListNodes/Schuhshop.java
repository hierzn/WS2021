package ListNodes;

import javax.sound.sampled.Port;
import java.util.Scanner;

public class Schuhshop {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Schuhmodell[] produktkatalog = new Schuhmodell[100];
        Kunde[] kundenkartei = new Kunde[100];
        Schuhmodell[] verkaufteSchuhe = new Schuhmodell[100];
        System.out.println("Willkommen im Schuhshop!");
        while (true) {
            System.out.println("Operationscodes: \n"
                    + "1 Neues Modell hinzufügen \n"
                    + "2 Neuen Kunden hinzufügen \n"
                    + "3 Produktkatalog anzeigen \n"
                    + "4 Kundenkartei anzeigen \n"
                    + "5 Schuh verkaufen \n"
                    + "6 Bisherige Tageseinnahmen \n"
                    + "7 Besten Kunden anzeigen \n"
                    + "0 Programm beenden");
            int operation = Integer.parseInt(sc.nextLine());
            switch (operation) {
                case 1:
                    System.out.println("Modell hinzufügen");
                    System.out.println("Modellname:");
                    String modellname = sc.nextLine();
                    System.out.println("Hersteller:");
                    String hersteller = sc.nextLine();
                    System.out.println("Preis:");
                    float preis = Float.parseFloat(sc.nextLine());
                    modellHinzufuegen(produktkatalog, modellname,
                            hersteller, preis);
                    break;
                case 2:
                    System.out.printf("Kunde Hinzufügen\n");
                    System.out.printf("Name: ");
                    String name = sc.nextLine();
                    kundeHinzufuegen(kundenkartei, name);
                    break;
                case 3:
                    print(produktkatalog);
                    break;
                case 4:
                    print(kundenkartei);
                    break;
                case 5:

                case 0:
                    sc.close();
                    return;
            }
        }
    }


    private static Schuhmodell createSchuhmodell(String modell, String hersteller, float preis)
    {
        Schuhmodell schuh = new Schuhmodell();
        schuh.modell=modell;
        schuh.herstellermarke=hersteller;
        schuh.preis=preis;
        return schuh;
    }
    private static Kunde createKunde(String name)
    {
        Kunde k = new Kunde();
        k.name=name;
        return k;
    }

    private static void modellHinzufuegen(Schuhmodell[] produktkatalog, String modellname, String hersteller, float preis)
    {
        Schuhmodell s= createSchuhmodell(modellname,hersteller,preis);
        for (int i=0;i<produktkatalog.length;i++)
        {
            if(produktkatalog[i]==null)
            {
                produktkatalog[i]=createSchuhmodell(modellname,hersteller,preis);
                break;
            }
        }
    }

    private static void kundeHinzufuegen(Kunde [] kundenkartei, String name)
    {
        Kunde k = createKunde(name);
        for (int i=0;i<kundenkartei.length;i++)
        {
            if(kundenkartei[i]==null)
            {
                kundenkartei[i]=createKunde(name);
                break;
            }
        }

    }

    private static void print(Schuhmodell[] produktkatalog)
    {
        for(int i=0; i<produktkatalog.length;i++)
        {
            if(produktkatalog[i]==null)
                break;
            System.out.printf("ID %d, Hersteller: %s, Modell: %s, Preis %.2f\n",i,produktkatalog[i].herstellermarke,produktkatalog[i].modell, produktkatalog[i].preis);
        }
    }
    private static void print(Kunde [] kundenkartei)
    {
        float summe=0;
        for(int i=0; i<kundenkartei.length;i++)
        {
            if(kundenkartei[i]==null)
                break;
            for(Schuhmodell s : kundenkartei[i].gekaufteSchuhe) {
                if(s==null)
                    break;
                summe += s.preis;
            }

            System.out.printf("ID %d, Name: %s, Summe %.2f, \n",i,kundenkartei[i].name,summe);
        }
    }

    }
    /*private static void print(Kunde k1) {
        System.out.printf(k1.name);

        float summe =0;
        for(Schuhmodell s : k1.gekaufteSchuhe)
        {
            if(s==null)
                break;
            summe+=s.preis;
            System.out.printf(", [%s, %s, %.2f]",s.herstellermarke,s.modell,s.preis);
        }
        System.out.printf("%s, hat %.2f€ ausgegeben",k1.name,summe);

    }
*/

