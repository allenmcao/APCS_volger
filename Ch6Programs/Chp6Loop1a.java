public class Chp6Loop1a
{
	public static void main(String[] args)
	{
		boolean  correct = true;
		int num = 1;
		int check = 1;
		while (num < 20)
		{
			int ctr = 1;
			while (ctr < num)
			{
				System.out.print(ctr + " + ");
				ctr += 2;
			}
			System.out.println(ctr + " = " + sumOdd(1,num));
			correct = correct && sumOdd(1,num) == (check * check);
			check++;
			num += 2;
		}
		
		System.out.println("Sum of 5 to 15 should be 60.  Your result is " + sumOdd(5, 15));
		correct = correct && sumOdd(5, 15) == 60;
		if (correct)
			System.out.println("Your program works!!");
		else
			System.out.println("Not correct - check your code.");
	}
	
	/**
		Returns the sum of the odd integers from smallest to largest
		@param smallest the smaller of the two odd numbers
		@param largest the larger of the two odd numbers
		@precondtion smallest & largest are odd and smallest <= largest
		@return returns the sum of all odd numbers from smallest to largest
	*/
	public static int sumOdd(int smallest, int largest)
	{
		// Write your code here
		int diff = largest - smallest;
		int sum = 0;
		int ctr = 0;
		while (ctr <=diff/2)
		{
			sum += smallest;
			smallest += 2;
			ctr++;
		}
		return sum;
	}
}