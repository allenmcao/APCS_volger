public class Cashier
{
	private double amountDue;
	private double amountPaid;
	private int needed;
	
	public Cashier()
	{
		amountDue = 0;
		amountPaid = 0;
	}
	
	public void setAmountDue(double due)
	{
		amountDue = due;
			
	}
	
	public void receive(double paid)
	{
		amountPaid = paid;
		needed = (int)((amountPaid-amountDue)*100 + 0.5);
	}
	
	public int returnDollars()
	{
		return needed/100;
	}
	
	public int returnQuarters()
	{
		return needed%100/25;
	}
	
	public int returnDimes()
	{
		return needed%100%25/10;
	}
	
	public int returnNickels()
	{
		return needed%100%25%10/5;
	}
	
	public int returnPennies()
	{
		return needed%100%25%10%5;
	}
}