import javax.swing.JOptionPane;

public class program2
{
	public static void main (String[] args)
	{
		String input = JOptionPane.showInputDialog("Enter an integer");
		int n = Integer.parseInt(input);

		while (n<=0)
		{
			input = JOptionPane.showInputDialog("Invalid input");
			n = Integer.parseInt(input);
		}
		
		System.out.print("+");
		for (int ctr = 1; ctr<=n*2+1; ctr++)
		{
			System.out.print("-");
		}
		System.out.println("+");
	
		for (int j = 1; j<=n; j++)
		{
			System.out.print("I-");
			for (int ctr = 1; ctr<=n; ctr++)
				System.out.print("X-");
			System.out.println("I");
		}
			
		System.out.print("+");
		for (int c= 1; c<=n*2+1; c++)
		{
			System.out.print("-");
		}
		System.out.println("+");
	}
}