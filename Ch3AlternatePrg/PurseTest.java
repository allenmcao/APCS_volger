import java.text.NumberFormat;

/**
   This program tests the Purse class.
*/
public class PurseTest
{
   public static void main(String[] args)
   {
      Purse myPurse = new Purse();

      myPurse.addNickels(6);
      myPurse.addDimes(15);
      myPurse.addQuarters(2);
      myPurse.addPennies(3);
      
      NumberFormat f = NumberFormat.getCurrencyInstance();

      double totalValue = myPurse.getTotal();
      System.out.print("The total is ");
      System.out.println(f.format(totalValue));
      
      int dollars = myPurse.getDollars();
      System.out.println("Dollars is " + dollars);
      int cents = myPurse.getCents();
      System.out.println("Cents is " + cents);
   }
}
