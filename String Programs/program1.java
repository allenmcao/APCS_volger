import javax.swing.JOptionPane;

public class program1
{
	public static void main (String[]args)
	{
		String input;
		input = JOptionPane.showInputDialog("Enter your name");
		int length = input.length();
		String firstLetter = input.substring(0,1);
		String lastLetter = input.substring(length-1);
		System.out.println(firstLetter);
		System.out.println(lastLetter);
	}
}