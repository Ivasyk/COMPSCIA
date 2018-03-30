//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	static Scanner keyboard = new Scanner(System.in);
	char response;
	private static boolean kek = false;
	
	public static void main(String args[])
	{
		while (kek == false)
		{
			System.out.println("Guessing Game - how many numbers? ");
			int numbers = keyboard.nextInt();
			GuessingGame guess = new GuessingGame(numbers);
			guess.playGame(numbers);
			System.out.println(guess.toString());
			System.out.println("Do you want to play again? ");
			if (keyboard.next() == "y")
			{
				kek = false;
			}
			else
			{
				kek = true;
			}
		}
	}
}