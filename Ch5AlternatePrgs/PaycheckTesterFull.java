import java.text.NumberFormat;

public class PaycheckTesterFull
{
	public static void main(String[] args)
	{
		// Create an object whose wage is $10 per hour, and works 50 hours
		Paycheck pay = new Paycheck("Billy Barty", 10, 50);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		System.out.println("Employee's pay is " + formatter.format(pay.computePay()));
		
		pay = new Paycheck("Billy Idol", 10, 30);
		System.out.println("Employee's pay is " + formatter.format(pay.computePay()));

		pay = new Paycheck("Billy the Kid", 0, 30);
		System.out.println("Employee's pay is " + formatter.format(pay.computePay()));

		pay = new Paycheck("Billy Martin", 0, 50);
		System.out.println("Employee's pay is " + formatter.format(pay.computePay()));

		pay = new Paycheck("Billy De Williams", 0, 0);
		System.out.println("Employee's pay is " + formatter.format(pay.computePay()));
	}
}