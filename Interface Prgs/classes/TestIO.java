import java.io.IOException;

public class TestIO
{
	public static void main(String[] args)
	{
		// Comment out one of the two lines below.
		//InputReader r = new OptionPaneReader();
		InputReader r = new ConsoleReader();
		
		try
		{
			System.out.println(r.readLine("Please enter a line of text"));
		}
		catch (IOException e)
		{
			System.out.println(e);
		}

		try
		{
			System.out.println(r.readInt("Please enter an integer value"));
		}
		catch (IOException e)
		{
			System.out.println(e);
		}

		try
		{
			System.out.println(r.readDouble("Please enter a real value"));
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		
		System.exit(0);
	}
}