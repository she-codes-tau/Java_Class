import java.util.Scanner;

public class Lesson03{

	public void HowOldAreYou(){
		//creating a new scanner to receive inner input, I called it keyboard because the user types in using a keyboard.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hey, what's your name? ");

		//creating a new String called name and inserting the scaner method into it.
		String name = keyboard.next();
		System.out.println();

		//moving to the next question
		System.out.print("Ok, "+name+", how old are you? ");

		// creating an int and inserting the scanner method into it.
		int age = keyboard.nextInt();
		System.out.println();

		// A loop to make sure user's input is valid (age can not be smaller than 0 or bigger than 120)
		while(age<0 || age > 120){
			System.out.print("WRONG! "+name+", how old are you? ");
			age = keyboard.nextInt();
			System.out.println();
		}

		// tell the user what they can do according to their age

		//scenario when an age is smaller than 16
		if(age<16){
			System.out.println("You can't drive, "+name+".");

			//scenario when an age is smaller than 18
		}if(age<18){
			System.out.println("You can't vote, "+name+".");

			//scenario when an age is smaller than 25
		}if(age<25){
			System.out.println("You can't rent a car, "+name+".");

			//scenario when an age is equal or bigger than 25
		}if(age>=25){
			System.out.println("You can do anything that's legal, "+name+".");
		}
	}

}
