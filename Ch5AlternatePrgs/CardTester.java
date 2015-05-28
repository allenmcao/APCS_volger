import javax.swing.JOptionPane;

public class CardTester
{
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("Enter the card notation");
		Card c = new Card(input);
		System.out.println(c.getDescription());
		System.exit(0);
	}
}