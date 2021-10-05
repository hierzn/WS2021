package Functions;

import java.util.Scanner;

public class AddFunction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double zahl1 = sc.nextInt();
        double zahl2 = sc.nextInt();
        //  int summe = addNumber(zahl1, zahl2);

        divide(zahl1,zahl2);
    }

   /* public static int addNumber(int z1, int z2) {
        int sum = z1 + z2;
        return sum;
    }*/

    public static void divide(double number1, double number2) {
        if (number2 == 0) {
            System.out.printf("division by zero is not allowed!");
            return;
        } else {
            System.out.printf("%.2f",number1/number2);
            return;
        }


    }
}




