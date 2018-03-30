//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		
	}

	public Prime(int num)
	{
		number = num;
	}

	public void setPrime(int num)
	{
		number = num;
	}

	public boolean isPrime()
	{
		if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public String toString()
	{
		if (isPrime() == false)
		{
			return "It's a Prime number.";
		}
		else
		{
			return "not prime";
		}
	}
}