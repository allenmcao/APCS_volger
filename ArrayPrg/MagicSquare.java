/**
 *	Creates a magic square.
 *
 *	A magic square is a matrix of size n, that is filled with
 *	the integer values 1 to n^2 so that all rows , columns and
 *	diagonals add up to the same value.
 */
 
public class MagicSquare
{
	private int[][] square;
	private static final int EMPTY = -1;
	
	/**
	 *	Creates a valid matrix for a magic square to be implemented.
	 *	@param n the size of the magic square
	 *	@exception Throws an exception if n is not positive or odd
	 */
	public MagicSquare(int n)
	{
		if (n < 0 || n % 2 == 0)
			throw new IllegalArgumentException("Not a valid size");
		square = new int[n][n];
		for (int r = 0; r < square.length; r++)
			for (int c = 0; c < square[r].length; c++)
				square[r][c] = EMPTY;
		makeMagicSquare();
	}
	
	/**
	 *	Fills in a matrix with numbers 1 to n^2 to make it a magic square.
	 *	@postcondition square is filled with numbers 1 to n^2 so it has the
	 *					properties of a magic square.
	 */
	private void makeMagicSquare()
	{
		square[square.length-1][square.length/2]=1;
		int row=square[0].length-1;
		int col=square[0].length/2;
		int val=1;
		for(int k=2;k<=(square[0].length*square[0].length);k++)
		{
			row++;
			if (row>=square[0].length)
				row=0;
			col++;
			if (col>=square[0].length)
				col=0;
			if(square[row][col]==-1)
				square[row][col]=k;
			else
			{
				row--;
				if(row<0)
					row=square.length-1;
				col--;
				if(col<0)
					col=square.length-1;
				while(square[row][col]!=-1)
				{
					row-=1;
					if (row<0)
						row=square[0].length-1;
				}
			}
			square[row][col]=k;
		}
	}
	
	/**
	 *	Checks to see if the matrix is a magic square, that is
	 *	all the rows, columns and diagonals add up to the same
	 *	value.
	 *	@return returns true if the matrix square is a mgaic square,
	 *			otherwise returns false.
	 */
	public boolean isMagicSquare()
	{
		int sum=0;
		int magic=magicSquareSum();
		for(int k=0;k<square.length;k++)
		{
			sum=0;
			for(int a = 0; a < square[0].length; a++)
				sum += square[0][a];
			if(sum!=magic)
				return false;
				
			sum=0;
			for(int a = 0; a < square[0].length; a++)
				sum+=square[a][0];
			if(sum!=magic)
				return false;
				
			sum=0;
			for(int a=0; a<square[0].length;a++)
				sum+=square[a][a];
			if(sum!=magic)
				return false;
			
			sum=0;
			for(int a=0; a<square[0].length;a++)
				sum+=square[a][square.length-1-a];
			if(sum!=magic)
				return false;
		}
		
		return true;
	}
	
	/**
	 *	Returns what each row, column and diagonal should be
	 *	for the magic square by summing the first row.
	 *	@return returns the sum of the first row of square.
	 */
	public int magicSquareSum()
	{
		int sum = 0;
		for (int c = 0; c < square[0].length; c++)
			sum += square[0][c];
		return sum;
	}
	
	/**
	 *	Returns a string display the values in the matrix
	 *	in matrix form.
	 *	@return returns a string with the values of the matrix
	 *			in matrix form.
	 */
	public String toString()
	{
		String s = "";
		for (int r = 0; r < square[0].length; r++)
		{
			for (int c = 0; c < square[r].length; c++)
				s += square[r][c] + "\t";
			s += "\n";			
		}
		return s;
	}
}