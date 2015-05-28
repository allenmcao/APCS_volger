import java.util.List;
import java.util.ArrayList;

/**
   A purse holds a collection of coins.
*/
public class Purse
{
   private List<Coin> coins;

   /**
      Constructs an empty purse.
   */
   public Purse()
   {
      coins = new ArrayList<Coin>();
   }

   /**
      Add a coin to the purse.
      @param aCoin the coin to add
   */
   public void add(Coin aCoin)
   {
      coins.add(aCoin);
   }
   
   /**
    	Returns the coins List
    	@return returns the List containing the coins of the purse
    */
   public List<Coin> getCoins()
   {
   		return coins;
   }

   /**
      Get the total value of the coins in the purse.
      @return the sum of all coin values
   */
   public double getTotal()
   {
      double total = 0;
      for (int i = 0; i < coins.size(); i++)
      {
         Coin aCoin = coins.get(i);
         total = total + aCoin.getValue();       
      }
      return total;
   }
   
   /**
    Reverses the order of the coins in the purse.
    */
   public void reverse()
   {
   	for(int k=0; k<coins.size()/2; k++)
   	{
   		Coin a = coins.get(k);
   		coins.set(k, coins.get(coins.size()-1-k));
   		coins.set(coins.size()-1-k, a);
   	}
   }
   
   /**
    	Transfers the contents of one purse to another.
    	@param purse which contents will be transferred
    */
  public void transfer(Purse b)
  {
  	while(!b.coins.isEmpty())
  	{
  		this.add(b.coins.remove(0));
  	}
  }
   
   /**
    	Checks whether the contents of each purse are identical
    	@return returns true if identical and false if not
   */
   public boolean equals(Object other)
   {
   		Purse b = (Purse)other;
   		Purse c = new Purse();
   		for(int k=0;k<b.getCoins().size();k++)
   			c.add(b.coins.get(k));
   		for(int k=0;k<coins.size();k++)
   		{
   			for(int a=0;a<b.coins.size();a++)
   			{
   				if(!coins.get(a).equals(c.coins.get(a)))
					return false;
				else
					c.coins.remove(a);
					a=b.coins.size()+1;
   			}
				
   		}
   		if(c.coins.isEmpty())
   			return true;
   		else
   			return false;
   }
   
    /**
      Returns the names of all the coins in the purse.
      @return returns all the names in the purse in order.
   */
  public String toString()
   {
   	String s = "Purse[";
   	for (int k = 0; k < coins.size(); k++)
   	{
   		s += coins.get(k);
   		if (k != coins.size() - 1)
   			s += ",";
   	}
   	return s + "]";
   }
   
}

