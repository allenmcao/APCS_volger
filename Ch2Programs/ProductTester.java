public class ProductTester
{
	public static void main (String[]args)
	{
		Product eggs = new Product("eggs", 10.5);
		System.out.println(eggs.getName());
		System.out.println(eggs.getPrice());
		Product beans = new Product("beans", 7.4);
		System.out.println(beans.getName());
		System.out.println(beans.getPrice());
		
		eggs.setPrice(eggs.getPrice()-5.);
		beans.setPrice(beans.getPrice()-5.);
		System.out.println(eggs.getName());
		System.out.println(eggs.getPrice());
		System.out.println(beans.getName());
		System.out.println(beans.getPrice());
	}
}