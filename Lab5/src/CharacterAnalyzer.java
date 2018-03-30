//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char urChar;
	private String lower, upper, number;
	private int ascii = 1;

	
	public CharacterAnalyzer(char c)
	{
		urChar = c;
		isUpper();
		isLower();
		isNumber();
		getASCII();
		toString();
	}
	public boolean isUpper()
	{
		int meme = (int) urChar;
		if (meme >= 65 && meme <= 90)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isLower()
	{
		int maemae = (int) urChar;
		if (maemae >= 97 && maemae <= 122)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isNumber()
	{
		int num = (int) urChar;
		if (num >= 48 && num <= 57)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	

	public int getASCII( )
	{
		ascii = (int) urChar;
		return ascii;
	}

	public String toString()
	{
		if (isUpper() == true)
		{
			return urChar + " is an uppercase character. ASCII == " + ascii;
		}
		else if (isLower() == true)
		{
			return urChar + " is an lowercase character. ASCII == " + ascii;
		}
		else if (isNumber() == true)
		{
			return urChar + " is an number. ASCII == " + ascii;
		}
		else
		{
			return "error: symbol not a letter or number";
		}
	}
}