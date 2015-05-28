public class Sentence
{
	private String s;
	
	public Sentence(String input)
	{
		s = input;
	}
	/**
		Returns the number of words found in the sentence.
		Assume all words are separated by a signle space, except for the last word.
		Also assume that there is at least one word in the string.
		@return returns the number of words in the sentence.
	*/
	public int words()
	{
		int numWords=0;
		for (int n = 0; n < s.length(); n++)
		{
			if (s.charAt(n) == ' ')
				numWords++;
		}
		return numWords+1;
	}
	
	/**
		Returns the number of letters found in the sentence.  Do NOT count spaces and punctuation.
		@return returns the number of letters in the sentence.
	*/
	public int letters()
	{
		int numLetters = 0;
		char currentLetter;
		for (int n = 0; n < s.length(); n++)
		{
			currentLetter = s.charAt(n);
			if (Character.isLetter(currentLetter))
			{
				numLetters++;
			}
		}
		return numLetters;
	}
	
	/**
		Returns the average word length of all the words in the sentence.
		@return returns the average word length of all the words in the sentence
	*/
	public double averageWordLength()
	{
		return (double)letters()/words();
	}
}