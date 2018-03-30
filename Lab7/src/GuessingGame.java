//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int rand = randnums(1,upperBound);
	private int counter;
	Scanner keyboard = new Scanner(System.in);

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame(int guess)
	{
		for (int i = 0; guess != rand; counter++)
		{
			System.out.print("Enter a number between 1 and " + upperBound);
			guess = keyboard.nextInt();
		}
	}

	public String toString()
	{
		String output="it only took " + counter + "guesses to guess " + rand;
		
		return output;
	}
	
	public static int randnums(int b, int c) 
	{
		Random r = new Random();
		int n = 0;
		n = b + r.nextInt(c-(b-1));
		return n;
	}
}