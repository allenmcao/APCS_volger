import javax.swing.JOptionPane;
import java.io.IOException;

public class OptionPaneReader implements InputReader
{
	public String readLine(String prompt) throws IOException
	{
		String s = JOptionPane.showInputDialog(prompt);
		if (s == null || s.equals(""))
			throw new IOException("Nothing was passed");
		return s;
	}
	
	public int readInt(String prompt) throws IOException
	{
		String s = JOptionPane.showInputDialog(prompt);
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
		String s = JOptionPane.showInputDialog(prompt);
		try {
			return Double.parseDouble(s);
		}
		catch (Exception e)
		{
			throw new IOException("Double not passed");
		}
	}
}