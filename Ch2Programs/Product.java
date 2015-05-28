public class Product
{
	private double price;
	private String name;
	
	public Product(String n, double p)
	{
		price = p;
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice (double newPrice)
	{
		price = newPrice;
	}
}