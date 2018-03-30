//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		
	}

	public Name(String s)
	{
		name = s;
	}

   public void setName(String s)
   {
	   name = s;
   }
	public String getFirst()
	{
		int dex;
		dex = name.indexOf(" ");
		return name.substring(0,dex);
	}

	public String getLast()
	{
		int kek;
		kek = name.indexOf(" ");
		return name.substring(kek + 1, name.length());
	}

 	public String toString()
 	{
 		return name;
	}
}