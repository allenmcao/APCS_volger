import javax.swing.JOptionPane;

public class program6
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Enter a number with five digits or less");
		int numb = Integer.parseInt(input);
		int unitsDigit = numb%10;
		int tensDigit = numb%100/10;
		int hundredsDigit = numb%1000/100;
		int thousandsDigit = numb%10000/1000;
		int tenThousandsDigit = numb%100000/10000;
		System.out.println(unitsDigit);
		System.out.println(tensDigit);
		System.out.println(hundredsDigit);
		System.out.println(thousandsDigit);
		System.out.println(tenThousandsDigit);
	}
}