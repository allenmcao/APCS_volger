public class SubsetSumTester
{
	private static int rctr = 0;	// debug recursive call counter
	
	public static void main(String[] args)
	{
		int[] a = {3, 7, 1, 8};
		boolean[] results = {true, false, true, true, false, false, true, true, true, true, true, true, false, false, true, true, false, true, true, false};
		
		final int MAX = 20;
		
		int ctr = 0;
		for (int target = 1; target <= MAX; target++)
		{
			boolean result = subsetSum(a,target);
			System.out.print("Target = " + target);
			System.out.print(" Version 1 = " + result);
			System.out.print(" Version 2 = " + results[target-1]);
			if (result == results[target-1])
			{
				System.out.println(" matches");
				ctr++;
			}
			else
				System.out.println(" does NOT match");
		}
		if (ctr == MAX)
			System.out.println("Algorithm works.");
		else
			System.out.println("Algorithm has a problem.");
		System.out.println("Number of recursive calls " + rctr);
	}
	
	public static boolean subsetSum(int a[], int target)
	{
		return recSubset(a, target, 0, 0);
	}

	
	/**
	 *	@param a the array to check in
	 *	@param target the value you are trying to sum up using values in array a
	 *	@param i is the index of the next element to consider
	 *	@param sumSoFar is the sum of elements included in the solution so far
	 *	@return returns true if there is a sum in array a that equals target
	 */
	private static boolean recSubset(int[] a, int target, int i, int sumSoFar)
	{
		rctr++;	// debug counter - Leave as first line
		
		for(int k = 0;k<a.length;k++)
			if (target==a[k])
				return true;
		
		if(sumSoFar==target)
		{
			return true;
		}
			
		else
		{
			if(i!=a.length)
			{
				return recSubset(a,target,i+1,sumSoFar+a[i])||recSubset(a,target,i+1,sumSoFar);
			}			
		}
		return false;
	}
}