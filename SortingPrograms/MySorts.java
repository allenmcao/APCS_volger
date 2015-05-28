public class MySorts
{
	public static void main(String[]args)
	{
		PermutationGenerator perm = new PermutationGenerator(32);

		Integer[] a = perm.getArray();
		System.out.print("Unsorted array before: ");
		for(int k = 0;k<a.length-1;k++)
			System.out.print(a[k] + ", ");
		System.out.println(a[a.length-1]);
		selectionSort(a);
		System.out.print("Sorted array after insertion: ");
		for(int k = 0;k<a.length-1;k++)
			System.out.print(a[k] + ", ");
		System.out.println(a[a.length-1]);
	}

	public static void insertionSort(Comparable[] a)
	{
		for(int k = 1;k<a.length;k++)
		{
			Comparable newItem = a[k];
			int insertPos = k;
			while(insertPos!=0&&(newItem.compareTo(a[insertPos-1])<0))
			{
				a[insertPos]=a[insertPos-1];
				insertPos--;
			}
			a[insertPos]=newItem;
		}
	}

	public static void selectionSort(Comparable[] x)
	{

		for(int i=0;i<x.length-1;i++)
		{
			int smallest = i;
			for(int j=i+1;j<x.length;j++)
			{
				if (x[smallest].compareTo(x[j])>0)
				{
					smallest=j;
				}
			}
			Comparable temp = x[i];
			x[i]=x[smallest];
			x[smallest] = temp;
		}
	}

	public static void selectionSort1(Integer[] x)
	{
	    for (int i=0; i<x.length-1; i++)
	    {
	        for (int j=i+1; j<x.length; j++)
	        {
	            if (x[i] > x[j])
	            {
	                int temp = x[i];
	                x[i] = x[j];
	                x[j] = temp;
	            }
	        }
    	}
	}

	public static void selectionSort2(Integer[] x)
	{
	    for (int i=0; i<x.length-1; i++)
	    {
	        int minIndex = i;      // Index of smallest remaining value.
	        for (int j=i+1; j<x.length; j++)
	        {
	            if (x[minIndex] > x[j])
	            {
	                minIndex = j;  // Remember index of new minimum
	            }
	        }

	            //...  Exchange current element with smallest remaining.
	            int temp = x[i];
	            x[i] = x[minIndex];
	            x[minIndex] = temp;

    	}
	}
}