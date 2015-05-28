public class Cat implements Animal
{
	private String sound;
	
	public Cat(String s)
	{
		sound = s;
	}
	
	public void speak()
	{
		System.out.println(sound);
	}
	
	public int compareTo(Object obj)
	{
		Cat c = (Cat)obj;
		return this.sound.length() - c.sound.length();
	}
}