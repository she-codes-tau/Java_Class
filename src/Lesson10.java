import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Lesson10 {

    //Slide27 ex.3
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
            //TODO:
            // split input into 3 chars max sections staring from the end of the string.
            // Send each part to map3chars method.
            // Add sections names

            this.numberInWords = "";

            ArrayList<String> tmpStrlist = new ArrayList<String>();

            int start, end;
            for(int i=0; i< this.numString.length(); i=i+3){

                start = this.numString.length()-i-3;
                if(start < 0){
                    start = 0;
                }
                end = this.numString.length()-i;
                tmpStrlist.add(this.numString.substring(start,end));
            }

            int currentSection = tmpStrlist.size();
            for(int i=0; i<tmpStrlist.size(); i++){
                this.numberInWords+= this.map3chars(tmpStrlist.get(i));

                //TODO:
                // map current section with the meaning -> 3rd section is "million", 2nd is "thousand", 1st is "." (end)
            }

            //this.numberInWords = ?;
        }

        private String map3chars(String numberStr){
            //TODO:
            // Use a map object to translate each number char to a string word.
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

    //TODO: check :)

}
