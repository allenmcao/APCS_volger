import javax.swing.JOptionPane;

public class lab6_1_3
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Enter a number");
		int x = Integer.parseInt(input);
		int sum = 0;
		for (int ctr=1; ctr<x; ctr++)
		{
			if (x%ctr==0)
			{
				sum+=ctr;
			}
		}
		
		if (sum==x)
			System.out.println(x + " is a perfect number.");
		else
			System.out.println(x + " is not a perfect number.");
	}
}