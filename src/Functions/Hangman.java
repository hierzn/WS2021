package Functions;
import java.util.Scanner;

public class Hangman {

            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a word to guess: ");
            String word = sc.nextLine();
            word = addSpaces(word);
            System.out.printf(word);

            // add new lines so that input is not visible anymore
            for(int i = 0; i<50; i++)
                System.out.println();

            String guessedChars = " ";
            String hidden = hideCharacters(word, guessedChars);

            int turns = 0;
            int lives = 7;

            while(lives > 0 && hidden != word) {
                System.out.println(hidden);
                System.out.println("Lives left: " + lives);
                System.out.println("GuessedCharacters:" + guessedChars);

                String guess = getGuess(sc, guessedChars).toLowerCase();
                guessedChars += getUpperLower(guess);
                if(!word.toLowerCase().contains(guess))
                    lives--;
                hidden = hideCharacters(word, guessedChars);
                turns++;
            }
            printEndMessage(word, turns, lives);

            sc.close();
        }

        public static String addSpaces(String word) {
            word=word.replaceAll("([a-zA-Z])"," $1 ");
            return word;

        }

        public static String hideCharacters(String word, String guessedChars) {
            String hideword = word.replaceAll("([^" + guessedChars + " ])","_");
            return hideword;
        }

        public static String getGuess(Scanner sc, String guessedChars) {
                sc.next();
            return null;
        }

        public static String getUpperLower(String character) {
            return null;
        }

        public static void printEndMessage(String word, int turns, int lives) {

        }
    }

