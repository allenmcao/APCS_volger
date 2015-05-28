import javax.swing.JOptionPane;

public class Chp6Loop6a
{
	public static void main(String[] args)
	{
		int rand = (int)(Math.random()*100)+1;
		String input = JOptionPane.showInputDialog("Guess this number between 1 and 100");
		int guess = Integer.parseInt(input);
		
		while (!(guess>0 && guess<101))
		{
			input = JOptionPane.showInputDialog("Not a valid number.");
			guess = Integer.parseInt(input);
		}

		int guesses = 1;
		
		while (guess!=rand)
		{
			if (guess>0 && guess<101)
			{
				if (guess>rand)
					System.out.println(guess + " is TOO HIGH");
				else
					System.out.println(guess + " is TOO LOW");
				guesses++;
				input = JOptionPane.showInputDialog("Try another number");
				guess = Integer.parseInt(input);
			}
			else
				input = JOptionPane.showInputDialog("Not a valid number.");
		}
		System.out.println(rand + " is just right!");
		System.out.println("You got the number " + "\"" + rand + "\"" + " in " + guesses + " guesses.");
	}
}