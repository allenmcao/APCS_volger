public class GCDTester
{
	public static void main(String[] args)
	{
		int[] input1 = {535816197, 1016596300, 1707738648, 2083695471, 1145504886, 992644164,
		                110118218, 1919617565, 1933288984, 1817596376, 1797536180, 150746067, 1721370966, 298188700, 1622116551,
		                82228244, 822761303, 1996261159, 803560354,417522248, 571949809, 259859715, 1746490352, 341375991};
		int[] input2 = {1948999710, 497355468, 1175593725, 1548674380, 1757455296, 1096201726,
		                381042711, 763444143, 1650584672, 853302744, 1957672665, 50762382, 2003542980, 537811865,1094375601,
		                711720884, 530104705, 983225157, 1817350846, 998835616, 227732360, 114627399, 1829919585, 696360269};
		                
		int[] output = {21, 4, 3, 11, 6, 2, 7, 1, 88, 8, 5, 3, 6, 5, 33, 28, 13, 1, 2, 8, 1, 3, 1, 11};
		
		boolean itWorks = true;
		for (int k = 0; k < input1.length; k++)
		{
			if (GCD(input1[k], input2[k]) != output[k])
				itWorks = false;
		}
		if (itWorks)
			System.out.println("Your GCD works");
		else
			System.out.println("Doesn't work");	

	}
	
	/**
	 *	Returns the Greatest Common Divisor of the two integers passed
	 *	@param m first of two integers to find GCD of
	 *	@param n second of two integers to find GCD of
	 *	@return returns the Greatest Common Divisor of m & n
	 */
	public static int GCD(int m, int n)
	{
		// Place your code for the GCD here
		if(n == 0) 
		{
        	return m;
	    }
	    int r=m%n;
	    return GCD(n,r);
	}
	
}
