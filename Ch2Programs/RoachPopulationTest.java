public class RoachPopulationTest
{
	public static void main (String[]args)
	{
		RoachPopulation r = new RoachPopulation(10);
		r.waitForDoubling();
		r.spray();
		System.out.println(r.getRoaches());
		
		r.waitForDoubling();
		r.spray();
		System.out.println(r.getRoaches());
		
		r.waitForDoubling();
		r.spray();
		System.out.println(r.getRoaches());
	}
}