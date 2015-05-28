// SodaCan test program

public class SodaCanTester
{
	public static void main(String[] args)
	{
			// Create a Soda Can with a height of 2 and width of 5
			SodaCan can = new SodaCan(1.5, 2.5);
			System.out.println("Volume is " + can.getVolume());
			System.out.println("Surface area is " + can.getSurfaceArea());
	}
}

/*
	If the hieght is 1.5 and the width 2.5 the results would be:
		Volume is 7.3631077818510775
		Surface area is 21.598449493429825
*/