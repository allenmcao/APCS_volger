import javax.swing.JOptionPane;

public class program1
{
	public static void main (String[]args)
	{
		String num;
		String suit;
		String input = JOptionPane.showInputDialog("Enter the card notation");
		int length = input.length();
		String first = input.substring(0,length-1);
		String last = input.substring(length-1);
		
		if (first.equals("A"))
			num = "Ace";
		else if (first.equals("J"))
			num = "Jack";
		else if (first.equals("Q"))
			num = "Queen";
		else if (first.equals("K"))
			num = "King";		
		else
			num = first;
			
		if (last.equals("D"))
			suit = "Diamonds";
		else if (last.equals("H"))
			suit = "Hearts";
		else if (last.equals("S"))
			suit = "Spades";
		else
			suit = "Clubs";
			
		System.out.println(num + " of " + suit);
	}
}