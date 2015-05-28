import java.util.List;
import java.util.ArrayList;

public class Storage
{
	private List<Integer> storage;
	
	/**
	 *Constructs a Storage with ten random integer values from 1-100
	 */
	public Storage(int x)
	{
		storage = new ArrayList<Integer>();
		for(int k=0;k<x;k++)
			storage.add((int)(Math.random()*100)+1);
	}
	
	/**
	 *Returns the real average of the numbers in the list.
	 *@return returns the average value of the numbers in the list.
	 */
	public double getAverage()
	{
		double sum=0;
		for(int k=0;k<storage.size();k++)
			sum+=storage.get(k);
		return sum/storage.size();
	}
	
	/**
	 *Returns a list of integers above the average.
	 *@return returns the list of integers above the average.
	 */
	public List<Integer> aboveAverage()
	{
		double aver = getAverage();
		List herp = new ArrayList<Integer>();
		for(int k = 0;k<storage.size();k++)
			if(storage.get(k)>aver)
				herp.add(storage.get(k));
		return herp;
	}
}