public class TrueFalseExam
{
	private int id;
	private String results;
	
	/**
	 *Constructs a true-false exam given the ID of a student and their results.
	 */
	public TrueFalseExam(int i, String r)
	{
		id = i;
		results = r;
	}
	
	/**
	 *Returns the ID of the student.
	 *@return returns the ID of the student.
	 */
	public int getID()
	{
		return id;
	}
	
	/**
	 *Returns the results of the student.
	 *@return returns the results of the student.
	 */
	public String getResults()
	{
		return results;
	}
}