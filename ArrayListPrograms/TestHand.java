public class TestHand
{
	public static void main(String[] args)
	{
			Hand h = new Hand();
			Card ac = new Card("Ace", "Clubs");
			Card as = new Card("Ace", "Spades");
			Card ad = new Card("Ace", "Diamonds");
			Card ah = new Card("Ace", "Hearts");
			Card td = new Card("Three", "Diamonds");
			Card fh = new Card("Four", "Hearts");
			h.add(fh);
			h.add(td);
			h.add(ac);
			h.add(as);
			h.add(ah);
			System.out.println(h);
			
			if (h.find(ad))
				System.out.println("Found " + ad);
			else
				System.out.println("Didn't find " + ad);
			if (h.find(ah))
				System.out.println("Found " + ah);
			else
				System.out.println("Didn't find " + ah);
				
			System.out.println("\n" + "There are " + h.numCards("Hearts") +
			                   " hearts in the hand.");
			                   
			System.out.println("\nThe smallest card value in the hand is " +
			                   h.smallestValue());
	}
}