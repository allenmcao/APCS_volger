import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class PaycheckTester
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("Employee's name");
		String input = JOptionPane.showInputDialog("Employee's hourly wage");
		double wage = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("How many hours did " + name + " work?");
		double hours = Double.parseDouble(input);
		
		Paycheck pay = new Paycheck(name, wage, hours);
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		System.out.println("Employee's pay check is " + formatter.format(pay.computePay()));
		
		System.exit(0);
		
	}
}