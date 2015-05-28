public class Dice
{
	private int rolls;
	private int sides;
	/**
		Creates a die with 'sides' sides,
		roll counter set to zero,
	*/
	public Dice(int side)
	{
		sides = side;
		rolls = 0;
	}
	/**
		Rolls the die and returns the value rolled.
		Roll counter is also incremented by one.
		@return returns random integer value from 1 to sidesOfDie
	*/
	public int roll()
	{
		rolls++;
		return (int)(Math.random()*sides+1);
	}
	/**
		Returns the number of sides the die has.
		@return returns the number of sides the die has
	*/
	public int numSides()
	{
		return sides;
	}
	/**
		Returns the number of times the die has been rolled.
		@return returns the number of times the die has been rolled
	*/
	public int numRolls()
	{
		return rolls;
	}
}