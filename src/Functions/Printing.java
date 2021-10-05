package Functions;
import java.util.Scanner;

public class Printing {




        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();


            print();
            print(name);

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int p = print(n1,n2);



        }
        //enter name function
        public static void print(){
            System.out.printf("Please enter a name: ");
            return;
        }
        //enter numbers
        public static void print(String name){
            System.out.printf("\nWelcome %s! Please enter 2 numbers:", name);
            return;
        }
        // show result
        public static int print(int n1, int n2){
            int p = n1 * n2;
            System.out.printf("\n%d * %d = %d ", n1, n2, p);
            return p;
        }

    }



