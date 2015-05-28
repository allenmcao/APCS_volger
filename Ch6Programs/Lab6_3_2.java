public class Lab6_3_2
{
	public static void main(String[] args)
	{
		int total2 = 0;
		int total3 = 0;
		int total4 = 0;
		int total5 = 0;
		int total6 = 0;
		int total7 = 0;
		int total8 = 0;
		int total9 = 0;
		int total10 = 0;
		int total11 = 0;
		int total12 = 0;

		// Place your for loop here
		for (int ctr=0;ctr<100;ctr++)
		{
			int durp = (int)(Math.random()*6)+1 + (int)(Math.random()*6) + 1;
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
			if (durp == 7)
				total7++;
			if (durp == 8)
				total8++;
			if (durp == 9)
				total9++;
			if (durp == 10)
				total10++;
			if (durp == 11)
				total11++;
			if (durp == 12)
				total12++;
		}
		
		System.out.println("sum is 2 = " + total2);
		System.out.println("sum is 3 = " + total3);
		System.out.println("sum is 4 = " + total4);
		System.out.println("sum is 5 = " + total5);
		System.out.println("sum is 6 = " + total6);
		System.out.println("sum is 7 = " + total7);
		System.out.println("sum is 8 = " + total8);
		System.out.println("sum is 9 = " + total9);
		System.out.println("sum is 10 = " + total10);
		System.out.println("sum is 11 = " + total11);
		System.out.println("sum is 12 = " + total12);
	}
}