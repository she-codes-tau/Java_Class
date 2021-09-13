import java.util.Objects;
import java.util.Scanner;

public class Lesson10 {
    public class Translator{
        private int num;
        private String numString;
        private String numberInWords;

        public Translator(String numString, int num)
        {
            this.numString = numString;
            this.num = num;
            this.setNumberInWords();
        }

        public Translator(String numString)
        {
            this.numString = numString;
            this.num = Integer.parseInt(numString);
            this.setNumberInWords();
        }

        public void setNumString(String numString) {
            this.numString = numString;
            this.num = Integer.parseInt(numString);
            this.setNumberInWords();
        }

        public void setNum(int num) {
            this.num = num;
            this.numString = String.valueOf(num);
            this.setNumberInWords();
        }

        private void setNumberInWords() {
            //TODO: split input into 3 chars sections staring from the end of the string.
            // Send each part to map3chars method.

            //this.numberInWords = ?;
        }

        private String map3chars(){
            //TODO: use a map object to translate each number char to a string word.
            // Extreme cases: 10-90 (for example: the meaning of 2 vs the meaning of 20)
            // Extreme cases: 11,12...
            return "";
        }

        public String getNumString() {
            return numString;
        }

        public int getNum() {
            return num;
        }

        public String getNumberInWords() {
            return numberInWords;
        }

        @Override
        public String toString()
        {
            String translatorNumber = "The number: " + this.num + " , In words: " + this.numberInWords;
            return translatorNumber;
        }


    }

    public class TestingTranslatorClass{
        public void mainTest()
        {
            //creating a new scanner to receive inner input, I called it keyboard because the user types in using a keyboard.
            Scanner keyboard = new Scanner(System.in);
            String numString;
            String ans;
            boolean continueLooping = true;


            while (continueLooping){
                System.out.print("Enter a number you wish to translate into words: ");

                //creating a new String called name and inserting the scanner method into it.
                numString = keyboard.next();
                System.out.println();

                Lesson10.Translator translator01 = new Lesson10.Translator(numString);

                //Seeing the result
                System.out.println(translator01);

                System.out.println("Go again? (Y/N) ");

                //creating a new String called name and inserting the scanner method into it.
                ans = keyboard.next();

                if(!Objects.equals(ans, "Y") && !Objects.equals(ans, "y")){
                    continueLooping = false;
                }
                //System.out.println();
            }

        }
    }

}
