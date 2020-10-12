import java.util.Random;
import java.util.Scanner;

public class Lesson06 {

    //-----------------------String------------------------------

    //Question 1
    public String getBiggerString(String str1, String str2)
    {
        if(str1.length() > str2.length()) //we don't need to loop inside the strings.
            return str1;                 //we can just write stringName.length() and get the length of that string!

        if(str2.length() > str1.length()) //no need to write else here, cause if the condition is true -
            return str2;              //the return will end this function and these lines will never run

        return str1; //if both are the same length - doesn't matter what we send back :)
    }


    //Question 2
    public String combineTwoStrings(String str1, String str2)
    {
        String answer;
        answer = str1.substring(0, str1.length()/2) + str2 + str1.substring(str1.length()/2,str1.length());

        return answer;
    }

    //-----------------------Scanner------------------------------
    //Question 3
    public void interactWithUser()
    { //From site: http://www.programmingbydoing.com/a/age-in-five-years.html

        //creating a new scanner to receive inner input, I called it keyboard because the user types in using a keyboard.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hello.  What is your name? ");

        //creating a new String called name and inserting the scanner method into it.
        String name = keyboard.next();
        System.out.println();

        //moving to the next question
        System.out.print("Hi, " + name + "!  How old are you? ");

        // creating an int and inserting the scanner method into it.
        int age = keyboard.nextInt();
        System.out.println();

        //telling user how old they'll be in 5 years
        System.out.println("Did you know that in five years you will be " + (age+5) + " years old?");
        System.out.println("And five years ago you were " + (age-5) + " ! Imagine that!");
        System.out.println();
    }

    //Question 4
    public int getBiggerFromUser()
    {
        int max_num;

        //creating a new scanner to receive inner input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter 3 numbers (use Enter button after each one): ");

        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        int num3 = keyboard.nextInt();
        System.out.println();

        //  I'm using a default method in Java called 'max' to decide which number is bigger.
        //  Read more about Math.max() in these links:
        //  https://www.geeksforgeeks.org/java-math-max-method-examples/
        //  https://www.tutorialspoint.com/java/lang/math_max_int.htm
        max_num = Math.max(num1, num2);
        max_num = Math.max(max_num, num3);

       return max_num;
    }

    //Question 5
    public void printInputUntilZero() {
        int inputNum;
        boolean isZero = false;

        //creating a new scanner to receive inner input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter numbers to see them printing on the screen.");
        System.out.println("When you wish to stop - enter the number zero. ");


        while (!isZero)
        {
            inputNum = keyboard.nextInt();
            if(inputNum==0)
                isZero = true;
            else
                System.out.println(inputNum + " ");
        }
        System.out.println();
    }

    //-----------------------Random------------------------------
    //Question 6
    public void rollTheDice() {
        int dice=0;
        int min = 1;
        int max = 6;
        // create instance of Random class
        Random rand = new Random();

        // Generate random integers in range 1 to 6
        dice = rand.nextInt(max - min + 1) + min;

        //Random can make numbers from 0 to the number we give it (not including)...
        // So we can just add 1 to the result
        // OR - we can use this way, to generate numbers from min to max (including both).

        for(int i=0; i<dice; i++) //loop to iterate printing * to the screen
        {
            System.out.print("* ");
        }
        System.out.println();
    }

}
