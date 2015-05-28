public class FibonacciTester
{
	public static void main(String[] args)
	{
		int[] results = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155};

		long start;
		long stop;
		long total;
		start = System.currentTimeMillis();
		boolean itWorks = true;
		for (int k = 1; k <= 40; k++)
		{
			if (fib(k) != results[k-1])
				itWorks = false;
		}
		stop = System.currentTimeMillis();
		total = stop - start;
		if (itWorks)
			System.out.println("Your Fibonacci algorithm worked in " + total + " milliseconds");
		else
			System.out.println("Doesn't work");	

	}
	
	/**
	 *	Computers the nth Fibonacci term
	 *	@param n the nth term to computer
	 *	@precondition n is positive
	 *	@return returns the nth Fibonacci term
	 */
	public static int fib(int n)
	{
		 // Place your code here
		 if (n<=2)
		 	return 1;
		 else
		 {
		 	return (fib(n-1)+fib(n-2));
		 }
	}
}
