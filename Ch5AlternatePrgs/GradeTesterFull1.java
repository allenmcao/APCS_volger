import java.util.StringTokenizer;

public class GradeTesterFull1
{
	public static void main(String[] args)
	{
		String gradeList = "A+,A,A-,B+,B,B-,C+,C,C-,D+,D,D-,F+,F,F-";
		
		StringTokenizer st = new StringTokenizer(gradeList,",");
		
		while (st.hasMoreTokens())
		{
			String grade = st.nextToken();
			Grade g = new Grade(grade);
			double gradeValue = g.getNumericGrade();
			System.out.println(grade + "\t\t" + gradeValue);
		}
	}
}