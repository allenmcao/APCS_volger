import java.text.NumberFormat;

/**
   A purse computes the total value of a collection of coins.
*/

public class PurseProgram
{
   private static final double PENNY_VALUE = 0.01;
   private static final double NICKEL_VALUE = 0.05;
   private static final double DIME_VALUE = 0.1;
   private static final double QUARTER_VALUE = 0.25;
   private static final int PENNIES_PER_PENNY = 1;
   private static final int PENNIES_PER_NICKEL = 5;
   private static final int PENNIES_PER_DIME = 10;
   private static final int PENNIES_PER_QUARTER = 25;
   private static final int PENNIES_PER_DOLLAR = 100;
   
   public static void main(String[] args)
   {
		int pennies;
		int nickels;
		int dimes;
		int quarters;
		double totalDollars;
		int totalCents;
		int dollars;
		int cents;
		
		pennies = 9;
		nickels = 6;
		dimes =16;
		quarters = 404;
		
		// Compute the total amount of money in the purse in terms of dollars
		totalDollars = (pennies*PENNIES_PER_PENNY + nickels*PENNIES_PER_NICKEL + dimes*PENNIES_PER_DIME + quarters*PENNIES_PER_QUARTER)/100;
		
		// Compute the total amount of money in the purse in terms of pennies
		totalCents = pennies*PENNIES_PER_PENNY + nickels*PENNIES_PER_NICKEL + dimes*PENNIES_PER_DIME + quarters*PENNIES_PER_QUARTER;
		
		// Compute the number of dollars of the amount in the purse
		// (e.g. if the total amount is $45.23 then the computed dollars is 45)
		// Use only int variable(s) and integer arithmetic
		dollars = totalCents/100;

		// Compute the number of cents of the amount in the purse
		// (e.g. if the total amount is $45.23 then the computed cents is 23)
		// Use only int variable(s) and integer arithmetic
		cents = totalCents % 100;
		
		NumberFormat f = NumberFormat.getCurrencyInstance();
		
		System.out.print("The total dollars is ");
		System.out.println(f.format(totalDollars));
		
		System.out.print("The total cents is ");
		System.out.println(totalCents);
		
		System.out.println("Dollars = " + dollars);
		System.out.println("Cents = " + cents);
   }

}

