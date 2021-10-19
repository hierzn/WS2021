package arrays;
import java.util.Scanner;

public class NumberPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        int [][] matrix = new int [8][8];

        for(int i=0; i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-1;i++)
        {
            int x=arr[i];
            int y=arr[i+1];
            matrix[x][y]=matrix[x][y]+1;
        }

            for (int k = 0; k < matrix.length; k++) {
                for (int j = 0; j < matrix[k].length; j ++) {
                    if (matrix[k][j]>0) {
                        System.out.printf("(%d,%d): %d\n",k,j,matrix[k][j]);
                    }
                }
            }
        sc.close();
        }


    }

