import java.text.NumberFormat;

public class Chp6Loop4a
{
	public static void main(String[] args)
	{
		showTable(1000, 0.12, 12);
		System.out.println("\n*********************\n");
		showTable(5000, 0.10, 60);
	}
	

	/**
		Displays the amounted owed month by month.
	*/
	public static void showTable(double borrowed, double yearlyRate, int months)
	{
		NumberFormat f = NumberFormat.getCurrencyInstance();
		System.out.println("Amount borrowed: " + borrowed);
		System.out.println("Yearly interest rate: " + yearlyRate);
		System.out.println("Number of months for the loan: " + months);
		System.out.println("");
		System.out.println("Total amount owed " + f.format(amountDue(borrowed, yearlyRate/12, months)));
		System.out.println("");
		System.out.println("Month" + "\t\t" + "Amount owed");
		
		for (int ctr = 1; ctr <= months; ctr++)
		{
			System.out.println(ctr + "\t\t\t" + f.format(amountDue(borrowed, yearlyRate/12, ctr)));
		}
	}

	/**
		Returns the amount due when principal has been borrowed at a monthly
		rate for a period of months.
	*/
	public static double amountDue(double principal, double monthlyRate, int period)
	{
		return principal*Math.pow((1+monthlyRate),period);
	}
}