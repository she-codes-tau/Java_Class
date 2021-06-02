import java.util.Random;
import java.util.Scanner;

public class Lesson07_ExtraHomeExercise {
    public void magicNumber() {
        int magic_num = 0;
        int guessedNumber;
        int min = 0;
        int max = 100;

        // creating a new scanner to receive inner input, I called it keyboard because
        // the user types in using a keyboard.
        Scanner keyboard = new Scanner(System.in);

        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 100
        magic_num = rand.nextInt(max - min + 1) + min;

        for (int i = 0; i < 10; i++) {
            System.out.print("Guess the random number: ");

            // inserting the scanner method into the int -> get int from user
            guessedNumber = keyboard.nextInt();
            System.out.println();

            if (guessedNumber == magic_num) {
                System.out
                        .println("Well Done! The magic number is indeed " + magic_num + ", just like you guessed! :)");
                i = 11; // if user guessed right - no need to repeat the loop
            } else if (guessedNumber < magic_num)
                System.out.println("Just a little more... ");
            else if (guessedNumber > magic_num)
                System.out.println("Just a little less...");
        }
        System.out.println();
    }

    public void memoryGame() {
        // run this in a different main by creating an object of this class and call
        // this function. like this:
        // Lesson07_ExtraHomeExercise l7 = new Lesson07_ExtraHomeExercise();
        // l7.memoryGame2();

        // creating a new scanner to receive inner input, I called it keyboard because
        // the user types in using a keyboard.
        Scanner keyboard = new Scanner(System.in);
        String userAnswer;
        int i, j;

        int cards[][] = { { 1, 5, 2, 8 }, { 3, 1, 4, 3 }, { 4, 8, 5, 2 } };
        boolean matches[][] = new boolean[3][4];
        boolean done = false;

        while (!done) {
            // Printing the board
            printCardsArray(cards, matches);
            // Getting input
            System.out.println("Which cards would you like to reveal? Enter num,num");
            // First cart
            System.out.println("First card: ");
            userAnswer = keyboard.nextLine();
            int[] firstIndex = getIndexesFromInput(userAnswer);
            printCardAt(firstIndex, cards);
            // Second card
            System.out.println("Second card: ");
            userAnswer = keyboard.nextLine();
            int[] secondIndex = getIndexesFromInput(userAnswer);
            printCardAt(secondIndex, cards);
            // Checking if they match
            if (cards[firstIndex[0]][firstIndex[1]] == cards[secondIndex[0]][secondIndex[1]]) {
                matches[firstIndex[0]][firstIndex[1]] = true;
                matches[secondIndex[0]][secondIndex[1]] = true;

                System.out.println("You found a match!");
            }

            // Check if the game if over
            done = checkMatchesDone(matches);
        }
        System.out.println("\nCONGRATULATIONS\nYou won the game!!\n");
    }

    private void printCardAt(int[] index, int[][] cards) {
        System.out.println((index[0] + 1) + "," + (index[1] + 1) + ": " + cards[index[0]][index[1]]);
    }

    private int[] getIndexesFromInput(String userAnswer) {
        String[] split = userAnswer.split(","); // String split func. for more information:
                                                // https://www.guru99.com/how-to-split-a-string-in-java.html
        int results[] = new int[2];
        results[0] = Integer.parseInt(split[0]) - 1; // Java has converters from almost ant type to any other type.
        results[1] = Integer.parseInt(split[1]) - 1; // Converting String to int:
                                                     // https://www.javatpoint.com/java-string-to-int
        return results;
    }

    private void printCardsArray(int[][] cards, boolean[][] matches) {
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[0].length; j++) {
                if (matches[i][j]) // when we use a boolean we can simply ask if(boolean) -> it is equal to asking
                                   // if(boolean==true)
                    System.out.print(cards[i][j] + " ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private boolean checkMatchesDone(boolean[][] matches) {
        for (int i = 0; i < matches.length; i++) {
            for (int j = 0; j < matches[0].length; j++) {
                if (!matches[i][j]) // if even one card is unmatched the game isn't over.
                    return false;
            }
        }
        return true;
    }
}
