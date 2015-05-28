public class Pair
{
	private int num1;
	private int num2;
	
		public Pair(int firstNumb, int secondNumb)
		{
			num1 = firstNumb;
			num2 = secondNumb;
		}
		
		public int getSum()
		{
			return num1 + num2;
		}
		
		public int getDifference()
		{
			return num1 - num2;
		}
		
		public int getProduct()
		{
			return num1*num2;
		}
		
		public double getAverage()
		{
			return (double)(num1+num2)/2.0;
		}
		
		public int getDistance()
		{
			return Math.abs(num1-num2);
		}
		
		public int getMaximum()
		{
			return Math.max(num1,num2);
		}
		
		public int getMinimum()
		{
			return Math.min(num1,num2);
		}
}