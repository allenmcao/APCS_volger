import javax.swing.JOptionPane;

public class program3
{
	public static void main (String[] args)
	{
		String input = JOptionPane.showInputDialog("Enter a whole number between 3 and 10:");
		int side = Integer.parseInt(input);
		while (!(side>=3&&side<=10))
		{
			input = JOptionPane.showInputDialog("Invalid input. Enter a whole number between 3 and 10");
			side = Integer.parseInt(input);
		}
		System.out.println(getDiamond(side));
	}
	
	public static String getDiamond(int n)
	{
		String s = "";
		for (int r = 1; r<=n; r++)
		{
			for (int space = 1; space<=n-r; space++)
			{
				s+=" ";
			}
			
			for (int dollar = 1; dollar<r; dollar++)
			{
				s+="$-";
			}
			s+="$";
			s+="\n";
		}
		
		for (int r = 1; r<n; r++)
		{
			for (int space = 1; space<=r; space++)
			{
				s+=" ";
			}
			
			for (int dollar = 1; dollar<n-r; dollar++)
			{
				s+="$-";
			}
			s+="$";
			s+="\n";
		}
		return s;
	}
}