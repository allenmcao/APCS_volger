import javax.swing.JOptionPane;

public class ZeroBetween
{
	public static void main(String[] args)
	{
		String input;
		int[] array = null;
		do {
			input = JOptionPane.showInputDialog("1 Input Array\n2 Zero Between" +
			                                    "\n3 Display Array\n4 Exit");
			if (input != null && !input.equals(""))
			{
				int choice = -1;
				try {
					choice = Integer.parseInt(input);
				} catch (Exception e)
				{
				}
				switch (choice)
				{
					case 1: array = getArray();
					        break;
					case 2: zeroBetween(array);
					        break;
					case 3: display(array);
					        break;
					case 4: input = null;
				}
			}
		} while (input != null);
		System.exit(0);
	}
	
	/**
	 *	Returns an unordered integer array with no duplicate values in it.
	 *	@return returns an unordered integer array with no duplicate values in it.
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
				boolean dup=false;
				for(int k=0;k<ctr;k++)
					if(array[k]==num)
						dup=true;
				if(!dup)
				{
					array[ctr]=num;
					ctr++;
				}
				else
					System.out.println("Duplicates aren't appreciated, the value was not added.");
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
	 *	Returns the position in the array of the largest value.
	 *	@param array the array to look in for the largest value.
	 *	@precondition array.length > 0.
	 *	@return returns the position within array that contains
	 *			the largest value.
	 */
	public static int posOfMax(int[] array)
	{
		int max=0;
		for(int k=0;k<array.length;k++)
		{
			if(array[k]>array[max])
				max=k;
		}
		return max;
	}

	/**
	 *	Returns the position in the array of the second largest value.
	 *	@param array the array to look in for the second largest value.
	 *	@precondition array.length > 1.
	 *	@return returns the position within array that contains
	 *			the second largest value.
	 */
	public static int posOf2nd(int[] array)
	{
		int max=posOfMax(array);
		int sec;
		if(max==0)
			sec=1;
		else
			sec=0;
		for(int k=0;k<array.length;k++)
		{
			if(k!=max&&array[k]>array[sec])
				sec=k;
		}
		return sec;
	}
	
	/**
	 *	Places zeroes in the array locaitons between the
	 *	largest and second largest values found in the array.
	 *	You MUST call posOfMax nand posOf2nd get get credit.
	 *	@param array the array to place zeros in.
	 *	@precondition array.length > 1.
	 *	@postcondition array has zeros in the array locations
	 *				between the larrgest and second largest
	 *				values found in the array.
	 */
	public static void zeroBetween(int[] array)
	{
		int max=posOfMax(array);
		int sec=posOf2nd(array);
		if(max>sec)
			for(int k=sec+1;k<max;k++)
				array[k]=0;
		else
			for(int k=max+1;k<sec;k++)
				array[k]=0;
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
			System.out.print(array[k]+ ", ");
		System.out.println(array[array.length-1]);
	}
}
