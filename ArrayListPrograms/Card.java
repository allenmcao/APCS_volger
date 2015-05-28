public class Card implements Comparable<Card>
{
	private String faceValue;
	private String suit;
	
     /**
     	Creates a card with a value and name
     	@param theFaceValue is the face value of the card to create.
     	@param theSuit is the card's suit of the card to create.
     */
	public Card(String theFaceValue, String theSuit)
	{
		faceValue = theFaceValue;
		suit = theSuit;
	}
	
     /**
     	Returns the face value of the card.
     	@return returns the face value of the card.
     */
	public String getFaceValue()
	{
		return faceValue;
	}
	
     /**
     	Returns the suit of the card.
     	@return returns the suit of the card.
     */
	public String getSuit()
	{
		return suit;
	}
	
     /**
     	Returns face value and suit of the card.
     	@return returns face value and suit of the card.
     */
	public String toString()
	{
		return faceValue + " of " + suit;
	}
	
     /**
     	Returns true if the two cards are identical.
     	@param other the other card to compare this card to.
     	@return returns true if teh two cards have the same face value
     	        and the same suit, otherwise returns false.
     */
	public boolean equals(Object other)
	{
		Card c = (Card) other;
		return faceValue.equals(c.faceValue) &&
		       suit.equals(c.suit);
	}
	
     /**
     	Returns -1 if the this card is less than the card value passed,
     	        +1 if this card is greater than the card value passed,
     	        0 is the cards have the same value.
     	@param other the other card to compare this card to.
     	@return returns -1 if the this card is less than the card value passed,
     	        +1 if this card is greater than the card value passed,
     	        0 is the cards have the same value.
     */
	public int compareTo(Card c)
	{
		if (cardValue() < c.cardValue())
			return -1;
		if (cardValue() > c.cardValue())
			return 1;
		return 0;
	}
	
     /**
     	Returns the card value of the card.
     	@return returns the card value of the card.
     */
	private int cardValue()
	{
		if (faceValue.equalsIgnoreCase("Ace"))
			return 13;
		if (faceValue.equalsIgnoreCase("King"))
			return 12;
		if (faceValue.equalsIgnoreCase("Queen"))
			return 11;
		if (faceValue.equalsIgnoreCase("Jack"))
			return 10;
		if (faceValue.equalsIgnoreCase("Ten"))
			return 9;
		if (faceValue.equalsIgnoreCase("Nine"))
			return 8;
		if (faceValue.equalsIgnoreCase("Eight"))
			return 7;
		if (faceValue.equalsIgnoreCase("Seven"))
			return 6;
		if (faceValue.equalsIgnoreCase("Six"))
			return 5;
		if (faceValue.equalsIgnoreCase("Five"))
			return 4;
		if (faceValue.equalsIgnoreCase("Four"))
			return 3;
		if (faceValue.equalsIgnoreCase("Three"))
			return 2;
		if (faceValue.equalsIgnoreCase("Two"))
			return 1;
		return -1;
	}
}