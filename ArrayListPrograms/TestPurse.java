public class TestPurse
{
	public static void main(String args[])
	{
		// Create and display an Purse
		Coin quarter = new Coin(0.25, "Quarter");
		Coin dime = new Coin(0.10, "Dime");
		Coin nickel = new Coin(0.05, "Nickel");
		Coin penny = new Coin(0.01, "Penny");
		Purse p1 = new Purse();
		p1.add(quarter);
		p1.add(dime);
		p1.add(nickel);
		p1.add(dime);
		System.out.println("Original " + p1);
		
		// Reverse the contents of an Purse
		p1.reverse();
		System.out.println("After reverse " + p1 + "\n");
		
		
		// Transfer the contents of a Purse to another Purse
		p1.reverse();
		Purse p2 = new Purse();
		p2.add(dime);
		p2.add(nickel);
		System.out.println("New purse before switch " + p2);
		System.out.println("Original before switch " + p1);
		p1.transfer(p2);
		System.out.println("New purse after switch  " + p2);
		System.out.println("Original after switch " + p1 + "\n");

		// Check to see if two Purses have the same coins in the same order
		// Test #1
		System.out.println("\n********** Test #1 **********");
		p1 = new Purse();
		p1.add(quarter);
		p1.add(dime);
		p1.add(nickel);
		p1.add(dime);
		System.out.println("Original p1 " + p1);
		p2 = new Purse();
		p2.add(quarter);
		p2.add(dime);
		p2.add(nickel);
		p2.add(dime);
		System.out.println("Original p2 " + p2);
		if (p1.equals(p2))
			System.out.println("The purses are identical");
		else
			System.out.println("The purses are not identical");
		// Test #2
		System.out.println("\n********** Test #2 **********");
		p2.add(dime);
		System.out.println("Original p1 " + p1);
		System.out.println("Original p2 " + p2);
		if (p1.equals(p2))
			System.out.println("The purses are identical");
		else
			System.out.println("The purses are not identical");
		// Test #3
		System.out.println("\n********** Test #3 **********");
		p1.add(dime);
		p1.add(dime);
		System.out.println("Original p1 " + p1);
		System.out.println("Original p2 " + p2);
		if (p1.equals(p2))
			System.out.println("The purses are identical");
		else
			System.out.println("The purses are not identical");
		// Test #4
		System.out.println("\n********** Test #4 **********");
		Purse p3 = new Purse();
		p3.add(quarter);
		p3.add(dime);
		p3.add(nickel);
		p3.add(dime);
		p3.add(dime);
		p3.add(penny);
		System.out.println("Original p1 " + p1);
		System.out.println("Original p3 " + p3);
		if (p1.equals(p3))
			System.out.println("The purses are identical");
		else
			System.out.println("The purses are not identical");
		System.out.println();
		
		// Check to see if two Purses have the same coins in the any order
		System.out.println("\n*** Extra credit ***");
		System.out.println("Original p1 " + p1);
		p2.reverse();
		p2.add(dime);
		System.out.println("Original p2 " + p2);
		if (p1.equals(p2))
			System.out.println("The purses have the same coins");
		else
			System.out.println("The purses do not have the same coins");
		p1 = new Purse();
		p2 = new Purse();
		p1.add(dime);
		p1.add(quarter);
		p1.add(dime);
		p2.add(dime);
		p2.add(dime);
		p2.add(nickel);
		System.out.println("Original p1 " + p1);
		System.out.println("Original p2 " + p2);
		if (p1.equals(p2))
			System.out.println("The purses have the same coins");
		else
			System.out.println("The purses do not have the same coins");
		p1 = new Purse();
		p2 = new Purse();
		p1.add(dime);
		p1.add(quarter);
		p1.add(dime);
		p2.add(dime);
		p2.add(dime);
		p2.add(quarter);
		System.out.println("Original p1 " + p1);
		System.out.println("Original p2 " + p2);
		if (p1.equals(p2))
			System.out.println("The purses have the same coins");
		else
			System.out.println("The purses do not have the same coins");
	}
}
