import javax.swing.JOptionPane;

public class PairTest
{
	public static void main(String[] args)
	{
		String input;
		input = JOptionPane.showInputDialog("Enter an integer");
		int num1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter another integer");
		int num2 = Integer.parseInt(input);
		
		Pair p = new Pair(num1, num2);
		
		System.out.println("Sum is = " + p.getSum());
		System.out.println("Difference is = " + p.getDifference());
		System.out.println("Product is = " + p.getProduct());
		System.out.println("Average is = " + p.getAverage());
		System.out.println("Distance is = " + p.getDistance());
		System.out.println("Maximum is = " + p.getMaximum());
		System.out.println("Minimum is = " + p.getMinimum());
		
		System.exit(0);
	}
}