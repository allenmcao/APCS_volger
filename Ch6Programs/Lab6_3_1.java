public class Lab6_3_1
{
	public static void main(String[] args)
	{
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int total4 = 0;
		int total5 = 0;
		int total6 = 0;

		// Place your for loop here
		for (int ctr=0;ctr<100;ctr++)
		{
			int durp = (int)(Math.random()*6)+1;
			if (durp == 1)
				total1++;
			if (durp == 2)
				total2++;
			if (durp == 3)
				total3++;
			if (durp == 4)
				total4++;
			if (durp == 5)
				total5++;
			if (durp == 6)
				total6++;
		}
		
		System.out.println("sum is 1 = " + total1);
		System.out.println("sum is 2 = " + total2);
		System.out.println("sum is 3 = " + total3);
		System.out.println("sum is 4 = " + total4);
		System.out.println("sum is 5 = " + total5);
		System.out.println("sum is 6 = " + total6);
	}
}