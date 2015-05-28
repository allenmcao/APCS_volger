public class GradeTesterFull2
{
	public static void main(String[] args)
	{
		double[] values = {4.0, 3.85, 3.5, 3.15, 2.85, 2.5, 2.15, 1.85, 1.5, 1.15, .85, .5, .15, 0};
		
		for (int k = 0; k < values.length; k++)
		{
			Grade2 g = new Grade2(values[k]);
			System.out.print(values[k]);
			if ((k + 1) % 3 == 0 || k == 0 || k == values.length-1)
				System.out.print("\t");
			System.out.println("\t\t" + g.getLetterGrade());
		}
	}
}