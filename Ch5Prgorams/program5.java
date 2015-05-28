import javax.swing.JOptionPane;

public class program5
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Input a year");
		int year = Integer.parseInt(input);
		if (year%4==0 && year%100!=0 || year%400==0)
			System.out.println("This is a leap year");
		else
			System.out.println("This is not a leap year");
	}
}