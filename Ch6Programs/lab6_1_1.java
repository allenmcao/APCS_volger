import javax.swing.JOptionPane;

public class lab6_1_1
{
	public static void main (String[]args)
	{
		int fib1 = 0;
		int fib2 = 1;
		int sum = fib1+fib2;
		String input = JOptionPane.showInputDialog("Enter a number");
		int x = Integer.parseInt(input);
		for (int ctr = 1; ctr<x; ctr++)
		{
			System.out.print(fib1 + ", ");
			fib1=fib2;
			fib2=sum;
			sum = fib1+fib2;
		}
		System.out.print(fib1);
	}
}