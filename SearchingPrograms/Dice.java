/*
 * Dice.java
 */

/**
 * Defines the Dice class.
 * A Dice can be rolled and can determine number of times it was rolled.
 * 
 * @author andrianoff
 * @version September 1, 2003
 *
 */
public class Dice
{
	private int sides;
	private int rolls;
	
	/**
	 * Creates a Dice with a given number of sides
	 * @param s the number of sides
	 */
	public Dice(int s)
	{
		sides = s;
		rolls = 0;
	}
	
	/**
	 * Creates a 6-sided Dice
	 */
	public Dice()
	{
		this(6);
	}
	
	/**
	 * Rolls the Dice returning the value of the roll.
	 * @return value rolled
	 */
	public int roll()
	{
		rolls = rolls + 1;
		double x;
		x = Math.random();
		return (int) Math.floor(x*sides) + 1;
	}
	
	/**
	 * Returns the number of times the Dice has been rolled
	 * @return the number of times the Dice has been rolled
	 */
	public int numRolls()
	{
		return rolls;
	}
}
