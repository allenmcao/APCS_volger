import javax.swing.JOptionPane;

public class DigitExtractorTest
{
	public static void main(String[] args)
	{
		String input;
		input = JOptionPane.showInputDialog("Enter an integer");
		int num = Integer.parseInt(input);

		DigitExtractor myExtractor = new DigitExtractor(num);
		
		System.out.println(myExtractor.nextDigit());		
		System.out.println(myExtractor.nextDigit());		
		System.out.println(myExtractor.nextDigit());		
		System.out.println(myExtractor.nextDigit());		
		System.out.println(myExtractor.nextDigit());		
		
		System.exit(0);
	}
}