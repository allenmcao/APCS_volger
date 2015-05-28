public class Frog implements Animal
{
	private String sound;
	
	public Frog(String s)
	{
		sound = s;
	}
	
	public void speak()
	{
		System.out.println(sound);
	}
	
	public int compareTo(Object o)
	{
		int flength = 0;
		Frog f = (Frog)o;
		for (int c = 0; c<f.sound.length(); c++)
		{
			if (f.sound.charAt(c)=='!')
			{
				flength++;
			}
		}
		int thislength = 0;
		for (int ctr = 0; ctr<this.sound.length(); ctr++)
		{
			if (sound.charAt(ctr)=='!')
			{
				thislength++;
			}
		}
		return thislength - flength;
	}
}