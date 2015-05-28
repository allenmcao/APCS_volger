public class SalariedWorker extends Worker
{
	public SalariedWorker(String n, double s)
	{
		super(n,s);
	}
	
	public double computePay(double hours)
	{
		return getSalary()*40.0;
	}
	
	public String toString()
	{
		return getName() + " with salaried wage " + getSalary();
	}
}