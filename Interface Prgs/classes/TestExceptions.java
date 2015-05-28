public class TestExceptions
{
	public static void main(String[] args)
	{
		try {
			System.out.println(checkForInteger("3"));
		} catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static int checkForInteger(String s) throws Exception
	{
		// If no string object is passed or
		// the string object passed is empty thow an exception.
		if (s == null || s.equals(""))
			throw new Exception("Nothing was passed");
		try {
			// The Integer.parseInt method will throw an exception
			// if the string parameter is not a valid integer.
			return Integer.parseInt(s);
		}
		// Here we catch the exception thrown by the Integer.parseInt method
		catch (Exception e)
		{
			// Now let's throw our own method.
			throw new Exception("Integer not passed");
		}
	}
}