import java.text.NumberFormat;

public class Chp6Loop3a
{
	public static void main(String[] args)
	{
		showTable(9, 20);
		System.out.println();
		showTable(89, 101);
	}
	
	/**
		Displays in three columns: Number, Number Sqaured, Square root of number
		@param low the lowest limit of the series to display
		@param high the highest limit of the series to display
		@precondition pre low < high
	*/
	public static void showTable(int low, int high)
	{
		int diff = high-low;
		System.out.println("Number\tNumber Squared\tSquare Root of Number");
		NumberFormat f = NumberFormat.getNumberInstance();
		f.setMaximumFractionDigits(1);
		f.setMinimumFractionDigits(1);
		for (int ctr = 0; ctr<diff; ctr++)
		{
			System.out.println(low+"\t\t"+(int)Math.pow(low,2)+"\t\t\t\t"+f.format(Math.sqrt(low)));
			low++;
		}
	}
}