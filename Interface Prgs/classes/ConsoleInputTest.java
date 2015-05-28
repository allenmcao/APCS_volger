import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ConsoleInputTest
{
	public static void main(String[] args)
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(reader);
		
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
		System.out.println("Your input was " + s);
	}
}