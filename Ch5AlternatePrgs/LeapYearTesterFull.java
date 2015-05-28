public class LeapYearTesterFull
{
	public static void main(String[] args)
	{
		int[] years = {1999, 2000, 2001, 2004, 2006, 2020, 2200, 2400};
		
		for (int k = 0; k < years.length; k++)
		{
			Year y = new Year(years[k]);
			System.out.print(years[k] + "\t");
			if (y.isLeapYear())
				System.out.println("It's a leap year!");
			else
				System.out.println("It's NOT a leap year...");
		}
	}
}