public class Instructor extends Person
{
	private double salary;
	
	public Instructor(String n, int b, double s)
	{
		super(n,b);
		salary = s;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		return super.toString() + " making " + salary + " a year";
	}
	
	public boolean equals(Instructor s)
	{
		if (s.getName().equals(this.getName())&&s.getSalary()==this.getSalary()&&s.getYearOfBirth() == this.getYearOfBirth())
			return true;
		else
			return false;
	}
}