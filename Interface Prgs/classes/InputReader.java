import java.io.IOException;

public interface InputReader
{
	/**
	 *	This method returns the line of text.  
	 *	An exception is thrown if
	 *	no input is entered or the input device is closed.
	 *	@param prompt the prompt for the input
	 *	@return returns the string entered
	 *	@throws throws exception if no input is entered or input device is closed
	 */
	String readLine(String prompt) throws IOException;

	/**
	 *	This method returns the integer value entered.
	 *	An exception is thrown if
	 *	no input is entered or the input device
	 *	window is closed, or a non-integer is entered.
	 *	@param prompt the prompt for the input
	 *	@return returns the integer value entered
	 *	@throws throws exception if no input is entered or input device is closed
	 *			or the input entered is not an integer
	 */
	int readInt(String prompt) throws IOException;

	/**
	 *	This method returns the double value entered.  
	 *	An exception is thrown if
	 *	no input is entered or the input device
	 *	window is closed, or a non-numeric value is entered.
	 *	@param prompt the prompt for the JOptionPane window
	 *	@return returns the double value entered
	 *	@throws throws exception if no input is entered or input device is closed
	 *			or the input entered is not a numeric value
	 */
	double readDouble(String prompt) throws IOException;
}