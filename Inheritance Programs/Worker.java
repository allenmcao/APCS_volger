public abstract class Worker
{
	private String name;
	private double salary;
	
	public Worker(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return name + " with wage " + salary;
	}
	public abstract double computePay(double hours);
}