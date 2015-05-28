public class Chp6Loop2
{
	// Create your constant here.  Make sure it is static
	private static int NUM_TRIALS = 10;
	
	public static void main(String[] args)
	{
		// Place all of your code in the main body.
		// There are no static methods to write.
		int currentHeadRun = 0;
		int currentTailRun = 0;
		int maxHeadRun = 0;
		int maxTailRun = 0;

		int ctr = 0;
		int coin = 0;
		
		while (ctr<NUM_TRIALS)
		{
			coin = (int)(Math.random()*2);
			if (coin==0 && currentTailRun==0)
			{
				System.out.print("H");
				currentHeadRun++;
				maxHeadRun = currentHeadRun;
			}
			if (coin ==1 && currentHeadRun == 0)
			{
				System.out.print("T");
				currentTailRun++;
				maxTailRun = currentTailRun;
			}
			if (coin == 0 && currentTailRun!=0)
			{
				System.out.print("H");
				currentHeadRun=1;
				currentTailRun=0;
			}
			if (coin == 1 && currentHeadRun!=0)
			{
				System.out.print("T");
				currentTailRun=1;
				currentHeadRun=0;
			}
			ctr++;
		}
		System.out.println("");
		System.out.println("Max head run is " + maxHeadRun);
		System.out.println("Max tail run is " + maxTailRun);
	}
}