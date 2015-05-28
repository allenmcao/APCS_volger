public class SentenceTester
{
	public static void main(String[] args)
	{
		Sentence s = new Sentence("This is, a test!");
		System.out.println("The average word length is " + s.averageWordLength());
	}
}