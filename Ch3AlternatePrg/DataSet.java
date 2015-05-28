public class DataSet
{
	private int largest;
	private int smallest;
	
	public DataSet ()
	{
		largest = Integer.MIN_VALUE;
		smallest = Integer.MAX_VALUE;
	}
	
	public void addValue(int num)
	{
		largest = Math.max(largest,num);
		smallest = Math.min(smallest,num);
	}
	
	public int getLargest ()
	{
		return largest;
	}
	
	public int getSmallest ()
	{
		return smallest;
	}
}