public class Calculator
{
	public static int add(int a, int b) throws IllegalArgumentException
	{
		if(a>0&&b>0)
			return a+b;
		else
			throw new IllegalArgumentException();
	}
	
	public static int minus(int a, int b) throws DontLikeParameterException
	{
		if (a>=b)
			return a-b;
		else
			throw new DontLikeParameterException(a + " must be larger than " + b);
	}
}