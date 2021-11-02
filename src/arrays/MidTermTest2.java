package arrays;
import java.util.Scanner;

public class MidTermTest2 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int value = 0;
            int secondvalue=0;

            System.out.println(
                    "Welcome to the Calculator!\n" +
                            "Following operations are available:\n" +
                            "1 - add\n" +
                            "2 - subtract\n" +
                            "3 - multiply\n" +
                            "4 - power\n" +
                            "5 - factorial\n" +
                            "anything else stops the program\n"
            );

            System.out.printf("Value: %d\n",value);
            System.out.printf("Select operation: ");
            int auswahl = sc.nextInt();


            while(auswahl>0&&auswahl<=5) { //abfragen ob die Auswahl immer zwischen 1 und 5 ist


                switch (auswahl) {
                    case 1: {
                        System.out.printf("Select 2nd value: ");
                        secondvalue = sc.nextInt();
                        value = add(value, secondvalue); //ruft die Additionsfunktion auf
                        System.out.printf("Value: %d\n", value);
                        break;
                    }
                    case 2: {
                        System.out.printf("Select 2nd value: ");
                        secondvalue = sc.nextInt();
                        value = subtract(value, secondvalue); //ruft die Subtraktionsfunktion auf
                        System.out.printf("Value: %d\n", value);
                        break;
                    }

                    case 3: {
                        System.out.printf("Select 2nd value: ");
                        secondvalue = sc.nextInt();
                        value = multiply(value, secondvalue); // ruft die Multiplikationsfunktion auf
                        System.out.printf("Value: %d\n", value);
                        break;
                    }
                    case 4: {
                        System.out.printf("Select 2nd value: ");
                        secondvalue = sc.nextInt();
                        value = power(value, secondvalue); // ruft die Potenzfunktion auf
                        System.out.printf("Value: %d\n", value);
                        break;
                    }
                    case 5: {
                        value = factorial(value); //wer braucht rekursionen :D
                        System.out.printf("Value: %d\n", value);
                        break;
                    }
                }
                System.out.printf("Select operation: ");
                auswahl=sc.nextInt();
            }

            // add loop to output value, ask for inputs and execute the implemented functions



            sc.close();
        }


    public static int add(int value, int secondValue)
    {
        return value+secondValue;

    }


    public static int subtract(int value, int secondValue)
    {
        return  value-secondValue;

    }



    public static int multiply(int value, int secondValue)
    {
        return  value*secondValue;
    }


    public static int power(int value, int secondValue)

    {
        int power=value;
        if(value==0) {
            return 0;
        }
        if(secondValue>0) {
            for (int i = 1; i <secondValue; i++) {
                power *= value;
            }
        }
        else if (secondValue == 0) {
                return 1;
            } else if(secondValue==1){
            return power;
        }
        else
        { System.out.print("Ungültige Eingabe!");}

        return power;
    }



    public static int factorial(int value) {
        int fact = 1;

        for (int i = 1; i <= value; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // add functions here

    }


