public class BackwardsStringTester
{
	public static void main(String[] args)
	{
		long start;
		long stop;
		long total;
		start = System.currentTimeMillis();
		boolean itWorks = true;
		for (int cases = 0; cases < 2000; cases++)
		{
			int length = (int) (Math.random() * 100) + 20;
			String fs = "";
			String bs = "";
			for (int len = 0; len < length; len++)
			{
				char ch = (char)((int)(Math.random() * 95) + 32);
				fs += ch;
				bs = ch + bs;
			}
			if (!bs.equals(backwards(fs)))
				itWorks = false;
		}
		stop = System.currentTimeMillis();
		total = stop - start;
		if (itWorks)
			System.out.println("Your Backwards String algorithm worked in " + total + " milliseconds");
		else
			System.out.println("Doesn't work");	

	}
	
	/**
	 *	Returns a string that is backwards from the one passed
	 *	@param s the String can have any have
	 *	@return returns a string that is backwards form the string passed
	 */
	public static String backwards(String s)
	{
		// Place your code here
		char c = s.charAt(s.length()-1);
        if(s.length() == 1) 
        	return Character.toString(c);   
        return c + backwards(s.substring(0,s.length()-1));
	}
}
