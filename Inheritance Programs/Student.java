public class Student extends Person
{
	private String major;
		
	public Student(String name, int birthday, String m)
	{
		super(name,birthday);
		major = m;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	public String toString()
	{
		return super.toString() + " majoring in " + major;
	}
	
	public boolean equals(Student s)
	{
		if (s.getName().equals(this.getName())&&s.getMajor().equals(this.getMajor())&&s.getYearOfBirth() == this.getYearOfBirth())
			return true;
		else
			return false;
	}
}