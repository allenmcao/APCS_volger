import javax.swing.JOptionPane;

public class program5
{
	public static void main (String[]args)
	{
		String due = JOptionPane.showInputDialog("Enter a price");
		String paid = JOptionPane.showInputDialog("Enter how much paid");
		double amountDue = Double.parseDouble(due);
		double amountPaid = Double.parseDouble(paid);

		int cents = (int)((amountPaid - amountDue)*100.0 + 0.5);
		int dollars = cents/100;
		int quarters = (cents%100)/25;
		int dimes = ((cents%100)%25)/10;
		int nickels = (((cents%100)%25)%10)/5;
		int pennies = ((((cents%100)%25)%10)%5);
		
		System.out.println("The dollars needed are " + dollars);
		System.out.println("The quarters needed are " + quarters);
		System.out.println("The dimes needed are " + dimes);
		System.out.println("The nickels needed are " + nickels);
		System.out.println("The pennies needed are " + pennies);
	}
}