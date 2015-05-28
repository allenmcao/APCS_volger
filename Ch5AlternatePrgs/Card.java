public class Card
{
	private String num;
	private String suit;
	private int length;
	private String first;
	private String last;
	
	public Card(String derp)
	{
		length = derp.length();
		first = derp.substring(0,length-1);
		last = derp.substring(length-1);
		
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
	}
	
	public String getDescription()
	{
		return (num + " of " + suit);
	}
}
