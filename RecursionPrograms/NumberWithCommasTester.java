public class NumberWithCommasTester
{
	public static void main(String[] args)
	{
		int[] input = {1000001012, -1000001012, -12, 0, 1000001010, 1000000000};
		String[] output = {"1,000,001,012", "-1,000,001,012", "-12", "0", "1,000,001,010", "1,000,000,000"};
		
		boolean itWorks = true;
		for (int k = 0; k < input.length; k++)
		{
			if (!output[k].equals(format(input[k])))
				itWorks = false;
		}
		if (itWorks)
			System.out.println("Your formatting  algorithm works");
		else
			System.out.println("Doesn't work");	

	}
	
	
	/**
	 *	Returns a String containing an integer value with commas placed
	 *	in the correct locations
	 *	@param num any integer value
	 *	@return returns the String representation of num with commas
	 */
	public static String format(int num)
	{
		// Place your code here
		if ((num>0&&num/1000<1)||num==0||(num<0&&num/1000>-1))
		{
			return num+ "";
		}
			
		else
		{
			int r = Math.abs(num)%1000;
			String zeros = "";
			for(int k = (r+"").length();k<3;k++)
				zeros+="0";
			return format(num/1000)+ "," + zeros + Math.abs(num)%1000;
		}
	}
}
