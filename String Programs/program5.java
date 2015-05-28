import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class program5
{
	public static void main (String[]args)
	{
		String cost1 = JOptionPane.showInputDialog("Enter a price");
		String cost2 = JOptionPane.showInputDialog("Enter another price");
		double numb1 = Double.parseDouble(cost1);
		double numb2 = Double.parseDouble(cost2);
		NumberFormat df = NumberFormat.getCurrencyInstance();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		System.out.println(df.format(numb1 + numb2));
		
	}
}