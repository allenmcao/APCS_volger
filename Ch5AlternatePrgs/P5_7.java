import javax.swing.JOptionPane;

public class P5_7
{
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("Do you want to continue?");
		if (input == null)
			System.out.println("Why did you Cancel?");
		else
		{
				InputChecker c = new InputChecker(input);
				if (c.yes())
					System.out.println("OK");
				else if (c.no())
					System.out.println("Terminating");
				else
					System.out.println("Bad input");
		}
		System.exit(0);
	}
}