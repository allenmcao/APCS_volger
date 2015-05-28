import javax.swing.JOptionPane;

public class program3
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Enter a number");
		int currentNumb = Integer.parseInt(input);
		int maxNumb = currentNumb;
		int minNumb = currentNumb;
			
		input = JOptionPane.showInputDialog("Enter another number");
		currentNumb = Integer.parseInt(input);
		maxNumb = Math.max(maxNumb, currentNumb);
		minNumb = Math.min(minNumb, currentNumb);
		
		input = JOptionPane.showInputDialog("Enter another number");
		currentNumb = Integer.parseInt(input);
		maxNumb = Math.max(maxNumb, currentNumb);
		minNumb = Math.min(minNumb, currentNumb);
		
		input = JOptionPane.showInputDialog("Enter another number");
		currentNumb = Integer.parseInt(input);
		maxNumb = Math.max(maxNumb, currentNumb);
		minNumb = Math.min(minNumb, currentNumb);
		
		System.out.println("The greatest number was " + maxNumb);
		System.out.println("The smallest number was " + minNumb);
	}
}