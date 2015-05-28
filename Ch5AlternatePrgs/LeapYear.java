public class LeapYear
{
	private double year;
	
	public Year(double derp)
	{
		year = derp;
	}
	
	public boolean isLeapYear()
	{
		if (year%4==0 && year%100!=0 || year%400==0)
			return true;
		else
			return false;
	}
}