public class DigitExtractor
{
	private int currentDigit;
	
	public DigitExtractor(int num1)
	{
		currentDigit = num1*10;
	}
	
	public int nextDigit()
	{
		currentDigit = currentDigit / 10;
		return currentDigit%10;
	}
}