public class TestPeople
{
	public static void main(String args[])
	{
		Person p = new Person("Jesse James", 1847);
		System.out.println(p);
		System.out.println(p.getClass());
		System.out.println(p.getName() + " " + p.getYearOfBirth() + "\n");
		                   
		Student s = new Student("Wille Mays" , 1931, "Baseball");
		System.out.println(s);
		System.out.println(s.getClass());
		System.out.println(s.getName() + " " + s.getYearOfBirth() + " " +
		                   s.getMajor() + "\n");
		
		Instructor i = new Instructor("Mary Ott", 1955, 85000);
		System.out.println(i);
		System.out.println(i.getClass());
		System.out.println(i.getName() + " " + i.getYearOfBirth() + " " +
		                   i.getSalary() + "\n");
		                   
		System.out.println("\n");
		
		p = s;
		System.out.println(p);
		System.out.println(p.getClass());
		System.out.println(p.getName() + " " + p.getYearOfBirth() + " " +
		                   ((Student)p).getMajor() + "\n");
		p = i;
		System.out.println(p);
		System.out.println(p.getClass());
		System.out.println(p.getName() + " " + p.getYearOfBirth() + " " +
		                   ((Instructor)p).getSalary() + "\n");
		
		if (p.equals(s))
			System.out.println(p.getName() + " and " + s.getName() + " are the same.");
		else
			System.out.println(p.getName() + " and " + s.getName() + " are different.");
		
		String name = "Mary Ott1";
		name = name.substring(0,name.length()-1);
		Instructor sister = new Instructor(name, 1955, 65000);
		if (p.equals(sister))
			System.out.println(p.getName() + " and " + sister.getName() + " are the same.");
		else
			System.out.println(p.getName() + " and " + sister.getName() + " are different.");
	}
}
