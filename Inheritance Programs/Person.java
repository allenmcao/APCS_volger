public class Person
{
	private String name;
	private int birthday;
	
	public Person()
	{
		name = "";
		birthday = 0;
	}
	
	public Person(String n, int b)
	{
		name = n;
		birthday = b;
	}
	
	public boolean equals(Person p)
	{
		if (p.name.equals(this.name)&&p.birthday==this.birthday)
			return true;
		else
			return false;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getYearOfBirth()
	{
		return birthday;
	}
	
	public String toString()
	{
		return name + " born in the year " + birthday;
	}
}