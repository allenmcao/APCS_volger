import javax.swing.JOptionPane;
import java.util.StringTokenizer;
import java.lang.Exception;

public class TheMapDriver
{
	public static void main(String[] args)
	{
		TheMap m = new TheMap(4, 4);
		System.out.println(m);
		int row = 0, col = 0;
		boolean ok;
		do {
			ok = true;
			String s = JOptionPane.showInputDialog("Enter starting water location (r,c)");
			StringTokenizer st = new StringTokenizer(s,",");
			try {
				row = Integer.parseInt(st.nextToken());
				col  = Integer.parseInt(st.nextToken());
			} catch (Exception e)
			{
				JOptionPane.showMessageDialog(null, "Bad input");
				ok = false;
			}
		} while (!ok);
		if (m.canFlowOffMap(row, col))
			JOptionPane.showMessageDialog(null,"Water flowed off map from (" + row + ", " + col + ")");
		else
			JOptionPane.showMessageDialog(null,"Water could not flow off map from (" + row + ", " + col + ")");
		System.exit(0);	
	}

/**
 *	Test the program on the 4x4 map first with the following inputs:
 *	1,2
 *	2,1
 *	2,2
 *	3,2
 *
 *	Test the rogram on the 10x10 with the following inputs:
 *	2,2
 *	3,0
 *	0,3
 *	3,1
 *	6,1
 */
}