import java.util.List;
import java.util.ArrayList;

public class Hand
{
	private List<Card> hand;
	
	/**
	 Constructs an empty hand.
	 */
	public Hand()
	{
		hand = new ArrayList<Card>();
	}
	
	/**
	 *Adds a card to the hand.
	 *@param the card to add to the hand.
	 */
	public void add(Card h)
	{
		hand.add(h);
	}
	
	/**
	 *Checks whether a card is in the hand or not.
	 *@param the card to find in the hand.
	 *@return returns true if the card is here, false if not.
	 */
	public boolean find(Card c)
	{
		for(int k=0;k<hand.size();k++)
			if(hand.get(k).equals(c))
				return true;
		return false;
	}
	
	/**
	 *Returns the number of cards that match the suit given.
	 *@param the suit which is to be checked.
	 *@return returns the number of cards of the particular suit.
	 */
	public int numCards(String s)
	{
		int ctr=0;
		for(int k = 0;k<hand.size();k++)
			if(hand.get(k).getSuit().equals(s))
				ctr++;
		return ctr;
	}
	
	/**
	 *Finds the card with the smallest value.
	 *@return returns the card with the smallest value.
	 */
	public Card smallestValue()
	{
		Card smallest=hand.get(0);
		for(int k = 1;k<hand.size();k++)
			if(hand.get(k).compareTo(smallest)<0)
				smallest=hand.get(k);
		return smallest;
	}
	
	/**
	 *Returns the cards in the Hand in a readable format.
	 *@return returns the cards in the hand in order with all information.
	 */
	public String toString()
	{
		String s = "";
		for(int k = 0;k<hand.size()-1;k++)
			s+=hand.get(k) + ", ";
		s+=hand.get(hand.size()-1);
		return s;
	}
}