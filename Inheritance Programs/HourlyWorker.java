public class HourlyWorker extends Worker
{
	public HourlyWorker(String n, double s)
	{
		super(n,s);
	}
	
	public double computePay(double hours)
	{
		if (hours<=40.0)
		{
			return hours*getSalary();
		}
		else
		{
			return 40.0*getSalary()+(hours - 40)*1.5*getSalary();
		}
	}
	
	public String toString()
	{
		return getName() + " with hourly wage " + getSalary();
	}
}