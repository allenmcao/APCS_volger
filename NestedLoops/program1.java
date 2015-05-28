public class program1
{
	public static void main (String[] args)
	{
		String s = "";
		int rows = 5;
		for (int start = 2; start<=rows; start++)
		{
			for (int ctr = 1; ctr<=5; ctr++)
				s += start*ctr + "\t";
			s += "\n";
		}
		System.out.println(s);
	}
}