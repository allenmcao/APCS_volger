public class TestPermutationGenerator
{
	public static void main(String[] args)
	{
		PermutationGenerator x = new PermutationGenerator();
		
		for (int k = 0; k < 5; k++)
		{
			System.out.println(x);
			x.nextPermutation();
		}
	}
}