package arrays;
import java.util.Scanner;

public class Arrays {

        public static void main(String[] args) {

            //create the array
            int a[] = {4, 5, 7, 2, 3 ,9, 6, 4, 3, 5,7,8};
            for(int i=0;i<a.length;i++)
            {
                System.out.printf("[%d]: %d\n",i,a[i]);
            }

            //print the array

            System.out.printf("Output finished.");

            Scanner sc = new Scanner(System.in);
            int [] b = new int[10];
            for(int i=0;i<10;i++)
            {
                System.out.printf("%d. number: ",i+1);
                b[i]=sc.nextInt();
            }
            System.out.printf("Input finished.\n");
            for(int i=0;i<10;i++)
            {
                System.out.printf("[%d]: %d\n",i,b[i]);
            }
            System.out.printf("Output finished.");


            int [] c= new int [10];
            for(int i =0; i<10;i++)
            {
                System.out.printf("%d. number: ",i+1);
                c[i]=sc.nextInt();

            }
            System.out.printf("Input finished.\n");
            for(int i=c.length-1;i>=0;i--)
            {
                System.out.printf("[%d]: %d\n",i,c[i]);
            }
            System.out.printf("Output finished.\n");
            sc.close();
        }

        }


