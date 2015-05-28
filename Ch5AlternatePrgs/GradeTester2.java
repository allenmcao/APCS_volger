import javax.swing.JOptionPane;

public class GradeTester2
{
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("What is your numeric grade");
		if (input == null)
			System.out.println("Why did you Cancel?");
		else
		{
				Grade2 g = new Grade2(Double.parseDouble(input));
				System.out.println("Your letter grade is: " + g.getLetterGrade());
		}
		System.exit(0);
	}
}