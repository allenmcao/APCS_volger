public class TestStorage
{
	public static void main(String[] args)
	{
		Storage nums = new Storage(10);
		
		System.out.println(nums.getAverage());
		System.out.println(nums.aboveAverage());
	}
}