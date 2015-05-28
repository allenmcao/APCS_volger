public class TheMap
{
	private int[][] theMap;
	public static final int PEAK = 200;
	
	/**
	 *	Creates a rows x cols map with a river going through
	 *	a mountain range, the rows and cols are etierh 10x10 or 4x4
	 *	otherwise its all mountains!
	 */
	public TheMap(int rows, int cols)
	{
		theMap = new int[cols][cols];
		for (int r = 0; r < theMap.length; r++)
			for (int c = 0; c < theMap[r].length; c++)
				theMap[r][c] = PEAK;
		
		// The following data is for the 10x10 map
		if (rows == 10 && cols == 10)
		{
			theMap[0][0] = 100;
			theMap[0][1] = 99;
			theMap[1][1] = 98;
			theMap[2][1] = 97;
			theMap[2][2] = 96;
			theMap[3][2] = 95;
			theMap[3][6] = 85;
			theMap[3][7] = 84;
			theMap[3][8] = 83;
			theMap[4][2] = 94;
			theMap[4][3] = 93;
			theMap[4][4] = 92;
			theMap[4][6] = 86;
			theMap[4][8] = 82;
			theMap[5][4] = 91;
			theMap[5][6] = 87;
			theMap[5][8] = 81;
			theMap[6][4] = 90;
			theMap[6][5] = 89;
			theMap[6][6] = 88;
			theMap[6][8] = 80;
			theMap[7][8] = 79;
			theMap[7][2] = 50;
			theMap[7][3] = 49;
			theMap[8][2] = 49;
			theMap[9][2] = 48;
			theMap[8][8] = 78;
			theMap[8][9] = 77;
			theMap[9][9] = 76;
		} 
		else if (rows == 4 && cols == 4)
		{
			theMap[1][2] = 60;
			theMap[2][1] = 80;
			theMap[2][2] = 70;
			theMap[3][2] = 60;	
		}
	}

	/**
	 *	Returns true if water at location theMap[row][col] can move off the map
	 *	@param row the starting row location of the water
	 *	@precondition 0 <= row < theMap.length
	 *	@param col the starting column location of the water
	 *	@precondition 0 <= col < theMap[row].length
	 *	@returns returns true if water from location [row][col] can move
	 *				off the map
	 */
	public  boolean canFlowOffMap(int row, int col)
	{
		if(row==0||col==0||row==theMap.length-1||col==theMap.length-1)
			return true;
		else
		{
			boolean yes=false;
			if(theMap[row-1][col]<theMap[row][col])
				yes=yes||canFlowOffMap(row-1,col);
			if(theMap[row][col-1]<theMap[row][col])
				yes=yes||canFlowOffMap(row,col-1);
			if(theMap[row+1][col]<theMap[row][col])
				yes=yes||canFlowOffMap(row+1,col);
			if(theMap[row][col+1]<theMap[row][col])
				yes=yes||canFlowOffMap(row,col+1);
			return yes;
		}
	}
	
	/**
	 *	Returns a String containg the elevtations of the map
	 *	@return returns a string matrix with the elevations of the map
	 */
	public String toString()
	{
		String s = "";
		for (int r = 0; r < theMap.length; r++)
		{
			for (int c = 0; c < theMap[r].length; c++)
				s += "\t" + theMap[r][c];
			s += "\n";
		}
		return s;
	}

}