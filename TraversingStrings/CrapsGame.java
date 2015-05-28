public class CrapsGame
{
	private int point;
	Dice a;
	Dice b;
	/**
		Create two six sided die
		set the point value to -1
	*/
	public CrapsGame()
	{
		a = new Dice(6);
		b = new Dice(6);
		point = -1;
	}
	
	/**
		Call the rollDice method and store the first roll sum in point.
		If the first point is 7 or 11 display you win and exit
		If the first point is 2, 3, or 12 display you lose and exit
		If you did not win or lose, roll again until
			You match your point value - Display you won and exit
			Your roll value is 7 - Display you lost and exit
	*/
	public void play()
	{
		point = rollDice();
		if (point==7 || point==11)
		{
			System.out.println("You WIN!");
			System.exit(0);
		}
		else if (point==2 || point==3 || point==12)
		{
			System.out.println("You LOSE");
			System.exit(0);
		}
		else
		{
			int lastRoll = point;
			do
			{
				point=rollDice();
			} while(point!=lastRoll && point!=7);
			
			if (point==7)
			{
				System.out.println("You LOSE");
				System.exit(0);
			}
			else
			{
				System.out.println("You WIN");
				System.exit(0);
			}
		}
	}
	
	/**
		Returns the sum of the two six-sided die rolled.
		Display the value of the two dice, and their sum.
		@return returns the sum of the two six-sided die rolled
	*/
	private int rollDice()
	{
		int h = a.roll();
		int i = b.roll();
		int x = h+i;
		System.out.println("You rolled a " + h + " and a " + i + ". The sum is " + x + ".");
		return x;
	}
}