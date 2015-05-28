import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class program4
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Enter a radius");
		double numb = Double.parseDouble(input);
		NumberFormat f = NumberFormat.getInstance();
		f.setMaximumFractionDigits(2);
		f.setMinimumFractionDigits(2);
		System.out.println(f.format(numb * 3.14159265358979323 * 2));
		
	}
}