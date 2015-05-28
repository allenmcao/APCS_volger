public class DigitSumTester
{
	public static void main(String[] args)
	{
		int[] input = {1244097193, 450836016, 1455412765, 819768711, 1880233008, 287753479, 848380798, 1061473385, 1808560273, 1914954061, 315620411, 438872582, 270839207, 692226035, 1728635465, 134415288, 1818551403, 1637597046, 1912896563, 1966770878};
		int[] output = {40, 33, 40, 48, 33, 52, 55, 38, 40, 40, 23, 47, 38, 35, 47, 36, 36, 48, 50, 59};
		
		boolean itWorks = true;
		for (int k = 0; k < input.length; k++)
		{
			if (digitSum(input[k]) != output[k])
				itWorks = false;
		}
		if (itWorks)
			System.out.println("Your digit summer works");
		else
			System.out.println("Doesn't work");	
	}
	
	/**
	 *	Returns the sum of all the digits in a positive integer
	 *	@param num integer to sum digits in
	 *	@precondition num is positive
	 *	@return returns the sum of the digits in num
	 */
	public static int digitSum(int num)
	{
			// Place your code for the digit summer here
			if(num==0)
				return 0;
			else
				return num%10 +digitSum(num/10);
	}
}