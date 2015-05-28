import java.util.List;
import java.util.ArrayList;

public class ExamEvaluator
{
	private String key;
	private List<TrueFalseExam> students;
	
	/**
	 *Creates an ExamEvaluator object with the answer key for the true-false exam.
	 */
	public ExamEvaluator(String s)
	{
		key = s;
		students = new ArrayList<TrueFalseExam>();
	}
	
	/**
	 *Adds an exam result.
	 */
	public void add(TrueFalseExam t)
	{
		students.add(t);
	}
	
	/**
	 *Returns a string containing two columns with headers.  The first 
	 *column contains the Student Identification, the second column
	 *contains their true-false answers.
	 *@return returns a string with the student information in two columns.
	 */
	public String toString()
	{
		String s = "";
		for(int k = 0; k<students.size();k++)
			s+= (students.get(k).getID()+ "\t\t" + students.get(k).getResults() + "\n");
		return s;
	}
	
	/**
	 *Prints a three-column table that displays the student's ID number, the
	 *score, and the grade for each student.
	 */
	public void showGrades()
	{
		String s = "";
		int tempscore=0;
		int bestscore;
		
		for(int a = 0; a<students.get(0).getResults().length();a++)
			if(students.get(0).getResults().charAt(a)==key.charAt(a))
				tempscore++;
		bestscore=tempscore;
		
		for(int k =1; k<students.size();k++)
		{
			tempscore=0;
			for(int a = 0; a<students.get(k).getResults().length();a++)
				if(students.get(k).getResults().charAt(a)==key.charAt(a))
					tempscore++;
			if(tempscore>bestscore)
				bestscore=tempscore;
		}
		
		for(int k = 0; k<students.size();k++)
		{		
			s+=students.get(k).getID()+"\t\t";
			tempscore=0;
			for(int a = 0; a<students.get(k).getResults().length();a++)
				if(students.get(k).getResults().charAt(a)==key.charAt(a))
					tempscore++;
			s+=tempscore + "\t\t";
			if(bestscore-tempscore<=1)
				s+="A\n";
			else if(bestscore-tempscore==2)
				s+="B\n";
			else if(bestscore-tempscore<=4)
				s+="C\n";
			else if(bestscore-tempscore==5)
				s+="D\n";
			else
				s+="F\n";
		}
		
		System.out.println(s);
	}
}