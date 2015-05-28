/**
   A purse computes the total value of a collection of coins.
*/
public class Purse
{

   private static final double NICKEL_VALUE = 0.05;
   private static final double DIME_VALUE = 0.1;
   private static final double QUARTER_VALUE = 0.25;
   private static final double PENNIE_VALUE = 0.01;
   
   private static final int NICKEL_PENNIES = 5;
   private static final int DIME_PENNIES = 10;
   private static final int QUARTER_PENNIES = 25;
   private static final int PENNIE_PENNIES = 1;

   private int nickels;
   private int dimes;
   private int quarters;
   private int pennies;

   /**
      Constructs an empty purse.
   */
   public Purse()
   {
      nickels = 0;
      dimes = 0;
      quarters = 0;
      pennies = 0;
   }

   /**
      Add nickels to the purse.
      @param count the number of nickels to add
   */
   public void addNickels(int count)
   {
      nickels = nickels + count;
   }

   /**
      Add dimes to the purse.
      @param count the number of dimes to add
   */
   public void addDimes(int count)
   {
      dimes = dimes + count;
   }

   /**
      Add quarters to the purse.
      @param count the number of quarters to add
   */
   public void addQuarters(int count)
   {
      quarters = quarters + count;
   }

   /**
      Get the total value of the coins in the purse.
      @return the sum of all coin values
   */
   
   public void addPennies(int count)
   {
   	pennies = pennies + count;
   }
   
   public double getTotal()
   {
      return nickels * NICKEL_VALUE 
         + dimes * DIME_VALUE + quarters * QUARTER_VALUE + pennies * PENNIE_VALUE;
   }
   
   public int getDollars()
   {
   	return (nickels * NICKEL_PENNIES 
         + dimes * DIME_PENNIES + quarters * QUARTER_PENNIES + pennies * PENNIE_PENNIES)/100;
   }
   
   public int getCents()
   {
   	return(nickels * NICKEL_PENNIES 
         + dimes * DIME_PENNIES + quarters * QUARTER_PENNIES + pennies * PENNIE_PENNIES)%100;
   }
}



