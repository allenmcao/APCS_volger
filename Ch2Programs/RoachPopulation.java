public class RoachPopulation
{
	private int population;
	
	public RoachPopulation(int init)
	{
		population = init;
	}
	
	public void waitForDoubling ()
	{
		population = population*2;
	}
	
	public void spray()
	{
		population = (int)Math.round(population*(.9));
	}
	
	public int getRoaches()
	{
		return population;
	}
}