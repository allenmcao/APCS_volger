import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class SDSCAssignment
{
	public static void main (String[]args)
	{
		String input = JOptionPane.showInputDialog("Enter a string");
		String patt = JOptionPane.showInputDialog("Enter a pattern");
		List a = findMatches(input, patt);
		System.out.println(a);
	}

	public static List<Integer> findMatches(String i, String patt)
	{
		List<Integer> matches = new ArrayList();
		for(int k = 0; k<i.length()-patt.length()+1; k++)
		{
			int n = 0;
			while(n<patt.length()&&patt.substring(n, n+1).equals(i.substring(k+n, k+n+1)))
				n++;
			if(n>=patt.length())
				matches.add(k);
		}
		return matches;
	}
}