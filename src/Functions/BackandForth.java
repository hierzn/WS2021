package Functions;
import java.util.Scanner;

public class BackandForth {



        static Scanner sc = new Scanner(System.in);
                static String SEPARATOR = "#<ab@17943918#@>#";
        public static int countdown(int n){
            if (n == 0) {
                System.out.printf("%d\n", n);
                return n;
            }

            System.out.printf("%d\n", n);
            countdown(n-1);

            System.out.printf("%d\n", n);
            return n;
        }

        public static void main(String[] args) {
            BackandForth main = new BackandForth();
            main.runTests();
        }


        public void runTests() {
            {
                countdown(sc.nextInt());
            }
        }
    }



