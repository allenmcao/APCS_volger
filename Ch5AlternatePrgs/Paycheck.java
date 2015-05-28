public class Paycheck
{
	private String name;
	private double wage;
	private double hours;
	
	public Paycheck(String derp1, double derp2, double derp3)
	{
		name = derp1;
		wage = derp2;
		hours = derp3;
	}
	
	public double computePay()
	{
		if (hours >= 40)
			return 1.5*wage*(hours-40) + (wage*40);
		else
			return (wage*hours);
	}
}