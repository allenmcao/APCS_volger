import javax.swing.JOptionPane;

public class DataSetTest
{
	public static void main(String[] args)
	{
		DataSet d = new DataSet();
		
		String input;
		input = JOptionPane.showInputDialog("Enter an integer");
		int num = Integer.parseInt(input);
		d.addValue(num);
		
		input = JOptionPane.showInputDialog("Enter an integer");
		num = Integer.parseInt(input);
		d.addValue(num);

		input = JOptionPane.showInputDialog("Enter an integer");
		num = Integer.parseInt(input);
		d.addValue(num);

		input = JOptionPane.showInputDialog("Enter an integer");
		num = Integer.parseInt(input);
		d.addValue(num);
				
		System.out.println("Largest is " + d.getLargest());
		System.out.println("Smallest is " + d.getSmallest());
		
		System.exit(0);
	}
}