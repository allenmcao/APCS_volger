import javax.swing.JOptionPane;

public class ArraySums
{
	public static void main(String[] args)
	{
		String input;
		int[] array = null;
		int[] partialArray = null;
		do {
			input = JOptionPane.showInputDialog("1 Input Array\n2 Compute Partial Sums" +
			                                    "\n3 Display Original Array" + 
			                                    "\n4 Display Partial sum Array\n5 Exit");
			if (input != null && !input.equals(""))
			{
				int choice = -1;
				try {
					choice = Integer.parseInt(input);					
				}
				catch (Exception e)
				{}
				switch (choice)
				{
					case 1: array = getArray();
					        break;
					case 2: partialArray = ComputePartialSums(array);
					        break;
					case 3: display(array);
					        break;
					case 4: display(partialArray);
					        break;
					case 5: input = null;
				}
			}
		} while (input != null);
		System.exit(0);
	}
	
	/**
	 *	Returns the sum of the first n locations of the array passed.
	 *	@param n is  1 <= n <= a.length
	 *	@param array is an initialized array
	 *	@return  returns a[0] + ... + a[n-1]
	 */
	public static int arraySum(int[] array, int n)
	{
		int sum =0;
		for(int k =0;k<n;k++)
			sum+=array[k];
		return sum;
	}
	
	/**
	 *	computePartialSums assigns values to a array B such that 
	 *	B[k] = A[0] + A[1] + ... + A[k] for all values k such 
	 *	that 0 <= k < A.length; i.e., each entry in B has a value 
	 *	equal to the sum of all entries with equal or lower indexes in A. 
	 *	@param array is an initialized array
	 *	@return returns an array B such that B[k] = A[0] + A[1] + ... + A[k] 
	 *			for all values k such that 0 <= k < A.length; i.e., each 
	 *			entry in B has a value equal to the sum of all entries with 
	 *			equal or lower indexes in A. 
	 */
	public static int[] ComputePartialSums(int[] array)
	{
		int[] b= new int[array.length];
		for(int k=0;k<array.length;k++)
		{
			b[k]=arraySum(array, k+1);
		}
		return b;
	}

	/**
	 *	Returns an unordered integer array.
	 *	@return returns an unordered integer array.
	 */
	public static int[] getArray()
	{
		int[] array = new int[10];	// Allow 10 integers to be entered
		int ctr = 0;
		String input;
		do {
			input = JOptionPane.showInputDialog("Enter an integer (Cancel to quit)");
			if (input != null && !input.equals(""))
			{
				int num = Integer.parseInt(input);
				if (ctr >= array.length)	// Array filled up?
				{
					int[] bigger = new int[array.length*2];	// Double the size of the array
					System.arraycopy(array, 0, bigger, 0, array.length);
					array = bigger;
				}
				array[ctr] = num;
				ctr++;
			}
		} while (input != null);
		if (ctr != array.length)
		{
			int[] bigger = new int[ctr];
			System.arraycopy(array, 0, bigger, 0, ctr);
			array = bigger;
		}
		return array;
	}

	/**
	 *	The contents of the array is displayed across the screen.
	 *	@param array the array to display.
	 *	@postcondtion the contents of the array are displayed across
	 *				the screen.
	 */
	public static void display(int[] array)
	{
		for(int k=0;k<array.length-1;k++)
			System.out.print(array[k]+", ");
		System.out.println(array[array.length-1]);
	}
}
