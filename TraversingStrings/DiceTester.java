public class DiceTester
{
	public static void main (String[]args)
	{
		Dice a = new Dice(8);
		Dice b = new Dice(8);
		int x;
		int y;
		do
		{
			x = a.roll();
			y = b.roll();
			System.out.println("You rolled a " + x + " and a " + y + ".");
		}while (x!=y);
		System.out.println("It took " + a.numRolls() + " rolls to get a matching pair.");
	}
}