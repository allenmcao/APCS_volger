import java.util.List;
import java.util.ArrayList;

public class SortValid
{
	public static void main(String[]args)
	{
		PermutationGenerator perm = new PermutationGenerator(32);

		System.out.print("Unsorted array before: ");
		Integer[] a = perm.getArray();
		for(int k = 0;k<a.length-1;k++)
			System.out.print(a[k] + ", ");
		System.out.println(a[a.length-1]);
		insertionSort(a);
		System.out.print("Sorted array after insertion: ");
		for(int k = 0;k<a.length-1;k++)
			System.out.print(a[k] + ", ");
		System.out.println(a[a.length-1]);

		System.out.print("Unsorted array before: ");
		a = perm.getArray();
		for(int k = 0;k<a.length-1;k++)
			System.out.print(a[k] + ", ");
		System.out.println(a[a.length-1]);
		selectionSort(a);
		System.out.print("Sorted array after selection: ");
		for(int k = 0;k<a.length-1;k++)
			System.out.print(a[k] + ", ");
		System.out.println(a[a.length-1]);

		System.out.print("Unsorted array before: ");
		a = perm.getArray();
		for(int k = 0;k<a.length-1;k++)
			System.out.print(a[k] + ", ");
		System.out.println(a[a.length-1]);
		mergeSort(a);
		System.out.print("Sorted array after merge: ");
		for(int k = 0;k<a.length-1;k++)
			System.out.print(a[k] + ", ");
		System.out.println(a[a.length-1]);
	}

	public static void insertionSort(Comparable[] a)
	{
		for(int i = 1;i<a.length;i++)
		{
			Comparable newItem = a[i];
			int insertPos= i;
			while(insertPos!=0 && (newItem.compareTo(a[insertPos-1])<0))
			{
				a[insertPos] = a[insertPos-1];
				insertPos--;
			}
			a[insertPos] = newItem;
		}
	}

	public static void selectionSort(Comparable[] a)
	{
		int last = a.length-1;

		while (last>0)
		{
			int maxPos = 0;
			int currentPos = 1;
			while(currentPos<last+1)
			{
				if (a[currentPos].compareTo(a[maxPos])>0)
					maxPos = currentPos;
				currentPos++;
			}
			Comparable temp = a[maxPos];
			a[maxPos] = a[last];
			a[last] = temp;
			last--;
		}
	}

	public static void mergeSort(Comparable[] a)
	{
		Comparable[] tmpArray = new Comparable[a.length];
		mergeSort(a, tmpArray, 0, a.length-1);
	}

	private static void mergeSort(Comparable[] a, Comparable[] tmpArray, int left, int right)
	{
		if (left<right)
		{
			int center = (left + right) / 2;
			mergeSort(a, tmpArray, left, center);
			mergeSort(a, tmpArray, center+1, right);
			merge(a, tmpArray, left, center+1, right);
		}
	}

	private static void merge(Comparable[] a, Comparable[] tmpArray, int leftPos, int rightPos, int rightEnd)
	{
		int leftEnd = rightPos-1;
		int tmpPos = leftPos;
		int numElements = rightEnd - leftPos + 1;

		while (leftPos <= leftEnd && rightPos <= rightEnd)
			if (a[leftPos].compareTo(a[rightPos])<0)
				tmpArray[tmpPos++] = a[leftPos++];
			else
				tmpArray[tmpPos++] = a[rightPos++];

		while (leftPos <= leftEnd)
			tmpArray[tmpPos++] = a[leftPos++];
		while (rightPos <= rightEnd)
			tmpArray[tmpPos++]=a[rightPos++];
		for(int i = 0; i<numElements;i++,rightEnd--)
			a[rightEnd] = tmpArray[rightEnd];
	}
}