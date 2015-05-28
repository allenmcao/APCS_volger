public class StudentTester
{
	public static void main (String[]args)
	{
		Student s = new Student("Mary Ott");
		s.addQuiz(100);
		s.addQuiz(90.5);
		s.addQuiz(97);
		System.out.println("Name: " + s.getName());
		System.out.println("Quiz average is " + s.getAverageScore());
	}
}