package Functions;
import java.util.Scanner;

public class MilchFun {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            double fett;
            int haltbar;
            int k;

            System.out.printf("Fettgehalt: ");
            fett = sc.nextDouble();
            System.out.printf("Haltbar: ");
            haltbar = sc.nextInt();

            k = klasse(fett, haltbar);
            ausgabe(k);
            sc.close();

        }
        public static int klasse(double fett, int haltbar)
        {
            int klasse=-1;
            if(fett<3.0&&haltbar==0)
                klasse=3;
            if(fett<3.0&&haltbar==1)
                klasse=4;
            if(fett>7.0&&haltbar==0)
                klasse=1;
            if(fett>7.0&&haltbar==1)
                klasse=2;
            if(fett>=3.0&&fett<=7.0&&haltbar==0)
                klasse=5;
            if(fett>=3.0&&fett<=7.0&&haltbar==1)
                klasse=6;

            return klasse;


        }
        public static void ausgabe (int k)
        {
            switch(k){
                case 1: System.out.printf("Extravollmilch (frisch)");
                break;
                case 2: System.out.printf("Extravollmilch (haltbar)");
                break;
                case 3: System.out.printf("Leichtmilch (frisch)");
                break;
                case 4: System.out.printf("Leichtmilch (haltbar)");
                break;
                case 5: System.out.printf("Normalmilch (frisch)");
                break;
                case 6: System.out.printf("Normalmilch (haltbar)");
                break;
                case -1: System.out.printf("Unguletige Klassifizierung!");
                break;
                default: System.out.printf("Ungueltiges Argument!");
                break;

        }

        }
    }


