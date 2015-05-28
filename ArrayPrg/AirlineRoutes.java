public class AirlineRoutes
{
	private int[][] routes;
	
	/**
	 *	Creates a table with direct flight times for 4 cities.
	 */
	public AirlineRoutes()
	{
		routes = new int[4][4];
		for (int k = 0; k < routes.length; k++)
			routes[k][k] = 0;
		routes[0][1] = 3;
		routes[0][2] = 2;
		routes[0][3] = 6;
		routes[1][0] = 3;
		routes[1][2] = 1;
		routes[1][3] = 3;
		routes[2][0] = 2;
		routes[2][1] = 1;
		routes[2][3] = 5;
		routes[3][0] = 5;
		routes[3][1] = 4;
		routes[3][2] = 2;
	}
	
	/**
	 *	Returns the shortest flying time from start to destination
	 *	going through at most one intermediate city.
	 *	@precondition 1 <= start <= N (where N is size of matrix)
	 *	@precondition 1 <= destination <= N (where N is size of matrix)
	 *		Note that cities are labeled 1 to N , whereas the matrix
	 *		is indexed from 0 to N-1
	 *	@param start the city to start the flight from
	 *	@param destination the city to end the flight at
	 *	@return returns the least number of hours going from start
	 *			city to destination.  The flight can be direct or
	 *			have a stop in one other city - Destination travleing
	 *			through at most one intermediate city.
	 */
	public int minTime(int start, int destination)
	{
		if(start==destination)
			return 0;
		int smallest=routes[start][destination];
		for(int k =0;k<=routes.length-1;k++)
		{
			if(k!=destination&&routes[start][k]<routes[start][destination])
			{
				int temp = routes[start][k]+routes[k][destination];
				if(temp<routes[start][destination]&&temp<smallest)
					smallest=temp;
			}
		}
		return smallest;
	}
	
	/**
	 *	Returns a string containing a chart showing the times
	 *	to each city in hours.
	 *	@return a table showing the time in hours for direct
	 *			flights from every city.
	 */
	public String toString()
	{
		String s = "\t\t\tDestination City\n\t\t";
		s += "\n\t\t\t";
		for (int k = 1; k <= routes[0].length; k++)
			s += "\t" + k;
		s += "\n\t\t";
		for (int k = 0; k <= routes[0].length; k++)
			s += "----";
		s += "-\n";
		for (int r = 0; r < routes[0].length; r++)
		{
			if (r == 1)
				s += "Start";
			else if (r == 2)
				s += "City";
			else
				s += "\t";
			s += "\t" + (r+1) + "\t|\t";
			for (int c = 0; c < routes[r].length; c++)
				s += routes[r][c] + "\t";				
			s += "\n";			
		}
		return s;
	}

}