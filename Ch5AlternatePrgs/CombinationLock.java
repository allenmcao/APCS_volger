public class CombinationLock
{		
	private String wanted;
	private String combo;
	int length;
	private String lastLetters;
	private boolean open;
		
	public CombinationLock(String aderp)
	{
		wanted = aderp;
		lastLetters = "";
		combo = "";
		/** constructs a lock with a given combination. @param aCombination the combination; a string with three uppercase letters A..Z*/
	}
	
	public void setPosition(String aNum)
	{
		/**set the dial to a position. @param aPosition a string consisting of a single uppercase letter A...Z*/
		combo = combo + aNum;
		length = combo.length();
	}
		
	public void unlock()
	{
		/**try unlocking the lock*/
		length = combo.length();
		if(length>2)
			lastLetters = combo.substring(length-3, length);
		else
			lastLetters = combo;

		if (lastLetters.equals(wanted))
			open = true;
		else
			open = false;
	}
		
	public String isOpen()
	{
		/**check whether the lock is unlocked @return ture of the lock is currently open*/		
		if (open)
			return "The lock is open";
		else
			return "The lock is closed";
	}
		
	public void lock()
	{
		/**close the lock.*/
		open = false;
		combo = "";
		lastLetters = "";
	}
	
	public void test()
	{
			System.out.println(combo);
			System.out.println(lastLetters);
	}
}