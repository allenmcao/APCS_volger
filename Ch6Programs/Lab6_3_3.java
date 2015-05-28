public class Lab6_3_3
{
	public static void main(String[] args)
	{
		double count = 0;
		for (int ctr = 0; ctr < 100000; ctr++)
		{
			double x = Math.random();
			double y = Math.random();
			if (Math.sqrt(Math.pow(x,2)+Math.pow(y,2))<1)
				count+=1.0;
		}
		count = count/100000.0*4.0;
		System.out.println(count);
	}
}