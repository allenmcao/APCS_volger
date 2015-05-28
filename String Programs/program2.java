import javax.swing.JOptionPane;

public class program2
{
	public static void main (String[]args)
	{
		String name;
		name = JOptionPane.showInputDialog("Enter your name");
		String firstInitial = name.substring(0,1);
		int space = name.indexOf(" ");
		String lastInitial = name.substring(space + 1, space + 2);
		System.out.println(firstInitial + lastInitial);
	}
}