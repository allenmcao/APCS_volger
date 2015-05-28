public class CashierTest
{
	public static void main(String[] args)
	{
		Cashier harry = new Cashier();
		
		harry.setAmountDue(9.37);
		harry.receive(20);
		System.out.println("Dollar change = " + harry.returnDollars());
		System.out.println("Quarter change = " + harry.returnQuarters());
		System.out.println("Dime change = " + harry.returnDimes());
		System.out.println("Nickel change = " + harry.returnNickels());
		System.out.println("Penny change = " + harry.returnPennies());
	}
}