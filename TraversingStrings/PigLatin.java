public class PigLatin
{
	private String sent;
	public PigLatin(String sentence)
	{
		sent = sentence;
	}
	
	public String pigLatinPharse()
	{
		int lastSpace=-1;
		String word;
		String pigLatinWord;
		String pigLatinSent= "";
		
		for (int k = 0; k < sent.length(); k++)
		{
			if (sent.charAt(k)==' ')
			{
				word = sent.substring(lastSpace+1,k);
				lastSpace = k;
				pigLatinWord = word.substring(1, word.length()) + word.substring(0,1)+  "ay";
				pigLatinSent += pigLatinWord + " ";
			}
		}
		word = sent.substring(lastSpace+1,sent.length());
		pigLatinWord = word.substring(1, word.length()) + word.substring(0,1)+  "ay";
		pigLatinSent += pigLatinWord + " ";
		return pigLatinSent;
	}
	
	public String toString()
	{
		return sent;
	}
}