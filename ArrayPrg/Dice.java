public class Dice
{
	private int numSides;
	
	/**
	 *	Creates a die with the number of sides passed.
	 *	@param sides the number of sides to create on the die.
	 */
	public Dice(int sides)
	{
		numSides = sides;
	}
	
	/**
	 *	Returns a random integer from 1 to the number of sides on the die.
	 *	@return returns random integer from 1 to the number of sides on the die.
	 */
	public int roll()
	{
		return ((int) (Math.random() * numSides + 1));
	}
}