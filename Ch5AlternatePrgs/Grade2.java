public class Grade2
{
	private double grade;
	
	
	public Grade2(double derp)
	{
		grade = derp;
	}
	
	public String getLetterGrade()
	{
		if (grade >= 3.85)
			return "A";
		else if (grade >= 3.5)
			return "A-";
		else if (grade >= 3.15)
			return "B+";
		else if (grade >= 2.85)
			return "B";
		else if (grade >= 2.5)
			return "B-";
		else if (grade >= 2.15)
			return "C+";
		else if (grade >= 1.85)
			return "C";
		else if (grade >= 1.5)
			return "C-";
		else if (grade >= 1.15)
			return "D+";
		else if (grade >= 0.85)
			return "D";
		else if (grade >= 0.5)
			return "D-";
		else
			return "F";
	}
}