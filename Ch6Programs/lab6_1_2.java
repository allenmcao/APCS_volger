import javax.swing.JOptionPane;

public class lab6_1_2
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Enter a number");
		int x = Integer.parseInt(input);
		double sum = 1;
		double denom = 1;
		for (int ctr = 2; ctr<=x; ctr++)
		{
			if (ctr%2==0)
			{
				denom +=2;
				sum -= 1/denom;
			}
			else
			{
				denom +=2;
				sum += 1/denom;
			}
		}
		System.out.println(sum*4);
	}
}