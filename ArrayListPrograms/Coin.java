/**
   A coin with a monetary value.
*/
public class Coin
{
   private double value;
   private String name;

  /**
      Constructs a coin.
      @param aValue the monetary value of the coin.
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName) 
   { 
      value = aValue; 
      name = aName;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue() 
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName() 
   {
      return name;
   }

   /**
      Determines if two cois are exactly the same.
      @return returns true if the value and names of the
               two coins are the same.
   */
   public boolean equals(Object otherObject)
   {  
      Coin other = (Coin)otherObject;
      return name.equals(other.name) 
         && value == other.value; 
   }
   
   /**
      Returns the name of the coin.
      @return returns the name of the coin.
   */
   public String toString()
   {
   	return name;
   }
}
