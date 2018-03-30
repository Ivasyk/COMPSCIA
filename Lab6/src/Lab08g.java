//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats fruitloops = new LoopStats(1,5);
		System.out.println("total " + fruitloops.getTotal());
		System.out.println("even count " + fruitloops.getEvenCount());
		System.out.println("odd count " + fruitloops.getOddCount());
	}
}