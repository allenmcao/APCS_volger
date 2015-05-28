public class SearchTiming
{
	public static void main(String[] args)
	{
		Integer[] a = new Integer[1000];
		for(int k = 1;k<a.length+1;k++)
			a[k-1]=k;
		long start;
		long stop;
		long total;
		System.out.println("Linear-searching for 3, found at index " + linearSearch(a, 3));
		start = System.nanoTime();
		linearSearch(a, 3);
		stop = System.nanoTime();
		total = stop - start;
		System.out.println("Time elapsed was " + total + " nanoseconds\n");

		System.out.println("Binary-searching for 3, found at index " + binarySearch(a, 3));
		start = System.nanoTime();
		binarySearch(a, 3);
		stop = System.nanoTime();
		total = stop - start;
		System.out.println("Time elapsed was " + total + " nanoseconds\n");

		System.out.println("Linear-searching for 100001, found at index " + linearSearch(a, 100001));
		start = System.nanoTime();
		linearSearch(a, 100001);
		stop = System.nanoTime();
		total = stop - start;
		System.out.println("Time elapsed was " + total + " nanoseconds\n");

		System.out.println("Binary-searching for 100001, found at index " + binarySearch(a, 100001));
		start = System.nanoTime();
		binarySearch(a, 100001);
		stop = System.nanoTime();
		total = stop - start;
		System.out.println("Time elapsed was " + total + " nanoseconds\n");
	}

	private static int linearSearch(Object[] list, Object x)
	{
		for(int k=0;k<list.length;k++)
			if(list[k].equals(x))
				return k;
		return -1;
	}

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
		return -1;
	}
}