import javax.swing.JOptionPane;

public class Chp6Loop5a
{
	public static void main(String[] args)
	{
		String input;
		int a;
		int b;
		
		do
		{
			input = JOptionPane.showInputDialog("Enter a positive integer.");
			a = Integer.parseInt(input);
		}while (!(a > 0));
		
		do
		{
			input = JOptionPane.showInputDialog("Enter another positive integer.");
			b = Integer.parseInt(input);
		}while (!(b > 0));
		
		System.out.println("The GCD of " + a + " and " + b + " is " + GCD(a,b) + ".");
	}
		
	
	/**
		Returns the GCD of x and y
	*/
	public static int GCD(int x, int y)
	{
		// Write your code here.
		int r =  x%y;
		do
		{
			x = y;
			y = r; 
			r = x % y;
		} while (r != 0);
		return y;
	}
}