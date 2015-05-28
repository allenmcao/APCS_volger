import javax.swing.JOptionPane;

public class program2
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Do you want to continue?");
		String lower = input.toLowerCase();
		if (lower.equals("yes") || lower.equals("y") || lower.equals("ok") || lower.equals("sure") || lower.equals("why not"))
			System.out.println("OK");
		else if (lower.equals("no") || lower.equals("n"))
			System.out.println("Terminating");
		else
			System.out.println("Bad Input");
	}
}