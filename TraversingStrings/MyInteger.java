public class MyInteger
{
	private String myint;
	
	public MyInteger(String num)
	{
		myint = num;
	}
	
	public int parseInt()
	{
		int length = myint.length();
		char digit;
		int digitNum;
		int sum=0;
		
		if (myint.charAt(0)!='-')
		{
			for (int k = 0; k < length; k++)
			{
				digit = myint.charAt(k);
				digitNum = digit-'0';
				sum+=digitNum*Math.pow(10,length-k-1);
			}
		}
		
		else
		{
			for (int k = 1; k < length; k++)
			{
				digit = myint.charAt(k);
				digitNum = digit-'0';
				sum+=digitNum*Math.pow(10,length-k-1);
			}
			sum=sum*(-1);
		}
		return sum;
	}
}