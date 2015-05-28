import javax.swing.JOptionPane;

public class GradeTester
{
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("What is your grade");
		if (input == null)
			System.out.println("Why did you Cancel?");
		else
		{
				Grade g = new Grade(input);
				System.out.println("Your numeric grade is " + g.getNumericGrade());
		}
		System.exit(0);
	}
}