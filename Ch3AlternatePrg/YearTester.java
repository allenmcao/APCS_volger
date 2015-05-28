public class YearTester
{
	public static void main(String[] args)
	{
		Year y1 = new Year(2001);
		System.out.print("Month is " + y1.getEasterSundayMonth());
		System.out.println(". Day is " + y1.getEasterSundayDay());
		System.out.println();

		Year y2 = new Year(1955);
		System.out.print("Month is " + y2.getEasterSundayMonth());
		System.out.println(". Day is " + y2.getEasterSundayDay());
		System.out.println();

		Year y3 = new Year(1800);
		System.out.print("Month is " + y3.getEasterSundayMonth());
		System.out.println(". Day is " + y3.getEasterSundayDay());
	}
}