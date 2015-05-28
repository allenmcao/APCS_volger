import java.text.NumberFormat;

public class TestWorkers
{
	public static void main(String[] args)
	{
		// Create an hourly worker named Sally that makes 13.75 per hour
		HourlyWorker sally = new HourlyWorker("Sally", 13.75);
		// Create a salaried worker named Harry that also makes 13.75 per hour
		SalariedWorker harry = new SalariedWorker("Harry", 13.75);
		// Output the Sally and her vitals plus how much she makes if she works 30 hours
		System.out.println(sally + " makes " + computePay(sally, 30) + " in 30 hours");
		// Output the Harry and his vitals plus how much he makes if he works 30 hours
		System.out.println(harry + " makes " + computePay(harry, 30) + " in 30 hours");
		// Output the Sally and her vitals plus how much she makes if she works 50 hours
		System.out.println(sally + " makes " + computePay(sally, 50) + " in 50 hours");
		// Output the Harry and his vitals plus how much he makes if he works 50 hours
		System.out.println(harry + " makes " + computePay(harry, 50) + " in 50 hours");
	}
	
	/**
	 *	This method returns the amount of pay a worker makes for working
	 *	the number of hours passed.
	 *	@param w the worker to compute the weekly pay for.
	 *	@param hours the number of hours the worked work for the week.
	 *	@return returns a string representing the money amount earned for
	 *			the week.  The string is formatted in US currency.
	 */
	public static String computePay(Worker w, int hours)
	{
		// Create the money formatter
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		// Compute the pay for the week for the worker, and

		// convert the numeric amount into US currency string format.
		return nf.format(w.computePay(hours));
	}
}