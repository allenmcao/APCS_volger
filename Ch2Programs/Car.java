public class Car
{
	private double mpg;
	private double gas;
	
	public Car(double mg)
	{
		mpg = mg;
		gas = 0;
	}
	
	public void addGas(double g)
	{
		gas += g;
	}
	
	public void drive(double d)
	{
		gas -= d/mpg;
	}
	
	public double getGas()
	{
		return gas;
	}
}