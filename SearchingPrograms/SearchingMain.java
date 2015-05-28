public class SearchingMain
{
	private final static int ARRAY_SIZE= 1000;
	private final static int DIE_SIDES = 1000000;
	private final static int NOT_FOUND = -1;

	public static void main (String[]args)
	{
		Integer[] a = new Integer[ARRAY_SIZE];
		/*
		//1
		System.out.print("1. ");
		Dice die = new Dice(DIE_SIDES);
		for(int k = 0;k<a.length;k++)
		{
			a[k]=die.roll();
		}
		System.out.println("value is " + a[0]+ " at index " + 0);
		System.out.println("value is "+ a[a.length-1]+" at index " +(a.length-1));
		System.out.println("value is "+ a[a.length/2-1]+ " at index " + (a.length/2-1));

		//4
		for(int k = 1;k<a.length+1;k++)
			a[k-1]=k;

		//5
		for(int k = 1;k<a.length+1;k++)
			a[k-1]=k;
		long start;
		long stop;
		long total;
		System.out.println("Linear-searching for 100001, found at " + linearSearch(a, 100001));
		start = System.nanoTime();
		linearSearch(a, 100001);
		stop = System.nanoTime();
		total = stop - start;
		System.out.println("Time elapsed was " + total + " nanoseconds");

		System.out.println("Binary-searching for 100001, found at " + binarySearch(a, 100001));
		start = System.nanoTime();
		binarySearch(a, 100001);
		stop = System.nanoTime();
		total = stop - start;
		System.out.println("Time elapsed was " + total + " nanoseconds");
		*/

		//6
		for(int k = 1;k<a.length+1;k++)
			a[k-1]=k;
		System.out.println("Binary-searching for 487, found at " + binarySearch(a,487));

		/*
		//2
		System.out.print("\n2. Linear Searching");
		System.out.println("Searching for index " + 0 +", value "+ a[0] + ", found at index " + linearSearch(a,a[0]));
		System.out.println("Searching for index " + (a.length-1) +", value "+a[a.length-1] + ", found at index " + linearSearch(a,a[a.length-1]));
		System.out.println("Searching for index " + (a.length/2-1) +", value "+a[a.length/2-1] + ", found at index " + linearSearch(a,a[a.length/2-1]));
		System.out.println("Searching for index " + "??" +", value "+1000001 + ", found at index " + linearSearch(a,1000001));

		//3
		System.out.print("\n3. Binary Searching");
		System.out.println("Searching for index " + 0 +", value "+ a[0] + ", found at index " + binarySearch(a,a[0]));
		System.out.println("Searching for index " + (a.length-1) +", value "+a[a.length-1] + ", found at index " + binarySearch(a,a[a.length-1]));
		System.out.println("Searching for index " + (a.length/2-1) +", value "+a[a.length/2-1] + ", found at index " + binarySearch(a,a[a.length/2-1]));
		System.out.println("Searching for index " + "??" +", value "+1000001 + ", found at index " + binarySearch(a,1000001));
		*/
	}

	/**
	 *Searches for an object in a list through a linear algorithm
	 *@param the list to search and the comparable object that is being searched for.
	 *@return returns the index value of the boject that is being searched for, or -1 if not found
	 */
	//2
	private static int linearSearch(Object[] list, Object x)
	{
		for(int k=0;k<list.length;k++)
			if(list[k].equals(x))
				return k;
		return NOT_FOUND;
	}

	/**
	 *Searches for an object in a list through a binary algorithm
	 *@param The list to search and the comparable object that is being searched for.
	 *@return returns the index value of the object that is being searched for, or -1 if not found
	 *@precondition list must be ordered ascending
	 */
	//3
	private static int binarySearch(Comparable[] list, Comparable x)
	{
		int low = 0;
		int high = list.length - 1;
		int mid;
		int ctr = 0;
		while (low <= high)
		{
			ctr++;
			mid = (low + high) / 2;
			int check = list[mid].compareTo(x);
			if (check == 0)
			{
				return mid;
			}
			if (check < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return NOT_FOUND;
	}
}