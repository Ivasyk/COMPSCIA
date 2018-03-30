//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private String lookFor;

	public LetterRemover()
	{
		
	}

	public LetterRemover(String meme, String charlie)
	{
		setRemover(meme, charlie);
	}
	
	public void setRemover(String s, String rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		
		cleaned = sentence.replace(lookFor, "");

		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}