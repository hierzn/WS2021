package Iteration;
import java.util.Scanner;

public class MatchStickGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("!!Welcome to Matchstick Game!!\n\n\n\n");

        System.out.printf("Wanna play vs HUMAN or CPU - Type h for Human or c for CPU: ");
        String c=sc.next();
        char game = c.charAt(0);
        if (game == 'h') {
            System.out.printf("Enter name player 1: ");
            String p1 = sc.next();
            System.out.printf("Enter name player 2: ");
            String p2 = sc.next();
            String winner = "";
            int round = 1;
            int matches = 22;


            while (matches > 0) {
                int sticks = 0;
                System.out.printf("\nSticks left: %d\n", matches);
                for (int i = 1; i <= matches; i++) {
                    System.out.printf("|");
                    if (i % 5 == 0) {
                        System.out.printf(" ");
                    }

                }


                if (round % 2 == 1) {


                    while (sticks < 1 || sticks > 3) {
                        System.out.printf("\n%s take 1-3 sticks: ", p1);
                        sticks = sc.nextInt();

                    }
                    matches -= sticks;
                    winner = p2;


                } else {

                    while (sticks < 1 || sticks > 3) {
                        System.out.printf("\n%s take 1-3 sticks: ", p2);
                        sticks = sc.nextInt();

                    }

                    matches -= sticks;
                    winner = p1;
                }
                round++;
                if (matches == 0) {
                    System.out.printf("%s wins", winner);
                }
            }
        }
        if (game == 'c') {
            System.out.printf("Enter name player 1: ");
            String p1 = sc.next();
            String p2 = "SUPERCOMPUTER";
            System.out.printf("you play vs %s",p2);
            String winner = "";
            int round = 1;
            int matches = 22;


            while (matches > 0) {
                int sticks = 0;
                System.out.printf("\nSticks left: %d\n", matches);
                for (int i = 1; i <= matches; i++) {
                    System.out.printf("|");
                    if (i % 5 == 0) {
                        System.out.printf(" ");
                    }

                }

                if (round % 2 == 1) {


                    while (sticks < 1 || sticks > 3) {
                        System.out.printf("\n%s take 1-3 sticks: ", p1);
                        sticks = sc.nextInt();

                    }
                    matches -= sticks;
                    winner = p2;


                } else {
                    sticks = 3;
                    System.out.printf("\n%s take 1-3 sticks: %d", p2, sticks);
                    matches -= sticks;
                    winner = p1;
                }

                    if (matches==6 ) {
                        sticks = 1;
                        System.out.printf("\n%s take 1-3 sticks: %d", p2, sticks);
                        matches -= sticks;
                        winner = p1;
                    }
                    else if(matches==7) {
                        sticks =2;
                        System.out.printf("\n%s take 1-3 sticks: %d", p2, sticks);
                        matches -= sticks;
                        winner = p1;

                    }else if(matches==8) {
                        sticks = 3;
                        System.out.printf("\n%s take 1-3 sticks: %d", p2, sticks);
                        matches -= sticks;
                        winner = p1;
                    }else if(matches<=4)
                    {
                        switch(matches){
                            case 2,5: matches--;winner = p1;
                            break;
                            case 3: matches-=2; winner = p1;
                            break;
                            case 4: matches-=3; winner=p1;
                            break;

                        }
                    }
                    if (matches == 0) {
                        System.out.printf("%s wins", winner);
                    }
                }

            }

        }
    }

