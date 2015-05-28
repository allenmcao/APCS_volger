public class AirlineRoutesDriver
{
	public static void main(String[] args)
	{
		AirlineRoutes r = new AirlineRoutes();
		System.out.println(r);
		System.out.println("From city 4 to city 1  takes " + r.minTime(3,0) + " hours");
		System.out.println("From city 1 to 3 to city  " + r.minTime(0,2) + " hours");
		System.out.println("From city 3 to 3 to city  " + r.minTime(2,2) + " hours");
	}
}