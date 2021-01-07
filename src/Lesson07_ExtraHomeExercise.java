import java.util.Random;
import java.util.Scanner;

public class Lesson07_ExtraHomeExercise {
    public void magicNumber() {
        int magic_num=0;
        int guessedNumber;
        int min = 0;
        int max = 100;

        //creating a new scanner to receive inner input, I called it keyboard because the user types in using a keyboard.
        Scanner keyboard = new Scanner(System.in);


        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 0 to 100
        magic_num = rand.nextInt(max - min + 1) + min;

        for(int i=0; i<10; i++)
        {
            System.out.print("Guess the random number: ");

            //inserting the scanner method into the int -> get int from user
            guessedNumber = keyboard.nextInt();
            System.out.println();

            if(guessedNumber == magic_num){
                System.out.println("Well Done! The magic number is indeed " + magic_num + ", just like you guessed! :)");
                i=11; //if user guessed right - no need to repeat the loop
            }
            else if(guessedNumber < magic_num)
                System.out.println("Just a little more... ");
            else if (guessedNumber > magic_num)
                System.out.println("Just a little less...");
        }
        System.out.println();
    }

    public void memoryGame() {

        //creating a new scanner to receive inner input, I called it keyboard because the user types in using a keyboard.
        Scanner keyboard = new Scanner(System.in);
        String userAnswer;
        int i,j;


        int cards[][] = { {1,5,5,8},
                          {3,1,4,2},
                          {3,1,4,2}
                        };
        boolean matches[][] = new boolean[2][4];
        boolean done = false;

        while(!done){
            System.out.print("Want to see cards deck? (y/n)");
            userAnswer = keyboard.next();
            if(userAnswer.equals('y') || userAnswer.equals('Y')){
                printCardsArray(cards,matches);
            }
            System.out.println("Which cards would you like to reveal? Enter num,num");
            System.out.println("First card: ");
            userAnswer = keyboard.next();
            //i = userAnswer.split(); //TODO: split string b4 & after ',' and then show the correct cards

            done = checkMatchesDone(matches);
        }

    /*
        if(cards[i][j]==cards[k][l])
        {
            //when we find a match
            matches[i][j] = true;
            matches[k][l] = true;
        }
     */
        /*
        matches[0][0] = true;
        matches[1][1] = true;

        matches[0][1] = true;
        matches[0][2] = true;
        */


    }

    private void printCardsArray(int[][] cards, boolean[][] matches){
        for(int i=0; i < cards.length ; i++){
            for(int j=0; j < cards[0].length ; j++){
                if(matches[i][j]) //when we use a boolean we can simply ask if(boolean) -> it is equal to asking if(boolean==true)
                    System.out.print(cards[i][j] + " ");
                else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private boolean checkMatchesDone(boolean[][] matches){
        for(int i=0; i < matches.length ; i++){
            for(int j=0; j < matches[0].length ; j++){
                if(!matches[i][j])
                   return false;
            }
        }
        return true;
    }
}
