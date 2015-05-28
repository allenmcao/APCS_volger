public class Student
{
	private String name;
	private double average;
	private int total;
	
	public Student(String n)
	{
		name = n;
		total = 0;
		average = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void addQuiz(double s)
	{
		total++;
		average = ((average)*(total-1)+s)/total;
	}
	
	public double getAverageScore()
	{
		return average;
	}
}