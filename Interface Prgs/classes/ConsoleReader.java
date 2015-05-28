import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ConsoleReader implements InputReader
{
	private static InputStreamReader reader = new InputStreamReader(System.in);
	private static BufferedReader console = new BufferedReader(reader);
	
	public String readLine(String prompt) throws IOException
	{	
		System.out.print("Enter text: ");
		String s = "";
		try
		{
			s = console.readLine();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		if (s == null)
			throw new IOException("Nothing was passed");
		if (s.equals(""))
		{
			throw new IOException("Nothing was passed");
		}
		return s;
	}
	
	public int readInt(String prompt) throws IOException
	{
		System.out.print("Enter an integer: ");
		String s = "";
		if (s == null)
			throw new IOException("Nothing was passed");
		try
		{
			s = console.readLine();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		if (s.equals(""))
		{
			throw new IOException("Nothing was passed");
		}
		try {
			return Integer.parseInt(s);
		}
		catch (Exception e)
		{
			throw new IOException("Integer not passed");
		}
	}
	
	public double readDouble(String prompt) throws IOException
	{
		System.out.print("Enter a real value: ");
		String s = "";
		if (s == null)
			throw new IOException("Nothing was passed");
		try
		{
			s = console.readLine();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		if (s.equals(""))
		{
			throw new IOException("Nothing was passed");
		}
		try {
			return Double.parseDouble(s);
		}
		catch (Exception e)
		{
			throw new IOException("Double not passed");
		}
	}
}