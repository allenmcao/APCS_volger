public class Register
{
	private double total;
	public Register()
	{
		total = 0;
	}
	
	public void addTotal(double value)
	{
		total += value; 
	}
	
	public double getTotal()
	{
		return total;
	}
}