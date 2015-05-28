import javax.swing.JOptionPane;

public class program3
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Enter a number");
		int numb = Integer.parseInt(input);
		System.out.println(numb * numb);
	}
}