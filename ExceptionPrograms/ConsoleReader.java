/**
 *	Creates a class that can read input from the console and turn
 *	the input into an input value.
 */
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleReader
{
	private BufferedReader in;
	
	/**
	 *	Creates the object to read from the console input (System.in)
	 */
	public ConsoleReader()
	{
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	/**
	 *	Returns an integer value enter on the console
	 *	@return returns an int enter on the console
	 *	@exception throws an IOException if any non-integer value is entered
	 */
	public int readInt() throws IOException
	{
		String input;
		
		// readLine throws a checked IOException
		input = in.readLine();
		
		// parseInt could throw an unchecked NumberFormatException 
		return Integer.parseInt(input);
	}
}