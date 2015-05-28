public class Grade
{
	private String grade;
	private String quality;
	private double numGrade;
	
	public Grade(String derp)
	{
		grade = derp.substring(0,1);
		quality = derp.substring(1);
		if (grade.equals("A"))
			numGrade = 4.0;
		else if (grade.equals("B"))
			numGrade = 3.0;
		else if (grade.equals("C"))
			numGrade = 2.0;
		else if (grade.equals("D"))
			numGrade = 1.0;
		else
			numGrade = 0.0;
			
		if (quality.equals("+")&& !grade.equals("A") && !grade.equals("F"))
			numGrade += 0.3;
		else if (quality.equals("-")&&!grade.equals("F"))
			numGrade -=0.3;
	}
	
	public double getNumericGrade()
	{
		return numGrade;
	}
}